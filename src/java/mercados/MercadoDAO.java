/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercados;

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
public class MercadoDAO {

    public static ArrayList<Mercado> mercados = new ArrayList<Mercado>();

    public static void salvar(String nome_mercado,
            String email_mercado, String senha_mercado, String telefone_mercado) {

        Mercado mercado = new Mercado();
        mercado.nome_mercado = nome_mercado;
        mercado.email_mercado = email_mercado;
        mercado.senha_mercado = senha_mercado;
        mercado.telefone_mercado = telefone_mercado;

        mercados.add(mercado);
        try {
            Class.forName("org.postgresql.Driver");

            Connection conexao = DriverManager.getConnection("jdbc:postgresql://projetoac.cloudapp.net:5432/market", "market", "mkt$1");

            PreparedStatement ps = conexao.prepareStatement("insert into mercados (nome, email, senha, telefone) values (?, ?, ?, ?);");

            ps.setString(1, nome_mercado);
            ps.setString(2, email_mercado);
            ps.setString(3, senha_mercado);
            ps.setString(4, telefone_mercado);

            ps.executeUpdate();
            ps.close();
            conexao.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MercadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MercadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static Mercado buscar(int codigo) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://projetoac.cloudapp.net:5432/market", "market", "mkt$1");
            PreparedStatement ps = conexao.prepareStatement("select * from mercados where codigo = ?");

            ps.setInt(1, codigo);

            ResultSet rs = ps.executeQuery();

            rs.next();

            Mercado mercado = new Mercado();
            mercado.nome_mercado = rs.getString("nome");
            mercado.email_mercado = rs.getString("email");
            mercado.senha_mercado = rs.getString("senha");
            mercado.telefone_mercado = rs.getString("telefone");

            rs.close();
            ps.close();
            conexao.close();

            return mercado;

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MercadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MercadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public static void atualizar(int codigo_mercado, String nome_mercado,
            String email_mercado, String senha_mercado, String telefone_mercado) {
        Mercado mercado = buscar(codigo_mercado);
        mercado.nome_mercado = nome_mercado;
        mercado.email_mercado = email_mercado;
        mercado.senha_mercado = senha_mercado;
        mercado.telefone_mercado = telefone_mercado;

    }

    public static ArrayList<Mercado> Listar() {
        ArrayList<Mercado> mercados = new ArrayList<Mercado>();

        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://projetoac.cloudapp.net:5432/market", "market", "mkt$1");

            PreparedStatement ps = conexao.prepareStatement("select * from mercados");

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Mercado mercado = new Mercado();

                mercado.codigo_mercado = rs.getInt("codigo");
                mercado.nome_mercado = rs.getString("nome");
                mercado.email_mercado = rs.getString("email");
                mercado.senha_mercado = rs.getString("senha");
                mercado.telefone_mercado = rs.getString("telefone");

                mercados.add(mercado);
            }
            rs.close();
            ps.close();
            conexao.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MercadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MercadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return mercados;
    }

    public static Mercado login(String nome_mercado, String senha_mercado) {

        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://projetoac.cloudapp.net:5432/market", "market", "mkt$1");

            PreparedStatement ps = conexao.prepareStatement("select * from mercados where nome = ? and senha = ?");

            ps.setString(1, nome_mercado);
            ps.setString(2, senha_mercado);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Mercado mercado = new Mercado();
                mercado.nome_mercado = rs.getString("nome");
                mercado.senha_mercado = rs.getString("senha");

                rs.close();
                ps.close();
                conexao.close();

                return mercado;

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MercadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MercadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static void excluir(int codigo_mercado) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://projetoac.cloudapp.net:5432/market", "market", "mkt$1");

            PreparedStatement ps = conexao.prepareStatement("delete from mercados where codigo_mercado = ?");

            ps.setInt(1, codigo_mercado);
            ps.executeUpdate();

            ps.close();
            conexao.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MercadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MercadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
