/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produtos;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Senai
 */
public class SalvarProdutos extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SalvarProdutos</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SalvarProdutos at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        if (request.getParameter("nome").isEmpty()
                || request.getParameter("quantidade").isEmpty()
                || request.getParameter("preco").isEmpty()
                || request.getParameter("categoria").isEmpty()
                || request.getParameter("mercado").isEmpty()
                || request.getParameter("tamanho").isEmpty()
                || request.getParameter("marca").isEmpty()
                || request.getParameter("formadecalcularvenda").isEmpty()
                || request.getParameter("codigodebarra").isEmpty()) {
            request.setAttribute("erro", "Preencha todos os campos corretamente.");
            request.getRequestDispatcher("cadastar_produto.jsp").forward(request, response);
        } else {

            String nome = request.getParameter("nome");
            int quantidade = Integer.valueOf(request.getParameter("quantidade"));
            float preco = Float.valueOf(request.getParameter("preco"));
            String categoria = request.getParameter("categoria");
            String mercado = request.getParameter("mercado");
            String tamanho = request.getParameter("tamanho");
            String marca = request.getParameter("marca");
            String formadecalcularvenda = request.getParameter("formadecalcularvenda");
            String codigodebarra = request.getParameter("codigodebarra");

            ProdutosDAO.salvar(nome, quantidade, preco, categoria, mercado, tamanho, marca, formadecalcularvenda, codigodebarra);

            request.setAttribute("sucesso", "Cadastro realizado com sucesso!");
            request.getRequestDispatcher("listar_produto.jsp").forward(request, response);

        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
