/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios;

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
public class UsuarioDAO {

    public static void salvar(String nome,
            String email, String senha, String telefone) {

        try {
            Class.forName("org.postgresql.Driver");

            Connection conexao = DriverManager.getConnection("jdbc:postgresql://projetoac.cloudapp.net:5432/market", "market", "mkt$1");

            PreparedStatement ps = conexao.prepareStatement("insert into usuarios (nome, email, senha, telefone) values (?, ?, ?, ?);");

            ps.setString(1, nome);
            ps.setString(2, email);
            ps.setString(3, senha);
            ps.setString(4, telefone);

            ps.executeUpdate();
            ps.close();
            conexao.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static Usuario buscar(int codigo) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://projetoac.cloudapp.net:5432/market", "market", "mkt$1");
            PreparedStatement ps = conexao.prepareStatement("select * from usuarios where codigo = ?");

            ps.setInt(1, codigo);

            ResultSet rs = ps.executeQuery();

            rs.next();

            Usuario usuario = new Usuario();
            usuario.codigo = rs.getInt("codigo");
            usuario.nome = rs.getString("nome");
            usuario.email = rs.getString("email");
            usuario.senha = rs.getString("senha");
            usuario.telefone = rs.getString("telefone");

            rs.close();
            ps.close();
            conexao.close();

            return usuario;

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public static void atualizar(int codigo, String nome,
            String email, String senha, String telefone) {

        try {
            Class.forName("org.postgresql.Driver");

            Connection conexao = DriverManager.getConnection("jdbc:postgresql://projetoac.cloudapp.net:5432/market", "market", "mkt$1");

            PreparedStatement ps = conexao.prepareStatement("update usuarios set nome = ?, email = ?, senha = ?, telefone= ? where codigo = ?;");

            ps.setString(1, nome);
            ps.setString(2, email);
            ps.setString(3, senha);
            ps.setString(4, telefone);
            ps.setInt(5, codigo);

            ps.executeUpdate();
            ps.close();
            conexao.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static ArrayList<Usuario> Listar() {
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://projetoac.cloudapp.net:5432/market", "market", "mkt$1");

            PreparedStatement ps = conexao.prepareStatement("select * from usuarios");

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Usuario usuario = new Usuario();

                usuario.codigo = rs.getInt("codigo");
                usuario.nome = rs.getString("nome");
                usuario.email = rs.getString("email");
                usuario.senha = rs.getString("senha");
                usuario.telefone = rs.getString("telefone");

                usuarios.add(usuario);
            }
            rs.close();
            ps.close();
            conexao.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return usuarios;
    }

    public static Usuario login(String nome, String senha) {

        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://projetoac.cloudapp.net:5432/market", "market", "mkt$1");

            PreparedStatement ps = conexao.prepareStatement("select * from usuarios where nome = ? and senha = ?");

            ps.setString(1, nome);
            ps.setString(2, senha);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.nome = rs.getString("nome");
                usuario.senha = rs.getString("senha");

                rs.close();
                ps.close();
                conexao.close();

                return usuario;

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static void excluir(int codigo) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://projetoac.cloudapp.net:5432/market", "market", "mkt$1");

            PreparedStatement ps = conexao.prepareStatement("delete from usuarios where codigo = ?");

            ps.setInt(1, codigo);
            ps.executeUpdate();

            ps.close();
            conexao.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
