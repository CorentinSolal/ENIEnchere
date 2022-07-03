package fr.eni.enienchere.dal;

import fr.eni.enienchere.bo.Article;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ArticleDAOImpl implements ArticleDAO {

    //Bien faire attention aux noms des colonnes et tables dans la Base de données
    private static final String INSERT = "insert into ARTICLES_VENDUS (nom_article, description, date_debut_encheres, date_fin_encheres, prix_initial) values(?,?,?,?,?)";
    private static final String SELECT_ALL ="select * from ARTICLES_VENDUS";

   private static final String SELECT_BY_ID = "select * from ARTICLES_VENDUS where no_article=? ";

    private static final String DELETE = "delete from ARTICLES_VENDUS where no_article = ?";

    private static final String UPDATE = "update ARTICLES_VENDUS set nom=?, description=?, date_debut_encheres=?, date_fin_encheres=?, prix_initial=?, prix_vente=?" + "where no-article=?";

    public ArticleDAOImpl() {
    }
    public void insert(Article article) throws DALException {
        try (Connection conn = ConnectionProvider.getConnection()) {

            PreparedStatement stmt = conn.prepareStatement(INSERT, PreparedStatement.RETURN_GENERATED_KEYS);

            stmt.setString(1, article.getNomArt());
            stmt.setString(2, article.getDescArt());
            stmt.setDate(3, Date.valueOf(LocalDate.now()));
            stmt.setDate(4, Date.valueOf(article.getDateFin()));
            stmt.setInt(5, article.getPrixInit());

            stmt.executeUpdate();

            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                article.setIdArt(rs.getInt(1));
            }
        } catch (SQLException e) {
            throw new DALException("error insert article : ", e);
        }
    }
    public List<Article> selectAll() throws DALException {
        List<Article> listeArticle = new ArrayList<Article>();
        try (Connection conn = ConnectionProvider.getConnection();) {

            Statement requet = conn.createStatement();

            ResultSet rs = requet.executeQuery(SELECT_ALL);

            Article articleAjout = null;
            while (rs.next()) {
                articleAjout = new Article(rs.getInt("no_article"),rs.getString("nom_article"),rs.getString("description"), (rs.getDate("date_debut_encheres")).toLocalDate(),(rs.getDate("date_fin_encheres")).toLocalDate(),rs.getInt("prix_initial"),rs.getInt("prix_vente"));
                listeArticle.add(articleAjout);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new DALException("erreur select all", e);
        }
        return listeArticle;
    }
   @Override
    public Article selectById(Integer id) throws DALException {
        Article article = null;
        try (Connection conn = ConnectionProvider.getConnection()) {

            PreparedStatement stmt = conn.prepareStatement(SELECT_BY_ID);

            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                article = new Article(rs.getInt("no_article"),rs.getString("nom_article"),
                        rs.getString("description"), (rs.getDate("date_debut_encheres")).toLocalDate(),
                        (rs.getDate("date_fin_encheres")).toLocalDate(),rs.getInt("prix_initial"),
                        rs.getInt("prix_vente"));
            }else {
                throw new DALException("Article not found : "+id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new DALException("erreur select all", e);
        }
        return article;
    }
    @Override
    public void delete(Integer id) throws DALException {

        try (Connection conn = ConnectionProvider.getConnection();) {

            PreparedStatement stmt = conn.prepareStatement(DELETE);

            stmt.setInt(1, id);

            int nbRows = stmt.executeUpdate();

            if (nbRows == 0) {
                throw new DALException("erreur delete - id not found : " + id);
            }
        } catch (SQLException e) {
            throw new DALException("erreur delete article : " + id, e);
        }
    }
    @Override
    public void update(Article article) throws DALException {
        try (Connection conn = ConnectionProvider.getConnection();) {

            PreparedStatement stmt = conn.prepareStatement(UPDATE);

            stmt.setString(1, article.getNomArt());
            stmt.setString(2, article.getDescArt());
            stmt.setDate(3, Date.valueOf(article.getDateDebut()));
            stmt.setDate(4, Date.valueOf(article.getDateFin()));
            stmt.setInt(5, article.getPrixInit());
            stmt.setInt(6, article.getPrixFinal());

            int nbRows = stmt.executeUpdate();

            if (nbRows == 0) {
                throw new DALException("erreur update - id not found : " + article.getIdArt());
            }
        } catch (SQLException e) {
            throw new DALException("erreur update pizza : " + article.getIdArt(), e);
        }
    }
}
