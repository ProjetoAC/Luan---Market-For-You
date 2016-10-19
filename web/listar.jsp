<%-- 
    Document   : listar
    Created on : 04/10/2016, 15:00:56
    Author     : Senai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="usuarios.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar Usuarios</title>
    </head>
    <body background="marketforyou.jpg">
        <div style="margin-top: 150px">
            <div align="center">
                <h1>Pessoas cadastradas</h1>

                <table border="1">
                    <thead>
                        <tr>
                            <td>Codigo</td>
                            <td>Nome</td>  
                            <td> Email</td>
                            <td> Telefone </td>
                        </tr>
                    </thead>
                    <tbody>
                        <% for (Usuario usuario : UsuarioDAO.Listar()) {%>
                        <tr>
                            <td> <%= usuario.codigo%> </td>
                            <td> <%= usuario.nome%> </td>
                            <td><%= usuario.email%></td>
                            <td><%= usuario.telefone%></td>
                            <td> <a href="editarusuarios.jsp?codigo=<%= usuario.codigo%>">
                                    Editar
                                </a>
                            </td>
                            <td> <a href="ExcluirUsuario?codigo=<%= usuario.codigo%>">
                                    Excluir
                                </a>
                            </td>
                        </tr>

                        <% }%>
                    </tbody>
                </table>
            </div> 
        </div>
    </body>
</html>
