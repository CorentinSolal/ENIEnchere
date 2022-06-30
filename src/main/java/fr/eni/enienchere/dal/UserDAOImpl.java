package fr.eni.enienchere.dal;

import fr.eni.enienchere.bo.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static java.sql.Statement.RETURN_GENERATED_KEYS;

public class UserDAOImpl implements UserDAO{

    private static final String CREATE="INSERT INTO UTILISATEURS () VALUES ()";
    private static final String UPDATE="UPDATE UTILISATEURS SET PSEUDO=?,nom=?,prenom=?,telephone=?,rue=?,code_postal=?,ville=?";
    private static final String VERIFY=""; // TODO requete à faire
    // TODO Requete a faire pour les méthodes

    public void addUser(User user) throws DALException {
        try ( Connection conn = ConnectionProvider.getConnection();) {

            PreparedStatement stmt = conn.prepareStatement(CREATE, RETURN_GENERATED_KEYS);

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
        try (Connection conn = ConnectionProvider.getConnection();){
            PreparedStatement stmt = conn.prepareStatement(UPDATE);

            stmt.setString(1,user.getPseudo());
            stmt.setString(2,user.getNom());
            stmt.setString(3,user.getPrenom());
            stmt.setString(4,user.getAdresse());
            stmt.setInt(5,user.getCpo());
            stmt.setString(6,user.getEmail());
            stmt.setInt(7,user.getTelephone());
            stmt.setString(8,user.getPassword());

            int nbRows = stmt.executeUpdate();

            if (nbRows > 0) {
                throw new DALException("erreur update - id not found : "+user.getNoUser());
            }
        }catch (SQLException e) {
            throw new DALException("erreur update user : "+user.getNoUser());
        }
    }
    public void deleteUser(Integer id) throws DALException {
        // TODO Auto-generated
    }
    public User selectUser(Integer id) throws DALException {
        // TODO Auto-generated
        return null;
    }
}
