package fr.eni.enienchere.bll;

import fr.eni.enienchere.bo.Article;
import fr.eni.enienchere.bo.Bid;
import fr.eni.enienchere.bo.Categorie;

import java.util.List;

public interface ArticleManager {
    List<Article> getAllArticles() throws BLLException;
    List<Categorie> selectCategories() throws BLLException;
    void insertArticle (Article article, int id) throws BLLException;
    void deleteArticle(Integer idArt) throws BLLException;
    Article selectById(Integer id) throws BLLException;
    void updateArticle(Article article, int idUser) throws BLLException;
    List<Article> selectByUserArticle(Integer idArt) throws BLLException;
    void insertEnchere (Bid bid, int idArticle, Integer idBid)  throws BLLException;
    List<Article> getArtByMotCle(String keyword) throws BLLException;
    Integer getUserByNoArt(Integer noArt) throws BLLException;
}