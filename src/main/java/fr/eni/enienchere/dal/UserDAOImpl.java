package fr.eni.enienchere.dal;

import fr.eni.enienchere.bo.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static java.sql.Statement.RETURN_GENERATED_KEYS;

public class UserDAOImpl implements UserDAO{

    private static final String INSERT = "insert into UTILISATEURS (pseudo, nom, prenom, "
            + "email, telephone, rue, code_postal, ville, mot_de_passe, credit, administrateur) "
            + "values ( ?, ?, ?, ?, ?, ?, ?, ?, ?,100, false)";
    private static final String CONNECT="SELECT * FROM UTILISATEURS WHERE pseudo=? AND mot_de_passe=?";
    private static final String UPDATE="UPDATE UTILISATEURS SET PSEUDO=?,nom=?,prenom=?,telephone=?,rue=?,code_postal=?,ville=?,email=?,telephone=?,password=?,";
    private static final String DELETE="DELETE FROM UTILISATEURS WHERE no_utilisateur = ?";
    private static final String VERIFY="SELECT * FROM UTILISATEURS WHERE no_utilisateur = ?";

    @Override
    public void addUser(User user) throws DALException {
        try ( Connection conn = ConnectionProvider.getConnection();) {

            PreparedStatement stmt = conn.prepareStatement(INSERT, RETURN_GENERATED_KEYS);

            stmt.setString(1,user.getPseudo());
            stmt.setString(2,user.getLastName());
            stmt.setString(3,user.getFirstName());
            stmt.setString(4,user.getEmail());
            stmt.setString(5,user.getTelephone());
            stmt.setString(6,user.getAdresse());
            stmt.setString(7,user.getCpo());
            stmt.setString(8,user.getVille());
            stmt.setString(9,user.getPassword());

            stmt.executeUpdate();

            ResultSet rs = stmt.getGeneratedKeys();

            if (rs.next()) {
                user.setNoUser(rs.getInt(1));
            }
        } catch (SQLException e) {
            throw new DALException("erreur insert user : ", e);
        }
    }

    @Override
    public void updateUser(User user) throws DALException {
        try (Connection conn = ConnectionProvider.getConnection();){
            PreparedStatement stmt = conn.prepareStatement(UPDATE);

            stmt.setString(1,user.getPseudo());
            stmt.setString(2,user.getFirstName());
            stmt.setString(3,user.getLastName());
            stmt.setString(4,user.getAdresse());
            stmt.setString(5,user.getCpo());
            stmt.setString(6,user.getVille());
           stmt.setString(7,user.getEmail());
           stmt.setString(8,user.getTelephone());
           stmt.setString(9,user.getPassword());


            int nbRows = stmt.executeUpdate();

            if (nbRows > 0) {
                throw new DALException("erreur update - id not found : "+user.getNoUser());
            }
        }catch (SQLException e) {
            throw new DALException("erreur update user : "+user.getNoUser());
        }
    }
    @Override
    public void deleteUser(Integer id) throws DALException {
        try (Connection conn = ConnectionProvider.getConnection();) {
            PreparedStatement stmt = conn.prepareStatement(DELETE);

            stmt.setInt(1,id);

            int nbRows = stmt.executeUpdate();

            if(nbRows == 0) {
                throw new DALException("erreur delete user - id not found" + id);
            }
        }catch (SQLException e) {
            throw new DALException("erreur delete user : "+id, e);
        }
    }
    @Override
    public User selectUser(Integer id) throws DALException {
        User user = null;
        try (Connection conn = ConnectionProvider.getConnection()){

            PreparedStatement stmt = conn.prepareStatement(VERIFY);

            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                user =new User ( rs.getInt("no_utilisateur"),rs.getString("pseudo"),rs.getString("nom"),rs.getString("prenom"),
                        rs.getString("email"), rs.getString("telephone"), rs.getString("rue"), rs.getString("code_postal"),
                        rs.getString("ville"), rs.getString("mot_de_passe"));
            }else{
                throw new DALException("erreur verify user : "+id);
            }
        }catch (SQLException e){
            e.printStackTrace();
            throw new DALException("erreur selectUser : ", e);
        }

        return user;
    }

    @Override
    public User connectUser(String username, String password) throws DALException {
        try (Connection connection= ConnectionProvider.getConnection()){
            PreparedStatement stmt = connection.prepareStatement(CONNECT);

            stmt.setString(1, username);
            stmt.setString(2, password);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new User(rs.getInt("no_utilisateur"),rs.getString("pseudo"), rs.getString("nom"), rs.getString("prenom"), rs.getString("email"), rs.getString("telephone"), rs.getString("rue"), rs.getString("code_postal"), rs.getString("ville"), rs.getString("mot_de_passe"), rs.getInt("credit"), rs.getBoolean("administrateur"));
            } else {
                throw new DALException("Login ou Mot de passe incorrecte");
            }
        } catch (Exception e) {
            throw new DALException("", e);
        }
    }
}
