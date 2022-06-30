package fr.eni.enienchere.dal;

import fr.eni.enienchere.bo.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAOImpl implements UserDAO{

    private static final String CREATE="INSERT INTO UTILISATEURS () VALUES ()";
    private static final String UPDATE="UPDATE UTILISATEURS SET PSEUDO=?,nom=?,prenom=?,telephone=?,rue=?,code_postal=?,ville=?";
    private static final String VERIFY=""; // TODO requete à faire
    // TODO Requete a faire pour les méthodes

    public void addUser(User user) throws DALException {
        try ( Connection conn = ConnectionProvider.getConnection();) {

            PreparedStatement stmt = conn.prepareStatement(CREATE, PreparedStatement.RETURN_GENERATED_KEYS);

           // TODO prepareStatement

            stmt.executeUpdate();

            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                user.setNoUser(rs.getInt(1));
            }
        } catch (SQLException e) {
            throw new DALException("erreur create user : ", e);
        }
    }

    public void updateUser(User user) throws DALException {
        // TODO Auto-generated
    }
    public void deleteUser(Integer id) throws DALException {
        // TODO Auto-generated
    }
    public User selectUser(Integer id) throws DALException {
        // TODO Auto-generated
        return null;
    }
}
