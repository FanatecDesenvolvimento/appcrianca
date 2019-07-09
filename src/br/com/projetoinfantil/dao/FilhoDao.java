
package br.com.projetoinfantil.dao;
import br.com.projetoinfantil.model.Filho;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class FilhoDao {
   

     public void create(Filho u) {
        
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO tbfilhos ( sexofilhos, nomefilho, datanascimentofilho, fkidpais)VALUES(?,?,?,?)");
            stmt.setInt(1,u.getIdFilho());
            stmt.setString(2, u.getNomeFilho());
            stmt.setInt(3, u.getDataNascimentoFilho());
            stmt.setString(4, u.getSexoFilho());
            stmt.setInt(4, u.getFkidPai());
            

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public List<Filho> read() {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Filho> Filhos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM tbfilhos");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Filho Filho = new Filho();

                Filho.setIdFilho(rs.getInt("idfilhos"));
                Filho.setNomeFilho(rs.getString("nomefilho"));
                Filho.setDataNascimentoFilho(rs.getInt("datanascimentofilho"));
                Filho.setSexoFilho(rs.getString("sexofilhos"));
                Filho.setFkidPai(rs.getInt("fkidpai"));
                Filhos.add(Filho);
            }

        } catch (SQLException ex) {
            Logger.getLogger(FilhoDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return Filhos;

    }
    public List<Filho> readForDesc(String desc) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Filho> Filhos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM tbfilhos WHERE nomefilho LIKE ?");
            stmt.setString(1, "%"+desc+"%");
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                Filho Filho = new Filho();

                Filho.setIdFilho(rs.getInt("idfilhos"));
                Filho.setNomeFilho(rs.getString("nomefilho"));
                Filho.setDataNascimentoFilho(rs.getInt("datanascimentofilho"));
                Filho.setSexoFilho(rs.getString("sexofilho"));
                Filho.setFkidPai(rs.getInt("fkidpais"));
                Filhos.add(Filho);
            }

        } catch (SQLException ex) {
            Logger.getLogger(FilhoDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return Filhos;

    }

    public void update(Filho u) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE tbfilhos SET sexofilho = ?,datanascimentofilho = ?, nomefilho = ? WHERE idfilhos = ?");
            stmt.setInt(1,u.getIdFilho());
            stmt.setString(2, u.getNomeFilho());
            stmt.setInt(3, u.getDataNascimentoFilho());
            stmt.setString(4, u.getSexoFilho());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    public void delete(Filho u) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM tbfilhos WHERE idfilhos = ?");
            stmt.setInt(1, u.getIdFilho());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    
}

    

