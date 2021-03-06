package fr.eni.enienchere.dal;

import fr.eni.enienchere.bo.Article;
import fr.eni.enienchere.bo.Bid;
import fr.eni.enienchere.bo.Categorie;

import java.util.List;

public interface ArticleDAO {
    void insert (Article article,int id) throws DALException;
    List<Article> getAllArticles() throws DALException;
    void delete(int noArt ) throws DALException;
    Article selectById(Integer noArticle) throws DALException;
    void update(Article article, int idUser) throws DALException;
    List<Article> selectByUser(Integer noUser) throws DALException;
    List<Categorie> selectCategorie () throws DALException;
    void insertEnchere (Bid bid,int idArticle, int idUser) throws DALException;
    List<Article> getArtByMotCle(String keyword) throws DALException;
    Integer getNoUser(Integer noArt) throws DALException;

    //Article selectByMotCle (int noArticle) throws DALException;
    }
