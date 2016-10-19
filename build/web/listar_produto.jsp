<%-- 
    Document   : listar_produto
    Created on : 05/10/2016, 14:43:15
    Author     : Senai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="produtos.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar Produtos</title>
    </head>

    <div align="center">
        <h1>Produtos cadastrados</h1>

        <table border="1">
            <thead>
                <tr>
                    <td>Codigo</td>
                    <td>Nome</td>  
                    <td>Quantidade</td>
                    <td>Preço</td>
                    <td>Categoria</td>
                    <td>Mercado</td>
                    <td>Tamanho</td>
                    <td>Marca</td>
                    <td>Forma de Calcular Venda</td>
                    <td>Codigo de Barras</td>
                </tr>
            </thead>
            <tbody>
                <% for (Produtos produto : ProdutosDAO.Listar()) {%>
                <tr>
                    <td> <%= produto.codigo%> </td>
                    <td> <%= produto.nome%> </td>
                    <td><%= produto.quantidade%></td>
                    <td><%= produto.preco%></td>
                    <td><%= produto.categoria%></td>
                    <td><%= produto.mercado%></td>
                    <td><%= produto.tamanho%></td>
                    <td><%= produto.marca%></td>
                    <td><%= produto.formadecalcularvenda%></td>
                    <td><%= produto.codigodebarra%></td>
                    <td> <a href="editarprodutos.jsp?codigo=<%= produto.codigo%>">
                            Editar
                        </a>
                    </td>
                    <td> <a href="ExcluirProduto?codigo=<%= produto.codigo%>">
                            Excluir
                        </a>
                    </td>
                </tr>

                <% }%>
            </tbody>
        </table>
    </div> 
</body>
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
