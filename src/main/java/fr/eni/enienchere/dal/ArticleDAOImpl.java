package fr.eni.enienchere.dal;

import fr.eni.enienchere.bo.Article;
import fr.eni.enienchere.bo.Bid;
import fr.eni.enienchere.bo.Categorie;

import java.sql.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

public class ArticleDAOImpl implements ArticleDAO {


    private static final String INSERT = "insert Into ARTICLES_VENDUS (nom_article, description, date_debut_encheres, date_fin_encheres, " +
            "prix_initial, prix_vente ,no_utilisateur ,no_categorie, image_url ) values (?,?,?,?,?,?,?,?,?)";
    private static final String SELECT_ALL = "Select * from ARTICLES_VENDUS";
    private static final String DELETE = "Delete FROM ARTICLES_VENDUS Where no_article = ?";
    private static final String SELECT_BY_ID = "Select * From ARTICLES_VENDUS Where no_article = ?";
    private static final String UPDATE = "UPDATE ARTICLES_VENDUS SET nom_article = ? ,description = ? ,date_debut_encheres = ? ,date_fin_encheres = ?," +
            "prix_initial = ?, no_categorie = ?, image_url = ?";
    private static final String SELECT_BY_USER = "SELECT * From ARTICLES_VENDUS Where no_utilisateur = ?";
    private static final String SELECT_CATEGORIE = "SELECT * FROM CATEGORIES";
    private static final String INSERT_ENCHERE = "insert into ENCHERES (date_enchere, montant_enchere, no_article, no_utilisateur) values (?, ?, ?, ?)";
    private static final String SELECT_BY_MOT_CLE = "SELECT * FROM ARTICLES_VENDUS WHERE nom_article like ?";
    private static final String SELECT_NO_USER="SELECT no_utilisateur FROM ARTICLES_VENDUS WHERE no_article=?";

