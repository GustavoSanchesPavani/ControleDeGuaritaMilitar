<!-- Inclus�o dos arquivos de estilo do Bootstrap e Font Awesome -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" integrity="sha384-ZfM5rn5bozg2Wp38R7PuU5h/D3s3pPiR6eHtQj3PDNmw9T9gA1eJrE4zFSxCvo6" crossorigin="anonymous">

<!-- C�digo CSS personalizado para a aplica��o -->
<style>
    .bg-successs {
        background-color: #0b1c18;
    }

    .centered-img {
        display: block;
        max-width: 30%; /* Ajuste a largura conforme necess�rio */
        margin: 0 auto; /* Centraliza a imagem horizontalmente */
    }
</style>

<!-- Se��o de login com imagem de fundo -->
<section class="vh-75" style="background-image: url('imagens/wpp.jpg'); background-size: cover; background-position: center; background-repeat: no-repeat;">
    <div class="container py-5 h-100">
        <div class="row d-flex justify-content-center align-items-center h-100">
            <div class="col-12 col-md-8 col-lg-6 col-xl-5">
                <!-- Cart�o de login -->
                <div class="card shadow-2-strong bg-successs text-light" style="border-radius: 1rem;">
                    <div class="card-body p-5 text-center">
                        <!-- Imagem centralizada -->
                        <img src="imagens/iconEx.png" alt="alt" class="centered-img mb-4">
                        <!-- T�tulo -->
                        <h3 class="mb-5">Entrar no Sistema</h3>
                        <!-- Formul�rio de login -->
                        <form action="login_processar.jsp" method="post">
                            <!-- Campo de nome de usu�rio -->
                            <div class="form-outline mb-4">
                                <input type="text" id="typeEmailX-2" placeholder="Nome de Usu�rio" name="email" class="form-control form-control-lg" />
                            </div>
                            <!-- Campo de senha -->
                            <div class="form-outline mb-4">
                                <input type="password" placeholder="Senha" id="typePasswordX-2" name="senha" class="form-control form-control-lg" />
                            </div>
                            <!-- Bot�o de login -->
                            <button class="btn btn-success btn-lg btn-block" type="submit">Login</button>
                        </form>
                        <!-- Link para o formul�rio de registro -->
                        <div class="text-center">
                            <p>N�o tem conta? <a href="registro.jsp" class="text-success">Cadastre-se</a></p>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Inclus�o do arquivo JavaScript do Bootstrap -->
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
        </div>
    </div>
</section>
