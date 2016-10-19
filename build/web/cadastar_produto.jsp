<%-- 
    Document   : cadastar_produto
    Created on : 05/10/2016, 14:17:30
    Author     : Senai
--%>

<%@page import="produtos.Produtos"%>
<%@page import="produtos.ProdutosDAO"%>
<%@page import="produtos.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro do Produtos</title>
    </head>
    <!-- Latest compiled and minified CSS -->
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



            </div><div style="margin-top: 20px">
                <div align="center">
                    <div style="color: red">${erro}</div>
                    <div style="color: green">${sucesso}</div>
                    <form style="width: 150px;" action="SalvarProdutos" method="post">
                        <label>Nome:</label>
                        <input name="nome">
                        <br>
                        <label>Quantidade:</label>
                        <input name="quantidade">
                        <br>
                        <label>Preço</label>
                        <input name="preco">
                        <br>
                        <label>Categoria:</label>
                        <br>
                        <select name="categoria">
                            <option value="Padaria e Sobremesa">Padaria e Sobremesa</option>
                            <option value="Carnes">Carnes</option>
                            <option value="Bebidas">Bebidas</option>
                            <option value="Higiene">Higiene</option>
                            <option value="Mercearia">Mercearia</option>
                            <option value="Frios, Leite e Derivados">Frios, Leite e Derivados</option>
                            <option value="Frutas, ovos e Verduras">Frutas, ovos e Verduras</option>
                            <option value="Bazar e Limpeza">Bazar e Limpeza</option>

                        </select> 
                        <br>
                        <label>Nome mercado:</label>
                        <input name="mercado">
                        <br>
                        <label>Tamanho:</label>
                        <input name="tamanho">
                        <br>
                        <label>Marca:</label>
                        <input name="marca">
                        <br>
                        <label>Forma de Calcular Venda:</label>
                        <br>
                        <select name="formadecalcularvenda">
                            <option value="Unidade">Unidade</option>
                            <option value="Kilograma">Kilograma</option>
                        </select>
                        <br>
                        <label>Código de Barras:</label>
                        <input name="codigodebarra">
                        <input type="submit" value="Cadastar">
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