    public ArticleDAOImpl() {
    }
    public void insert(Article article, int idUser) throws DALException {
        try (Connection conn = ConnectionProvider.getConnection()) {

            PreparedStatement stmt = conn.prepareStatement(INSERT, PreparedStatement.RETURN_GENERATED_KEYS);

            stmt.setString(1, article.getNameArt());
            stmt.setString(2, article.getDescArt());
            stmt.setDate(3, Date.valueOf(LocalDate.now()));
            stmt.setDate(4, Date.valueOf(article.getDateEnd()));
            stmt.setInt(5, article.getStartPrice());
            stmt.setInt(6, article.getStartPrice());
            stmt.setInt(7, idUser);
            stmt.setInt(8, article.getNoCat());
            stmt.setString(9, article.getImageUrl());

            stmt.executeUpdate();

            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                article.setIdArt(rs.getInt(1));
            }
        } catch (SQLException e) {
            throw new DALException("error insert article : ", e);
        }
    }
    public List<Article> getAllArticles() throws DALException {

        List<Article> listeArticles = new ArrayList<Article>();

        try (Connection conn = ConnectionProvider.getConnection()) {

            PreparedStatement stmt = conn.prepareStatement(SELECT_ALL);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                listeArticles.add(new Article(rs.getInt("no_article"), rs.getString("nom_article"),
                        rs.getString("description"), rs.getDate("date_debut_encheres").toLocalDate(),
                        rs.getDate("date_fin_encheres").toLocalDate(), rs.getInt("prix_initial"),
                        rs.getInt("prix_vente"), rs.getInt("no_categorie"), rs.getString("image_url")));
            }
            return listeArticles;
        } catch (SQLException e) {
            throw new DALException("erreur Select All", e);
        }
    }
    public void delete(int noArt) throws DALException {

        try (Connection conn = ConnectionProvider.getConnection()) {

            PreparedStatement stmt = conn.prepareStatement(DELETE);

            stmt.setInt(1, noArt);

            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new DALException("erreur delete", e);
        }
    }
    public Article selectById(Integer noArt) throws DALException {

        try (Connection conn = ConnectionProvider.getConnection()) {

            PreparedStatement stmt = conn.prepareStatement(SELECT_BY_ID);

            stmt.setInt(1, noArt);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new Article(rs.getInt("no_article"), rs.getString("nom_article"),
                        rs.getString("description"), rs.getDate("date_debut_encheres").toLocalDate(),
                        rs.getDate("date_fin_encheres").toLocalDate(), rs.getInt("prix_initial"),
                        rs.getInt("prix_vente"), rs.getInt("no_categorie"), rs.getString("image_url"));
            } else {
                throw new DALException("Mauvais Identifiant ");
            }
        } catch (SQLException e) {
            throw new DALException("erreur selectbyid", e);
        }
    }
    public void update(Article article, int idUser) throws DALException {

        try (Connection conn = ConnectionProvider.getConnection()) {

            PreparedStatement stmt = conn.prepareStatement(UPDATE);

            stmt.setString(1, article.getNameArt());
            stmt.setString(2, article.getDescArt());
            stmt.setDate(3, Date.valueOf(article.getDateStart()));
            stmt.setDate(4, Date.valueOf(article.getDateEnd()));
            stmt.setInt(5, article.getStartPrice());
            stmt.setInt(6, article.getNoCat());
            stmt.setString(7, article.getImageUrl());

            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new DALException("erreur update", e);
        }
    }
    public List<Article> selectByUser(Integer noUser) throws DALException {

        List<Article> listeArticles = new ArrayList<Article>();

        try (Connection conn = ConnectionProvider.getConnection()) {

            PreparedStatement stmt = conn.prepareStatement(SELECT_BY_USER);

            stmt.setInt(1, noUser);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                listeArticles.add(new Article(rs.getInt("no_article"), rs.getString("nom_article"),
                        rs.getString("description"), rs.getDate("date_debut_encheres").toLocalDate(),
                        rs.getDate("date_fin_encheres").toLocalDate(), rs.getInt("prix_initial"),
                        rs.getInt("prix_vente"), rs.getInt("no_categorie"), rs.getString("image_url")));
            } else {
                throw new DALException("Mauvais Identifiant ");
            }
            return listeArticles;
        } catch (SQLException e) {
            throw new DALException("erreur selectbyid", e);
        }
    }
    public List<Categorie> selectCategorie() throws DALException {
        List<Categorie> listeCategorie = new ArrayList<Categorie>();

        try (Connection conn = ConnectionProvider.getConnection()) {

            PreparedStatement stmt = conn.prepareStatement(SELECT_CATEGORIE);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                listeCategorie.add(new Categorie(rs.getInt("no_categorie"), rs.getString("libelle")));
            }
            return listeCategorie;
        } catch (SQLException e) {
            throw new DALException("erreur Select Categorie", e);
        }
    }
    public void insertEnchere(Bid bid, int idArticle, int idUser) throws DALException {

        try (Connection conn = ConnectionProvider.getConnection()) {

            PreparedStatement stmt = conn.prepareStatement(INSERT_ENCHERE, PreparedStatement.RETURN_GENERATED_KEYS);

            stmt.setDate(1, Date.valueOf(bid.getBidDate()));
            stmt.setInt(2, bid.getBidAmount());
            stmt.setInt(3, idArticle);
            stmt.setInt(4, idUser);


            stmt.executeUpdate();

            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                bid.setIdBid(rs.getInt(1));
            }
        } catch (SQLException e) {
            throw new DALException("error insert enchere : ", e);
        }

    }
    public List<Article> getArtByMotCle(String keyword) throws DALException {
        try (Connection conn = ConnectionProvider.getConnection()) {

            List<Article> listeArticles = new ArrayList<Article>();

            PreparedStatement stmt = conn.prepareStatement(SELECT_BY_MOT_CLE);

            stmt.setString(1, "%"+keyword+"%");

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Article artKeyword = new Article(rs.getInt("no_article"), rs.getString("nom_article"),
                        rs.getString("description"), rs.getDate("date_debut_encheres").toLocalDate(),
                        rs.getDate("date_fin_encheres").toLocalDate(), rs.getInt("prix_initial"),
                        rs.getInt("prix_vente"), rs.getInt("no_categorie"), rs.getString("image_url"));
                System.out.println(artKeyword);
                listeArticles.add(artKeyword);
            }
            return listeArticles;
        } catch (SQLException e) {
            throw new DALException("erreur Select by mot cl??", e);
        }
    }
    public Integer getNoUser(Integer noArt) throws DALException {
        try (Connection conn = ConnectionProvider.getConnection()) {

            Integer noUser=null;

            PreparedStatement stmt = conn.prepareStatement(SELECT_NO_USER);

            stmt.setInt(1,noArt);

            ResultSet rs =stmt.executeQuery();

            if (rs.next()) {
                noUser = rs.getInt(1);
            }
            return noUser;
        } catch (SQLException e) {
            throw new DALException("erreur Select All", e);
        }
    }
}

