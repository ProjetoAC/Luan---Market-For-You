<%-- 
    Document   : cadastrar_usuario
    Created on : 04/10/2016, 14:48:58
    Author     : Senai
--%>

<%@page import="usuarios.Usuario"%>
<%@page import="usuarios.UsuarioDAO"%>
<%@page import="usuarios.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro do Usúario</title>
    </head>
    <body <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    </head>

<body>

    <div class="row">
        <div class="col-sm-9">
            <div align="right">

            </div>
            <div class="row">
                <div  align="right" class="col-xs-20 col-sm-10">
                    <img src="marketforyou.jpg" style= "width:120%; height: 300px;" />
                </div>


                <div style="text-decoration: none; display: inline; list-style: none;" class="container-fluid">

                </div>
                <form class="form-horizontal" action="SalvarUsuario" method="post">
                    <div  class="form-group">
                        <label class="col-sm-2 control-label">Nome </label>
                        <div class="col-sm-10">
                            <input type="nome" class="form-control"  placeholder="Nome" name="nome">
                        </div>
                        <label class="col-sm-2 control-label">E-mail </label>
                        <div class="col-sm-10">
                            <input type="email" class="form-control"  placeholder="E-mail" name="email">
                        </div>
                        <label class="col-sm-2 control-label">Telefone </label>
                        <div class="col-sm-10">
                            <input type="telefone" class="form-control"  placeholder="Telefone" name="telefone">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputPassword3" class="col-sm-2 control-label">Senha </label>
                        <div class="col-sm-10">
                            <input type="password" class="form-control"  placeholder="Password" name="senha">
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-offset-2 col-sm-10">
                            <div class="checkbox">

                            </div>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-offset-2 col-sm-10">
                            <button type="submit" class="btn btn-default">Cadastrar </button>
                        </div>
                    </div>
                </form>
                <div  class="col-xs-15 col-sm-9">
                    <img src=http://www.sumerbol.com.br/Sumerbol/Portugues/img/banner_3.jpg style= "width:100%; height: 190px;" />
                </div>
                <address align="center">
                    <strong>Market For You</strong><br>
                    Jardim Concórdia, Casa 48<br>
                    Dois Vizinhos, PR <br>
                    <abbr title="Phone">P:</abbr> (46) 8818-9732
                </address>

                <address align="center">
                    <a href="mailto:#">marketforyou@hotmail.com</a>
                </address>

            </div>
        </div>
</body>
</html>
