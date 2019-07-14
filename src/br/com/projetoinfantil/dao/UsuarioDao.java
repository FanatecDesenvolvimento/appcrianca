
package br.com.projetoinfantil.dao;
import br.com.projetoinfantil.connection.ConnectionFactory;
import br.com.projetoinfantil.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class UsuarioDao {
    public boolean checkLogin(String login, String senha) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        boolean check = false;

        try {

            stmt = con.prepareStatement("SELECT * FROM tbpais WHERE loginpais = ? and senhapais = ?");
            stmt.setString(1, login);
            stmt.setString(2, senha);

            rs = stmt.executeQuery();

            if (rs.next()) {

                check = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return check;

    }

     public void create(Usuario u) {
        
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO tbpais (nomeusu,loginusu,senhausu)VALUES(?,?,?)");
            stmt.setString(1, u.getNomeUsu());
            stmt.setString(2, u.getLoginUsu());
            stmt.setString(3, u.getSenhaUsu());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public List<Usuario> read() {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Usuario> usuarios = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM tbpais");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Usuario usuario = new Usuario();

                usuario.setIdUsu(rs.getInt("idusu"));
                usuario.setNomeUsu(rs.getString("nomeusu"));
                usuario.setLoginUsu(rs.getString("loginusu"));
                usuario.setSenhaUsu(rs.getString("senhausu"));
                usuarios.add(usuario);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return usuarios;

    }
    public List<Usuario> readForDesc(String desc) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Usuario> produtos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM tbpais WHERE nomeusu LIKE ?");
            stmt.setString(1, "%"+desc+"%");
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                Usuario usuario = new Usuario();

                usuario.setIdUsu(rs.getInt("idusu"));
                usuario.setNomeUsu(rs.getString("nomeusu"));
                usuario.setLoginUsu(rs.getString("loginusu"));
                usuario.setSenhaUsu(rs.getString("senhausu"));
                produtos.add(usuario);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return produtos;

    }

    public void update(Usuario u) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE tbpais SET nomeusu = ? ,loginusu = ?,senhausu = ? WHERE idusu = ?");
            stmt.setString(1, u.getNomeUsu());
            stmt.setString(2, u.getLoginUsu());
            stmt.setString(3, u.getSenhaUsu());
            stmt.setInt(4, u.getIdUsu());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    public void delete(Usuario u) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM tbpais WHERE idusu = ?");
            stmt.setInt(1, u.getIdUsu());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    
}

    

