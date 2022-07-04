package fr.eni.enienchere.dal;

import fr.eni.enienchere.bo.Article;
import fr.eni.enienchere.bo.Bid;
import fr.eni.enienchere.bo.Categorie;

import java.util.List;

public interface ArticleDAO {
    void insert (Article article,int id) throws DALException;
    List<Article> getAllArticles() throws DALException;
    void delete(int noArt ) throws DALException;
    Article selectById(int noArticle) throws DALException;
    void update(Article article, int idUser) throws DALException;

    List<Article> selectByUser(Integer noUser) throws DALException;

    List<Categorie> selectCategorie (Integer noCategorie) throws DALException;

    void insertEnchere (Bid bid,int idArticle, int idUser) throws DALException;

    }
