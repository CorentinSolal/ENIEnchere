package fr.eni.enienchere.dal;

import fr.eni.enienchere.bll.BLLException;
import fr.eni.enienchere.bo.Article;

import java.sql.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

public class ArticleDAOImpl implements ArticleDAO {

    //Bien faire attention aux noms des colonnes et tables dans la Base de données
    private static final String INSERT = "insert Into ARTICLES_VENDUS (nom_article, description, date_debut_encheres, date_fin_encheres, prix_initial, prix_vente ,no_utilisateur ,no_categorie )"
            + " values (?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String SELECT_ALL = "Select * from ARTICLES_VENDUS";
    private static final String DELETE = "Delete FROM ARTICLES_VENDUS Where no_article = ?";
    private static final String SELECT_BY_ID = "Select * From ARTICLES_VENDUS Where no_article = ?";
    private static final String UPDATE = "UPDATE ARTICLES_VENDUS SET nom_article = ? ,description = ? ,date_debut_encheres = ? ,date_fin_encheres = ?,prix_initial = ?, no_categorie = ?";
    private static final String SELECT_USER_CATALOGUE = "SELECT * FROM UTILISATEURS";
    private static final String SELECT_BY_USER = "SELECT * From ARTICLES_VENDUS Where no_utilisateur = ?";
    private static final String SELECT_ENCHERE_BY_ARTICLE = "SELECT * FROM ENCHERES WHERE no_article = ?";
    private static final String SELECT_ENCHERE_BY_USER = "SELECT * FROM ENCHERES WHERE no_utilisateur = ?";
    private static final String SELECT_RETRAIT_BY_ARTICLE = "SELECT * FROM RETRAITS WHERE no_article = ?";
    private static final String SELECT_CATEGORIE = "SELECT * FROM CATEGORIES";
    private static final String INSERT_ENCHERE = "insert into ENCHERES (date_enchere, montant_enchere, no_article, no_utilisateur) values (?, ?, ?, ?)";
    private static final String INSERT_RETRAIT = "INSERT INTO RETRAITS (no_article, rue, code_postal, ville) VALUES (?, ?, ?, ? )";

    public ArticleDAOImpl() {
    }
    public void insert(Article article, int idUser) throws DALException {
        try (Connection conn = ConnectionProvider.getConnection()) {

            PreparedStatement stmt = conn.prepareStatement(INSERT, PreparedStatement.RETURN_GENERATED_KEYS);

            stmt.setString(1, article.getNomArt());
            stmt.setString(2, article.getDescArt());
            stmt.setDate(3, Date.valueOf(article.getDateDebut()));
            stmt.setDate(4, Date.valueOf(article.getDateFin()));
            stmt.setInt(5, article.getPrixInit());
            stmt.setInt(6, article.getPrixFinal());
            stmt.setInt(7, idUser);
            stmt.setInt(8, article.getNoCat());

            stmt.executeUpdate();

            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                article.setIdArt(rs.getInt(1));
            }
        } catch (SQLException e) {
            throw new DALException("error insert article : ", e);
        }
    }
    public List<Article> getAllArticles() throws DALException{
        List<Article> listeArticles = new ArrayList<Article>();

        try (Connection conn = ConnectionProvider.getConnection()) {

            PreparedStatement stmt = conn.prepareStatement(SELECT_ALL);

            ResultSet rs = stmt.executeQuery();

            while(rs.next()) {
                Date dateDebut=rs.getDate("date_debut_encheres");
                Date dateFin=rs.getDate("date_fin_encheres");
                LocalDate localDateDebut = dateDebut.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                LocalDate localDateFin = dateFin.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                listeArticles.add(new Article(rs.getInt("no_article"), rs.getString("nom_article"), rs.getString("description"), localDateDebut, localDateFin, rs.getInt("prix_initial"), rs.getInt("prix_vente") ,rs.getInt("no_categorie")));
            }
            return listeArticles;
        } catch (SQLException e) {
            throw new DALException("erreur Select All",e);
        }
    }
    public void delete(int noArt ) throws DALException {

        try (Connection conn = ConnectionProvider.getConnection()){

            PreparedStatement stmt = conn.prepareStatement(DELETE);

            stmt.setInt(1,noArt);

            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new DALException ("erreur delete",e);
        }

    }
    public Article selectById(int noArticle) throws DALException {

        try (Connection conn = ConnectionProvider.getConnection()){

            PreparedStatement stmt = conn.prepareStatement(SELECT_BY_ID);

            stmt.setInt(1,noArticle);

            ResultSet rs = stmt.executeQuery();

            if(rs.next()) {
                Date dateDebut=rs.getDate("date_debut_encheres");
                Date dateFin=rs.getDate("date_fin_encheres");
                LocalDate localDateDebut = dateDebut.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                LocalDate localDateFin = dateFin.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                return new Article(rs.getInt("no_article"), rs.getString("nom_article"), rs.getString("description"), localDateDebut, localDateFin, rs.getInt("prix_initial"), rs.getInt("prix_vente"), rs.getInt("no_categorie"));
            }else {
                throw new DALException ("Mauvais Identifiant ");
            }
        } catch (SQLException e) {
            throw new DALException ("erreur selectbyid",e);
        }
    }
    public void update(Article article, int idUser) throws DALException {

        try (Connection conn = ConnectionProvider.getConnection()){

            PreparedStatement stmt = conn.prepareStatement(UPDATE);

            stmt.setString(1, article.getNomArt());
            stmt.setString(2, article.getDescArt());
            stmt.setDate(3, Date.valueOf(article.getDateDebut()));
            stmt.setDate(4, Date.valueOf(article.getDateFin()));
            stmt.setInt(5, article.getPrixInit());
            stmt.setInt(6, article.getNoCat());

            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new DALException ("erreur update",e);
        }
    }
}
