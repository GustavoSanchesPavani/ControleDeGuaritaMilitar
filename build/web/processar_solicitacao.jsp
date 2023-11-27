<%@ page import="java.sql.*" %>

<%
    try {
        // Carregar o driver JDBC
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        // Estabelecer a conex�o com o banco de dados
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/soldiers?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
        
        // Criar uma instru��o SQL
        Statement stmt = conn.createStatement();
        
        // Obter par�metros da solicita��o
        String idSolicitacao = request.getParameter("id_solicitacao");
        String acao = request.getParameter("acao");
        
        if (acao.equals("aceitar")) {
            // L�gica para aceitar a solicita��o
            
            // Atualizar o status_solicitacao para "Aceita" na tabela troca_horario
            String updateQuery = "UPDATE troca_horario SET status_solicitacao = 'Aceita' WHERE id_usuario_solicitante = " + idSolicitacao;
            stmt.executeUpdate(updateQuery);
            
            // Obter os detalhes da solicita��o
            String selectQuery = "SELECT * FROM troca_horario WHERE id_usuario_solicitante = " + idSolicitacao;
            ResultSet rs = stmt.executeQuery(selectQuery);
            
            if (rs.next()) {
                String idUsuarioSolicitante = rs.getString("id_usuario_solicitante");
                String idUsuarioDestinatario = rs.getString("id_usuario_destinatario");
                
                // Obter e trocar as datas na tabela escala_guarda
                String updateEscalaQuery = "UPDATE escala_guarda SET id_usuario = CASE WHEN id_usuario = " + idUsuarioSolicitante + " THEN " + idUsuarioDestinatario + " ELSE " + idUsuarioSolicitante + " END WHERE id_usuario IN (" + idUsuarioSolicitante + ", " + idUsuarioDestinatario + ")";
                stmt.executeUpdate(updateEscalaQuery);
                
                // Excluir a entrada da tabela troca_horario ap�s aceitar
                String deleteQuery = "DELETE FROM troca_horario WHERE id_usuario_solicitante = " + idUsuarioSolicitante;
                stmt.executeUpdate(deleteQuery);
            }
            
            rs.close();
        } else if (acao.equals("recusar")) {
            // L�gica para recusar a solicita��o
            
            // Atualizar o status_solicitacao para "Recusada" na tabela troca_horario
            String updateQuery = "UPDATE troca_horario SET status_solicitacao = 'Recusada' WHERE id_usuario_solicitante = " + idSolicitacao;
            stmt.executeUpdate(updateQuery);
            
            // Excluir a entrada da tabela troca_horario ap�s recusar
            String deleteQuery = "DELETE FROM troca_horario WHERE id_usuario_solicitante = " + idSolicitacao;
            stmt.executeUpdate(deleteQuery);
        }
        
        // Fechar a instru��o e a conex�o
        stmt.close();
        conn.close();
        
        // Redirecionar de volta para a p�gina anterior ou outra p�gina desejada ap�s o processamento
        response.sendRedirect("painel.jsp");
    } catch (Exception e) {
        // Imprimir rastreamento de pilha em caso de exce��o
        e.printStackTrace();
    }
%>
