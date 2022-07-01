package fr.eni.enienchere.dal;

import fr.eni.enienchere.bo.Retrait;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class RetraitDAOImpl implements RetraitDAO {


    private static final String INSERT = "INSERT INTO RETRAITS (rue, cpo, ville) VALUES (?, ?, ?)";
    private static final String UPDATE = "UPDATE RETRAITS SET rue=?, cpo=?, ville=?";

    private static final String DELETE = "DELETE FROM RETRAITS WHERE no_article = ?";

    public void addRetrait(Retrait retrait) throws DALException {
        try (Connection conn = ConnectionProvider.getConnection();) {

            PreparedStatement stmt = conn.prepareStatement(INSERT, PreparedStatement.RETURN_GENERATED_KEYS);

            stmt.setString(1, retrait.getRue());
            stmt.setString(2, retrait.getCpo());
            stmt.setString(3, retrait.getVille());

            stmt.executeUpdate();

            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                retrait.setRue(rs.getString(1));
            }
        } catch (SQLException e) {
            throw new DALException("error create article : ", e);
        }
    }

    public void updateRetrait (Retrait retrait) throws DALException {
        try (Connection conn = ConnectionProvider.getConnection();) {
            PreparedStatement stmt = conn.prepareStatement(UPDATE);

            stmt.setString(1, retrait.getRue());
            stmt.setString(2, retrait.getCpo());
            stmt.setString(3, retrait.getVille());

            int nbRows = stmt.executeUpdate();

            if(nbRows == 0) {
                throw new DALException("retrait not found");
            }
        } catch (SQLException e) {
            throw new DALException("error update retrait : ", e);
        }
    }

    public void deleteRetrait (int noArticle) throws DALException {
        try (Connection conn = ConnectionProvider.getConnection();) {
            PreparedStatement stmt = conn.prepareStatement(DELETE);

            stmt.setInt(1, noArticle);

            int nbRows = stmt.executeUpdate();

            if(nbRows == 0) {
                throw new DALException("retrait not found");
            }
        } catch (SQLException e) {
            throw new DALException("error delete retrait : ", e);
        }
    }


}

