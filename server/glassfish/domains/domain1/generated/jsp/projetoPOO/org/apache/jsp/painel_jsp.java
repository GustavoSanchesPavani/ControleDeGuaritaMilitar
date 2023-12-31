package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import java.sql.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class painel_jsp extends org.glassfish.wasp.runtime.HttpJspBase
    implements org.glassfish.wasp.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      response.setHeader("X-Powered-By", "JSP/3.0");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Painel do Usuário</title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://cdn.datatables.net/1.13.6/css/dataTables.bootstrap5.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css\" integrity=\"sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("        <style>.edit-icon {\n");
      out.write("                color: blue;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .delete-icon {\n");
      out.write("                color: red;\n");
      out.write("            }\n");
      out.write("            .icon-button {\n");
      out.write("                cursor: pointer;\n");
      out.write("                transition: color 0.2s;\n");
      out.write("            }\n");
      out.write("            .move-left {\n");
      out.write("                margin-right: 80px; /* Ajuste conforme necessário */\n");
      out.write("            }\n");
      out.write("            .bg-successs{\n");
      out.write("                background-color:  #0b1c18;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            body {\n");
      out.write("                background-image: url('imagens/fundo.jpg');\n");
      out.write("                background-size: cover;\n");
      out.write("                background-position: center;\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-attachment: fixed; /* Isso impede que a imagem de fundo role com a página */\n");
      out.write("            }\n");
      out.write("            .active>.page-link, .page-link.active {\n");
      out.write("                background-color:  #198754;\n");
      out.write("            }\n");
      out.write("            .form-text {\n");
      out.write("                color: lightgrey;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            /* Seus estilos existentes aqui */\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");

     String nomeUsuario = (String) session.getAttribute("nomeUsuario");
     if (nomeUsuario != null) {
     String nomePatente = (String) session.getAttribute("nm_patente");
     int usuarioID = (int) session.getAttribute("idUsuario");
         
 

     // Adicionando as demais informações
     int idadeUsuario = (int) session.getAttribute("cd_idade");
         
     String dataNas = (String) session.getAttribute("dt_dataNascimento");
         
     String nomeGuerra = (String) session.getAttribute("nm_guerra");
         
     String usLogin = (String) session.getAttribute("nm_usuarioLogin");
         
     String usSenha = (String) session.getAttribute("cd_senha");
         
     String nm_patente = (String) session.getAttribute("nm_patente");






         
         
         

        
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Navbar -->\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n");
      out.write("            <!-- Container wrapper -->\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <!-- Toggle button -->\n");
      out.write("                <button\n");
      out.write("                    class=\"navbar-toggler\"\n");
      out.write("                    type=\"button\"\n");
      out.write("                    data-mdb-toggle=\"collapse\"\n");
      out.write("                    data-mdb-target=\"#navbarSupportedContent\"\n");
      out.write("                    aria-controls=\"navbarSupportedContent\"\n");
      out.write("                    aria-expanded=\"false\"\n");
      out.write("                    aria-label=\"Toggle navigation\"\n");
      out.write("                    >\n");
      out.write("                    <i class=\"fas fa-bars\"></i>\n");
      out.write("                </button>\n");
      out.write("\n");
      out.write("                <!-- Collapsible wrapper -->\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                    <!-- Navbar brand -->\n");
      out.write("                    <a href=\"#\" class=\"d-flex align-items-center mb-3 mb-md-0 me-md-auto link-body-emphasis text-decoration-none\">\n");
      out.write("                        <img\n");
      out.write("                            src=\"imagens/iconEx.png\"\n");
      out.write("                            height=\"50\"\n");
      out.write("                            />\n");
      out.write("                        <span class=\"fs-4 text-light\">CGM</span>\n");
      out.write("                    </a>\n");
      out.write("                    <!-- Left links -->\n");
      out.write("\n");
      out.write("                    <!-- Left links -->\n");
      out.write("                </div>\n");
      out.write("                <!-- Collapsible wrapper -->\n");
      out.write("\n");
      out.write("                <!-- Right elements -->\n");
      out.write("                <div class=\"d-flex align-items-center\" >\n");
      out.write("                    <!-- Icon -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"dropdown\">\n");
      out.write("                        <button class=\"btn btn-success dropdown-toggle move-left\" type=\"button\" id=\"dropdownMenuButton\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("\n");
      out.write("                            <img\n");
      out.write("                                src=\"imagens/userIcon.png\"\n");
      out.write("                                height=\"40\"\n");
      out.write("                                />\n");
      out.write("                            ");
      out.print( nomeUsuario );
      out.write("\n");
      out.write("                        </button>\n");
      out.write("\n");
      out.write("                        <ul class=\"dropdown-menu dropdown-menu-dark\" aria-labelledby=\"dropdownMenuButton\">\n");
      out.write("                            <li>\n");
      out.write("                                <button type=\"button\" class=\"dropdown-item btn btn-primary\" data-toggle=\"modal\" data-target=\"#perfilSoldadoModal\">\n");
      out.write("                                    Perfil\n");
      out.write("                                </button>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                            <li>\n");
      out.write("                                <hr class=\"dropdown-divider\">\n");
      out.write("                            </li>\n");
      out.write("                            <button type=\"button\" class=\"dropdown-item btn btn-primary\" data-toggle=\"modal\" data-target=\"#solicitacoesTrocaModal\">\n");
      out.write("                                Solicitações\n");
      out.write("                            </button>\n");
      out.write("                            </li>\n");
      out.write("                            <li><hr class=\"dropdown-divider\"></li>\n");
      out.write("                            <li>\n");
      out.write("                                <form action=\"registrarEntrada.jsp\" method=\"post\" >                            \n");
      out.write("                                    <input type=\"hidden\" name=\"idEscala\" value=\"");
      out.print( usuarioID );
      out.write("\">\n");
      out.write("                                    <button class=\"dropdown-item btn btn-success rounded\" type=\"submit\">Registrar Entrada</button>   \n");
      out.write("                                </form>  \n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <form action=\"registrarSaida.jsp\" method=\"post\">\n");
      out.write("                                    <input type=\"hidden\" name=\"idEscala\" value=\"");
      out.print( usuarioID );
      out.write("\">         \n");
      out.write("                                    <button class=\"dropdown-item btn btn-danger rounded\" type=\"submit\">Registrar Saída</button>\n");
      out.write("                                </form>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <hr class=\"dropdown-divider\">\n");
      out.write("                            </li>\n");
      out.write("                            <li><a class=\"dropdown-item\" href=\"logout.jsp\">Logout</a></li>\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <!-- Right elements -->\n");
      out.write("            </div>\n");
      out.write("            <!-- Container wrapper -->\n");
      out.write("        </nav>\n");
      out.write("        <!-- Navbar -->\n");
      out.write("\n");
      out.write("        <!-- O Modal -->\n");
      out.write("        <div class=\"modal\" id=\"perfilSoldadoModal\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("\n");
      out.write("                    <!-- Cabeçalho do Modal -->\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <h5 class=\"modal-title\">Meu Perfil</h5>\n");
      out.write("                        <button type=\"button\" class=\"btn-close\" data-dismiss=\"modal\" aria-label=\"Close\"></button>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <form action=\"atualizarPerfil.jsp\" method=\"post\">\n");
      out.write("                        <!-- Corpo do Modal -->\n");
      out.write("                        <div class=\"modal-body\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"nomeInput\"><strong>Nome</strong></label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"nomeInput\" name=\"nomeInput\" value=\"");
      out.print( nomeUsuario);
      out.write("\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"idadeInput\"><strong>Idade</strong></label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"idadeInput\" name=\"idadeInput\" value=\"");
      out.print( idadeUsuario);
      out.write("\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"nascimentoInput\"><strong>Data de Nascimento</strong></label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"nascimentoInput\" name=\"nascimentoInput\" value=\"");
      out.print( dataNas);
      out.write("\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"nomeGuerraInput\"><strong>Nome de Guerra</strong></label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"nomeGuerraInput\" name=\"nomeGuerraInput\" value=\"");
      out.print( nomeGuerra);
      out.write("\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"patenteInput\"><strong>Patente</strong></label>\n");
      out.write("                                <select id=\"nm_patente\" aria-label=\"Escolha a Patente\" name=\"nm_patente\" class=\"form-control form-control-lg form-select\" required value=\"");
      out.print( nm_patente);
      out.write("\">\n");
      out.write("                                    <option selected disabled >Escolha a patente</option>\n");
      out.write("                                    <option value=\"Sentinela\" ");
      out.print( "Sentinela".equals(nomePatente) ? "selected" : "" );
      out.write(">Sentinela</option>\n");
      out.write("                                    <option value=\"Comandante\" ");
      out.print( "Comandante".equals(nomePatente) ? "selected" : "" );
      out.write(">Comandante</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"loginInput\"><strong>Login</strong></label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"loginInput\" name=\"loginInput\" value=\"");
      out.print( usLogin);
      out.write("\">\n");
      out.write("                                <input type=\"hidden\" class=\"form-control\" id=\"usuarioID\" name=\"usuarioID\" value=\"");
      out.print( usuarioID);
      out.write("\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"senhaInput\"><strong>Senha</strong></label>\n");
      out.write("                                <div class=\"input-group\">\n");
      out.write("                                    <input type=\"password\" class=\"form-control\" id=\"senhaInput\" name=\"senhaInput\" value=\"");
      out.print( usSenha);
      out.write("\" readonly>\n");
      out.write("                                    <button class=\"btn btn-secondary\" type=\"button\" id=\"mostrarSenhaBtn\">Mostrar</button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!-- Rodapé do Modal -->\n");
      out.write("                        <div class=\"modal-footer\">\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-secondary\">Salvar</button>\n");
      out.write("                            <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Fechar</button>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Novo Modal para Solicitações de Troca -->\n");
      out.write("        <div class=\"modal\" id=\"solicitacoesTrocaModal\">\n");
      out.write("            <div class=\"modal-dialog modal-lg\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("\n");
      out.write("                    <!-- Cabeçalho do Modal -->\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <h5 class=\"modal-title\">Solicitações de Troca de Horário</h5>\n");
      out.write("                        <button type=\"button\" class=\"btn-close\" data-dismiss=\"modal\" aria-label=\"Close\"></button>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!-- Corpo do Modal -->\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <!-- Adicione uma tabela para exibir as solicitações de troca -->\n");
      out.write("                        <table class=\"table table-striped\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th>ID da Solicitação</th>\n");
      out.write("                                    <th>Soldado Solicitante</th>\n");
      out.write("                                    <th>Data da Solicitação</th>\n");
      out.write("                                    <th>Status</th>\n");
      out.write("                                    <th>Ações</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>\n");
      out.write("                                ");
 
                                    try {
                                        Class.forName("com.mysql.cj.jdbc.Driver");
                                        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/soldiers?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
                                        Statement stmt = conn.createStatement();
                                        String query = "SELECT troca_horario.*, solicitante.nm_usuario AS solicitante_nome, destinatario.nm_usuario AS destinatario_nome " +
               "FROM troca_horario " +
               "INNER JOIN usuario AS solicitante ON troca_horario.id_usuario_solicitante = solicitante.id_usuario " +
               "INNER JOIN usuario AS destinatario ON troca_horario.id_usuario_destinatario = destinatario.id_usuario " +
               "WHERE destinatario.id_usuario = " + usuarioID;
                                        ResultSet rs = stmt.executeQuery(query);
                                        
                            
                                        while (rs.next()) { 
                                            String solicitante = rs.getString("solicitante_nome");
                                            String destinatario = rs.getString("destinatario_nome");
                                            String id_usuario_solicitante = rs.getString("id_usuario_solicitante");
                                            String id_usuario_destinatario = rs.getString("id_usuario_destinatario");
                                            String data_solicitacao = rs.getString("data_solicitacao");
                                            String status_solicitacao = rs.getString("status_solicitacao");
                                
      out.write("\n");
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>");
      out.print( id_usuario_solicitante );
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print( solicitante );
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print( data_solicitacao );
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print( status_solicitacao );
      out.write("</td>\n");
      out.write("                                    <td>\n");
      out.write("                                        <form action=\"processar_solicitacao.jsp\" method=\"post\">\n");
      out.write("                                            <input type=\"hidden\" name=\"id_solicitacao\" value=\"");
      out.print( id_usuario_solicitante );
      out.write("\">\n");
      out.write("                                            <button class=\"btn btn-success\" type=\"submit\" name=\"acao\" value=\"aceitar\">Aceitar</button>\n");
      out.write("                                            <button class=\"btn btn-danger\" type=\"submit\" name=\"acao\" value=\"recusar\">Recusar</button>\n");
      out.write("                                        </form>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("\n");
      out.write("                                ");
 
                                        }
                                        rs.close();
                                        stmt.close();
                                        conn.close();
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                
      out.write("\n");
      out.write("                                <!-- Adicione linhas conforme necessário com os dados das solicitações -->\n");
      out.write("                                <!-- Exemplo: -->\n");
      out.write("\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!-- Rodapé do Modal -->\n");
      out.write("                    <div class=\"modal-footer\">\n");
      out.write("                        <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Fechar</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container card text-center mt-5\">\n");
      out.write("            <div class=\"card-header\">\n");
      out.write("                <h2 class=\"\">Escalas de Guarda</h2>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card-body\">\n");
      out.write("\n");
      out.write("                ");
       
                 if ("Comandante".equals(nomePatente)) { 
                
      out.write("\n");
      out.write("                <!-- Mostra o botão apenas se a patente do parâmetro for \"Comandante\" -->\n");
      out.write("                <button type=\"button\" class=\"btn bg-success btn-lg btn-block text-light\" data-bs-toggle=\"modal\" data-bs-target=\"#addModal\">\n");
      out.write("                    Adicionar novo\n");
      out.write("                </button>\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("\n");
      out.write("                <!-- Add Modal -->\n");
      out.write("\n");
      out.write("                <div class=\"modal fade\" id=\"addModal\" tabindex=\"-1\" aria-labelledby=\"addModalLabel\" aria-hidden=\"true\">\n");
      out.write("                    <div class=\"modal-dialog\">\n");
      out.write("                        <div class=\"modal-content\">\n");
      out.write("                            <div class=\"modal-header\">\n");
      out.write("                                <h5 class=\"modal-title\" id=\"addModalLabel\">Adicionar Nova Escala</h5>\n");
      out.write("                                <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"modal-body\">\n");
      out.write("                                <!-- Add form fields here to input a new food item -->\n");
      out.write("                                <form method=\"post\" action=\"addRecord.jsp\" class=\"needs-validation\" novalidate>\n");
      out.write("                                    ");
 try {
                                    Class.forName("com.mysql.cj.jdbc.Driver");
                                           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/soldiers?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
                                           Statement stmt = conn.createStatement();
                                           String query = "SELECT * FROM usuario";
                                           ResultSet rs = stmt.executeQuery(query); 
      out.write("\n");
      out.write("                                    <div class=\"mb-3\">\n");
      out.write("                                        <label for=\"nome_soldado\" class=\"form-label\">Nome do Soldado</label>                                       \n");
      out.write("                                        <select class=\"form-select\" id=\"nome_soldado\" name=\"id_usuario\" required> \n");
      out.write("                                            <option selected disabled value=\"\">Escolha o soldado</option>  \n");
      out.write("                                            ");
while (rs.next()) { 
                                             String nm_usuario = rs.getString("nm_usuario");
                                               String id_usuario = rs.getString("id_usuario");
      out.write("                                                                                    \n");
      out.write("                                            <option value=\"");
      out.print( id_usuario );
      out.write('"');
      out.write('>');
      out.print( nm_usuario );
      out.write("</option>\n");
      out.write("                                            ");
 } 
      out.write("\n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"mb-3\">\n");
      out.write("                                        <label for=\"dia_hora_guarda\" class=\"form-label\">Data e Hora da Guarda</label>\n");
      out.write("                                        <input type=\"date\" class=\"form-control\" id=\"dia_hora_guarda\" name=\"dia_hora_guarda\" required>\n");
      out.write("                                        <div class=\"invalid-feedback\">\n");
      out.write("                                            Por favor, insira a data.\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <div class=\"mb-3\">\n");
      out.write("                                        <label for=\"tipo_escala\" class=\"form-label\">Tipo de Escala</label>\n");
      out.write("                                        <select class=\"form-select\" id=\"tipo_escala\" name=\"tipo_escala\" required>  \n");
      out.write("                                            <option selected disabled value=\"\">Escolha a escala</option>\n");
      out.write("                                            <option value=\"Cinza\">Cinza</option>\n");
      out.write("                                            <option value=\"Vermelha\">Vermelha</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"mb-3\">\n");
      out.write("                                        <label for=\"corte_cabelo_conformidade\" class=\"form-label\">Corte de Cabelo</label>\n");
      out.write("                                        <select class=\"form-select\" id=\"corte_cabelo_conformidade\" name=\"corte_cabelo_conformidade\" required>  \n");
      out.write("                                            <option selected disabled value=\"\">Escolha a conformidade</option>\n");
      out.write("                                            <option value=\"1\">Conforme</option>\n");
      out.write("                                            <option value=\"0\">Não Conforme</option>\n");
      out.write("\n");
      out.write("                                        </select>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"mb-3\">\n");
      out.write("                                        <label for=\"identificacao_militar_conformidade\" class=\"form-label\">Identificação Militar</label>\n");
      out.write("                                        <select class=\"form-select\" id=\"identificacao_militar_conformidade\" name=\"identificacao_militar_conformidade\" required>  \n");
      out.write("                                            <option selected disabled value=\"\">Escolha a conformidade</option>\n");
      out.write("                                            <option value=\"1\">Conforme</option>\n");
      out.write("                                            <option value=\"0\">Não Conforme</option>\n");
      out.write("\n");
      out.write("                                        </select>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-primary\">Adicionar</button>\n");
      out.write("                                    ");

                                                rs.close();
                                                stmt.close();
                                                conn.close();
                                            } catch (Exception e) {
                                                e.printStackTrace();
                                            }
                                    
      out.write("\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- Tabela para Escala de Guarda -->\n");
      out.write("                <table id=\"soldadoTable\" class=\"table table-striped text-center\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th class=\"text-center\">ID</th>\n");
      out.write("                            <th class=\"text-center\">Nome do Soldado</th>\n");
      out.write("                            <th class=\"text-center\">Patente</th>\n");
      out.write("                            <th class=\"text-center\">Data / Hora</th>\n");
      out.write("                            <th class=\"text-center\">Tipo de Escala</th>\n");
      out.write("                            <th class=\"text-center\">Corte de Cabelo</th>\n");
      out.write("                            <th class=\"text-center\">Identificação Militar</th>\n");
      out.write("                            <th class=\"text-center\">Ações</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        ");

                        int loggedInUserId = (int) session.getAttribute("idUsuario");
                        try {
                            Class.forName("com.mysql.cj.jdbc.Driver");
                            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/soldiers?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
                            Statement stmt = conn.createStatement();
                            String query = "SELECT * FROM escala_guarda INNER JOIN usuario ON escala_guarda.id_usuario = usuario.id_usuario";
                            ResultSet rs = stmt.executeQuery(query);
                            while (rs.next()) { 
                                int idEscala = rs.getInt("id");
                                String nomeSoldado = rs.getString("nm_usuario");
                                String patente = rs.getString("nm_patente");
                           
        String diaHoraGuarda = rs.getString("dia_hora_guarda");

        // Supondo que "diaHoraGuarda" seja uma string representando a data e hora
        SimpleDateFormat formatoOriginal = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat formatoNovo = new SimpleDateFormat("dd/MM/yyyy");

        Date data;
    
            data = formatoOriginal.parse(diaHoraGuarda);
            String dataFormatada = formatoNovo.format(data);
   
    

                                String tipoEscala = rs.getString("tipo_escala");
                                boolean corteCabeloConforme = rs.getBoolean("corte_cabelo_conformidade");
                                boolean identificacaoConforme = rs.getBoolean("identificacao_militar_conformidade");
        
                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print( idEscala );
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( nomeSoldado );
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( patente );
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( dataFormatada );
      out.write("</td>\n");
      out.write("                            ");
 if (tipoEscala.equals("Vermelha")) { 
      out.write("\n");
      out.write("                            <td class=\"text-danger\">");
      out.print( tipoEscala );
      out.write("</td>\n");
      out.write("                            ");
 } else  { 
      out.write("\n");
      out.write("                            <td class=\"text-body-secondary\">");
      out.print( tipoEscala );
      out.write("</td>\n");
      out.write("                            ");
 } 
      out.write("\n");
      out.write("                            <td>");
      out.print( corteCabeloConforme ? "Conforme" : "Não Conforme" );
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( identificacaoConforme ? "Conforme" : "Não Conforme" );
      out.write("</td>\n");
      out.write("                            <td>\n");
      out.write("\n");
      out.write("                                ");
 if (loggedInUserId != rs.getInt("id_usuario")) { 
      out.write("\n");
      out.write("\n");
      out.write("                                <form action=\"solicitarTroca.jsp\" method=\"post\">\n");
      out.write("                                    <input type=\"hidden\" name=\"idEscala\" value=\"");
      out.print( rs.getInt("id_usuario") );
      out.write("\">\n");
      out.write("                                    <button class=\"btn btn-primary\" type=\"submit\" value=\"");
      out.print( rs.getInt("id_usuario") );
      out.write("\">Solicitar Troca</button>\n");
      out.write("                                </form>\n");
      out.write("                                ");
 } 
      out.write("\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");
} 
      out.write("\n");
      out.write("                        ");

                            rs.close();
                            stmt.close();
                            conn.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        
      out.write("\n");
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("                ");

                } else {
                
      out.write("\n");
      out.write("                <p class=\"mt-3\" style=\"color: white;\">Você não está autenticado. Por favor, faça login <a href='index.jsp'>aqui</a>.</p>\n");
      out.write("                ");

                }
                
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"card-footer text-body-secondary\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <script>\n");
      out.write("\n");
      out.write("                function deleteRecord(recordId) {\n");
      out.write("                    if (confirm(\"Are you sure you want to delete this record?\")) {\n");
      out.write("                        $.ajax({\n");
      out.write("                            type: \"POST\",\n");
      out.write("                            url: \"deleteRecord.jsp\",\n");
      out.write("                            data: {recordId: recordId},\n");
      out.write("                            success: function (data) {\n");
      out.write("                                // Handle the response (e.g., show a success message or refresh the page)\n");
      out.write("                                // You can also use JavaScript to hide the modal after a successful delete.\n");
      out.write("\n");
      out.write("                                location.reload(); // Refresh the page\n");
      out.write("                            }\n");
      out.write("                        });\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            </script>\n");
      out.write("\n");
      out.write("            <script>\n");
      out.write("                // Função para alternar entre texto e senha\n");
      out.write("                function alternarVisibilidadeSenha() {\n");
      out.write("                    var senhaInput = document.getElementById(\"senhaInput\");\n");
      out.write("                    var mostrarSenhaBtn = document.getElementById(\"mostrarSenhaBtn\");\n");
      out.write("\n");
      out.write("                    if (senhaInput.type === \"password\") {\n");
      out.write("                        senhaInput.type = \"text\";\n");
      out.write("                        mostrarSenhaBtn.textContent = \"Ocultar\";\n");
      out.write("                    } else {\n");
      out.write("                        senhaInput.type = \"password\";\n");
      out.write("                        mostrarSenhaBtn.textContent = \"Mostrar\";\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("                // Adiciona um ouvinte de evento ao botão\n");
      out.write("                document.getElementById(\"mostrarSenhaBtn\").addEventListener(\"click\", alternarVisibilidadeSenha);\n");
      out.write("            </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <script>\n");
      out.write("                (() => {\n");
      out.write("                    'use strict'\n");
      out.write("\n");
      out.write("                    const forms = document.querySelectorAll('.needs-validation')\n");
      out.write("\n");
      out.write("                    Array.from(forms).forEach(form => {\n");
      out.write("                        form.addEventListener('submit', event => {\n");
      out.write("                            if (!form.checkValidity()) {\n");
      out.write("                                event.preventDefault()\n");
      out.write("                                event.stopPropagation()\n");
      out.write("                            }\n");
      out.write("\n");
      out.write("                            form.classList.add('was-validated')\n");
      out.write("                        }, false)\n");
      out.write("                    })\n");
      out.write("                })()\n");
      out.write("            </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <script src=\"https://code.jquery.com/jquery-3.7.0.js\"></script>\n");
      out.write("            <script src=\"https://cdn.datatables.net/1.13.6/js/jquery.dataTables.min.js\"></script>\n");
      out.write("            <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js\"></script>\n");
      out.write("            <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL\" crossorigin=\"anonymous\"></script>\n");
      out.write("            <script src=\"https://cdn.datatables.net/1.13.6/js/dataTables.bootstrap5.min.js\"></script>\n");
      out.write("            <script src=\"https://cdn.datatables.net/plug-ins/1.10.25/i18n/Portuguese-Brasil.json\"></script>      \n");
      out.write("            <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js\"></script>\n");
      out.write("            <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("            <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("            <script>\n");
      out.write("                $(document).ready(function () {\n");
      out.write("                    $('#soldadoTable').DataTable({\n");
      out.write("                        \"language\": {\n");
      out.write("                            \"url\": \"//cdn.datatables.net/plug-ins/1.10.25/i18n/Portuguese-Brasil.json\"\n");
      out.write("                        },\n");
      out.write("                        \"responsive\": true\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
