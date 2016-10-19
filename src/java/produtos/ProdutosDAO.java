/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produtos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Senai
 */
public class ProdutosDAO {

    public static void salvar(
            String nome, int quantidade, float preco, String categoria, String mercado, String tamanho, String marca, String formadecalcularvenda, String codigodebarra) {

        try {
            Class.forName("org.postgresql.Driver");

            Connection conexao = DriverManager.getConnection("jdbc:postgresql://projetoac.cloudapp.net:5432/market", "market", "mkt$1");

            PreparedStatement ps = conexao.prepareStatement("insert into produtos (nome, quantidade, preco, categoria, mercado, tamanho, marca, forma_de_calcular_venda, codigo_de_barras) values (?, ?, ?, ?, ?, ?, ?, ?, ?);");

            ps.setString(1, nome);
            ps.setInt(2, quantidade);
            ps.setFloat(3, preco);
            ps.setString(4, categoria);
            ps.setString(5, mercado);
            ps.setString(6, tamanho);
            ps.setString(7, marca);
            ps.setString(8, formadecalcularvenda);
            ps.setString(9, codigodebarra);

            ps.executeUpdate();
            ps.close();
            conexao.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProdutosDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static ArrayList<Produtos> Listar() {
        ArrayList<Produtos> produtos = new ArrayList<Produtos>();

        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://projetoac.cloudapp.net:5432/market", "market", "mkt$1");

            PreparedStatement ps = conexao.prepareStatement("select * from produtos");

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Produtos produto = new Produtos();
                produto.codigo = rs.getInt("codigo");
                produto.nome = rs.getString("nome");
                produto.quantidade = rs.getInt("quantidade");
                produto.preco = rs.getFloat("preco");
                produto.categoria = rs.getString("categoria");
                produto.mercado = rs.getString("mercado");
                produto.tamanho = rs.getString("tamanho");
                produto.marca = rs.getString("marca");
                produto.formadecalcularvenda = rs.getString("forma_de_calcular_venda");
                produto.codigodebarra = rs.getString("codigo_de_barras");
                produtos.add(produto);
            }
            rs.close();
            ps.close();
            conexao.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProdutosDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return produtos;
    }

    public static void excluir(int codigo) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://projetoac.cloudapp.net:5432/market", "market", "mkt$1");

            PreparedStatement ps = conexao.prepareStatement("delete from produtos where codigo = ?");

            ps.setInt(1, codigo);
            ps.executeUpdate();

            ps.close();
            conexao.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProdutosDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static Produtos buscar(int codigo) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://projetoac.cloudapp.net:5432/market", "market", "mkt$1");
            PreparedStatement ps = conexao.prepareStatement("select * from produtos where codigo = ?");

            ps.setInt(1, codigo);

            ResultSet rs = ps.executeQuery();

            rs.next();

            Produtos produtos = new Produtos();
            produtos.codigo = rs.getInt("codigo");
            produtos.nome = rs.getString("nome");
            produtos.quantidade = rs.getInt("quantidade");
            produtos.preco = rs.getFloat("preco");
            produtos.categoria = rs.getString("categoria");
            produtos.mercado = rs.getString("mercado");
            produtos.tamanho = rs.getString("tamanho");
            produtos.marca = rs.getString("marca");
            produtos.formadecalcularvenda = rs.getString("forma_de_calcular_venda");
            produtos.codigodebarra = rs.getString("codigo_de_barras");

            rs.close();
            ps.close();
            conexao.close();

            return produtos;

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProdutosDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public static void atualizar(int codigo, String nome,
            int quantidade, float preco, String categoria, String mercado, String tamanho, String marca, String formadecalcularvenda, String codigodebarra) {

        try {
            Class.forName("org.postgresql.Driver");

            Connection conexao = DriverManager.getConnection("jdbc:postgresql://projetoac.cloudapp.net:5432/market", "market", "mkt$1");

            PreparedStatement ps = conexao.prepareStatement("update produtos set nome = ?, quantidade = ?, preco = ?, categoria = ?, mercado = ?, tamanho = ?, marca = ?, forma_de_calcular_venda = ?, codigo_de_barras = ? where codigo = ?;");

            ps.setString(1, nome);
            ps.setInt(2, quantidade);
            ps.setFloat(3, preco);
            ps.setString(4, categoria);
            ps.setString(5, mercado);
            ps.setString(6, tamanho);
            ps.setString(7, marca);
            ps.setString(8, formadecalcularvenda);
            ps.setString(9, codigodebarra);
            ps.setInt(10, codigo);

            ps.executeUpdate();
            ps.close();
            conexao.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProdutosDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
