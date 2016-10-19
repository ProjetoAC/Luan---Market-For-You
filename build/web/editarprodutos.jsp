<%-- 
    Document   : editar
    Created on : 13/10/2016, 14:30:57
    Author     : Senai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="produtos.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            int codigo = Integer.valueOf(request.getParameter("codigo"));
            Produtos produtos = ProdutosDAO.buscar(codigo);
        %>

        <form action="EditarProdutos"
              method="post">

            <label>Código:</label>
            <input name="codigo"
                   value="<%= produtos.codigo%>">
            <br>
            <label>Nome:</label>
            <input name="nome"
                   value="<%= produtos.nome%>">
            <br>
            <label>Quantidade:</label>
            <input name="quantidade"
                   value="<%= produtos.quantidade%>">
            <br>
            <label>Preco:</label>
            <input name="preco"
                   value="<%= produtos.preco%>">
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
            <label>Nome do mercado:</label>
            <input name="mercado"
                   value="<%= produtos.mercado%>">
            <br>
            <label>Tamanho:</label>
            <input name="tamanho"
                   value="<%= produtos.tamanho%>">
            <br>
            <label>Marca:</label>
            <input name="marca"
                   value="<%= produtos.marca%>">
            <br>
            <label>Forma de calacular Venda:</label>
            <br>
            <select name="formadecalcularvenda">
                <option value="Unidade">Unidade</option>
                <option value="Kilograma">Kilograma</option>
            </select>
            <br>
            <label>Codigo de Barras:</label>
            <input name="codigo_de_barras"
                   value="<%= produtos.codigodebarra%>">
            <br>

            <input type="submit"
                   value="Atualizar">
        </form>
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
