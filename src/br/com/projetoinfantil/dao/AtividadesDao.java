
package br.com.projetoinfantil.dao;
import br.com.projetoinfantil.connection.ConnectionFactory;
import br.com.projetoinfantil.model.Atividades;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AtividadesDao {
    
    public List<Atividades> read() {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Atividades> Atividades = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM tbatividades");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Atividades Atividade = new Atividades();

                Atividade.setIdAtividades(rs.getInt("idatividades"));
                Atividade.setDescricaoAtividades(rs.getString("descricaoatividades"));
                Atividade.setFaixaAtividades(rs.getString("faixaatividades"));
                Atividades.add(Atividade);
            }

        } catch (SQLException ex) {
            Logger.getLogger(FilhoDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return Atividades;

    }
    public List<Atividades> readForDesc(String desc) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Atividades> Atividades = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM tbatividades WHERE faixaatividades LIKE ?");
            stmt.setString(1, "%"+desc+"%");
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                Atividades Atividade = new Atividades();
                
                Atividade.setIdAtividades(rs.getInt("idatividades"));
                Atividade.setDescricaoAtividades(rs.getString("descricaoatividades"));
                Atividade.setFaixaAtividades(rs.getString("faixaatividades"));
                Atividades.add(Atividade);
            }

        } catch (SQLException ex) {
            Logger.getLogger(FilhoDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return Atividades;

    }}