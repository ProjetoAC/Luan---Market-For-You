<%-- 
    Document   : login
    Created on : 11/10/2016, 14:32:58
    Author     : Senai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</head>
<body>
    <!-- Stack the columns on mobile by making one full-width and the other half-width -->
    <div class="row">
        <div class="col-xs-12 col-md-10"><img src="http://2.bp.blogspot.com/-8DnA7V38mFw/TtaOHim0gDI/AAAAAAAADJI/Eu_SWffykjM/s1600/0_64fe8_c49acc04_XXL.png" style="width:120%; height: 200px;" /> </div>

    </div>

    <!-- Columns start at 50% wide on mobile and bump up to 33.3% wide on desktop -->
    <div class="row">
        <div class="col-xs-6 col-md-4"> <!--ba-->
        </div>

    </form></div>
<div class="col-xs-6 col-md-4"><!--ba--></div>
<div class="col-xs-6 col-md-4"><form action="ServletLogin" method="post">
        <div align="center" class="form-group"> 
            <label  for="exampleInputEmail1">Usúario </label>
            <input type="nome" class="form-control" id="exampleInputEmail1" placeholder="Nome" name="nome">
        </div>
        <div align="center" class="form-group">
            <label for="exampleInputPassword1">Senha </label>
            <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Senha" name="senha">
        </div>
        <button type="submit" class="btn btn-primary btn-lg btn-block">Entrar</button>
    </form></div>

<!-- Columns are always 50% wide, on mobile and desktop -->
<div  class="row">

    <div  class="col-xs-6"></div>
    <div align="center">
        <img src="marketforyou1.jpg" style="width:70%; height: 200px;" />
    </div>
</div>
</body>
</html>
