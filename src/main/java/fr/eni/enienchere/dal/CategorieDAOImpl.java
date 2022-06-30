package fr.eni.enienchere.dal;

import fr.eni.enienchere.bo.Categorie;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CategorieDAOImpl implements CategorieDAO{


    private static final String INSERT = "insert into CATEGORIE (libelle) VALUES(?)";

    private static final String DELETE = "delete from CATEGORIE where no_categorie=?";

    private static final String UPDATE = "update CATEGORIE set libelle=?" + "where no_categorie=?";

    public CategorieDAOImpl(){

    }

    public void insert(Categorie categorie) throws DALException {
        try( Connection conn = ConnectionProvider.getConnection()) {
            PreparedStatement stmt = conn.prepareStatement(INSERT, PreparedStatement.RETURN_GENERATED_KEYS);

            stmt.setInt(1, categorie.getNoCategorie());

            stmt.executeUpdate();

            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                categorie.setLibelle(rs.getString(1));
            }
        }catch (SQLException e) {
            throw new DALException("erreur insert catégorie : ", e);
        }
    }

    @Override
    public void update(Categorie categorie) throws DALException {
        try (Connection conn = ConnectionProvider.getConnection();) {
            PreparedStatement stmt = conn.prepareStatement(UPDATE);

            stmt.setString(1, categorie.getLibelle());

            int nbRows = stmt.executeUpdate();

            if (nbRows == 0) {
                throw new DALException("erreur update - categorie not found");
            }
        }catch (SQLException e) {
            throw new DALException("erreur update catégorie : "+ categorie.getNoCategorie(),e);
        }
    }

    public void delete(Integer noCategorie) throws DALException{
        try (Connection conn = ConnectionProvider.getConnection();) {
            PreparedStatement stmt = conn.prepareStatement(DELETE);
            stmt.setInt(1,noCategorie);
            int nbRows = stmt.executeUpdate();

            if (nbRows == 0) {
                throw new DALException("erreur delete - categorie not found" + noCategorie);
            }
        }catch (SQLException e) {
            throw new DALException("erreur delete - categorie : "+ noCategorie,e);
        }
    }
}
