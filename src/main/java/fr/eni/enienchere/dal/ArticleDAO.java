package fr.eni.enienchere.dal;

import fr.eni.projectsevenenchere.bo.Article;

import java.util.List;

public interface ArticleDAO {
    void insert (Article article) throws DALException;

    List<Article> selectAll() throws DALException;

    Article selectById(Integer id) throws DALException;

    void delete(Integer id) throws DALException;

    void update (Article article) throws DALException;

}
