<%-- 
    Document   : editarusuarios
    Created on : 13/10/2016, 15:00:25
    Author     : Senai
--%>
<%@page import="usuarios.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            int codigo = Integer.valueOf(request.getParameter("codigo"));
            Usuario usuario = UsuarioDAO.buscar(codigo);
        %>

        <form action="EditarServlet"
              method="post">
            <br>
            <input type="hidden" name="codigo" value="<%=usuario.codigo%>">
            <label>Nome:</label>
            <input name="nome"
                   value="<%= usuario.nome%>">
            <br>
            <label>E-mail :</label>
            <input name="email"
                   value="<%= usuario.email%>">
            <br>
            <label>Senha :</label>
            <input name="senha" type="password"
                   value="<%= usuario.senha%>">
            <br>
            <br>
            <label>Telefone :</label>
            <input name="telefone"
                   value="<%= usuario.telefone%>">
            <br>
            <input type="submit"
                   value="Atualizar">
        </form>
    </body>
</html>

