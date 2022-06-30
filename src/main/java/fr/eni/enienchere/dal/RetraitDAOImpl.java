package fr.eni.enienchere.dal;

import fr.eni.enienchere.bo.Retrait;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static sun.tools.jconsole.Messages.CREATE;

public class RetraitDAOImpl implements RetraitDAO {
    // TODO FAIRE LA DAO POUR LIER LA BO A LA BASE DE DONNEES

    private static final String INSERT = "INSERT INTO RETRAITS (rue, cpo, ville) VALUES (?, ?, ?)";

    public void addRetrait(Retrait retrait) throws DALException {
        try (Connection conn = ConnectionProvider.getConnection();) {

            PreparedStatement stmt = conn.prepareStatement(CREATE, PreparedStatement.RETURN_GENERATED_KEYS);

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


    //TODO REPRENDRE LES MEMES METHODES QUE LES AUTRES DAO

}

