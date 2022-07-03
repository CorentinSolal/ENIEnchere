package fr.eni.enienchere.dal;

import fr.eni.enienchere.bo.Article;

import java.util.List;

public interface ArticleDAO {
    void insert (Article article,int id) throws DALException;
    List<Article> getAllArticles() throws DALException;
    void delete(int noArt ) throws DALException;
    Article selectById(int noArticle) throws DALException;



    }
