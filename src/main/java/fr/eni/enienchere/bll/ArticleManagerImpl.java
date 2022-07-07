package fr.eni.enienchere.bll;

import fr.eni.enienchere.bo.Article;
import fr.eni.enienchere.bo.Bid;
import fr.eni.enienchere.bo.Categorie;
import fr.eni.enienchere.dal.ArticleDAO;
import fr.eni.enienchere.dal.DALException;
import fr.eni.enienchere.dal.DAOFactory;

import java.util.List;

public class ArticleManagerImpl implements ArticleManager   {
    private ArticleDAO articleDAO;
    public ArticleManagerImpl() {
        articleDAO = DAOFactory.getArticleDao(); //couplage faible
    }
    public List<Article> getAllArticles() throws BLLException {
        try {
            return articleDAO.getAllArticles();
        } catch (DALException e) {
            throw new BLLException("Error ArticleManagerImpl getAllArticles", e);
        }
    }
    public List<Categorie> selectCategories() throws BLLException {
        try {
            return articleDAO.selectCategorie();
        } catch (DALException e) {
            throw new BLLException("Error ArticleManagerImpl selectCategorie : ", e);
        }
    }
   public void insertArticle (Article article, int id) throws BLLException {
        if(article.getIdArt()==null) {
            try {
                articleDAO.insert(article,id);
            } catch (DALException e) {
                throw new BLLException("Error ArticleManagerImpl enregistrerArticle : " + article, e);
            }
        } else {
            try {
                articleDAO.update(article,id);
            } catch (DALException e) {
                throw new BLLException("Error ArticleManagerImpl enregistrerArticle : " + article, e);
            }
        }
    }
    public void deleteArticle(Integer idArt) throws BLLException{
        try {
            articleDAO.delete(idArt);
        }catch (DALException e) {
            throw new BLLException("Error ArticleManagerImpl deleteArticle : " + idArt,e);
        }
    }
    public Article selectById(Integer id) throws BLLException {
        try {
            return articleDAO.selectById(id);
        } catch (DALException e) {
            throw new BLLException("Error ArticleManagerImpl selectById : " + id, e);
        }
    }
    public void updateArticle(Article article, int idUser) throws BLLException {
        try {
            articleDAO.update(article, idUser);
        } catch (DALException e) {
            throw new BLLException("Error ArticleManagerImpl updateArticle : " + idUser, e);
        }
    }
    public List<Article> selectByUserArticle(Integer idArt) throws BLLException {
        try {
            return articleDAO.selectByUser(idArt);
        } catch (DALException e) {
            throw new BLLException("Error ArticleManagerImpl selectByUserArticle : " + idArt, e);
        }
    }
    public void insertEnchere (Bid bid, int idArticle, Integer idBid)  throws BLLException {
        try {
            articleDAO.insertEnchere(bid, idArticle, idBid);
        } catch (DALException e) {
            throw new BLLException("Error ArticleManagerImpl insertEnchere : " + idBid, e);
        }
    }

    public List<Article> getArtByMotCle(String keyword) throws BLLException {
        try {
            return articleDAO.getArtByMotCle(keyword);
        } catch (DALException e) {
            throw new BLLException("Error ArticleManagerImpl getArtByMotCle : " + keyword, e);
        }
    }
    public Integer getUserByNoArt(Integer noArt) throws BLLException {
        try {
            return articleDAO.getNoUser(noArt);
        } catch (DALException e) {
            throw new BLLException("Error ArticleManagerImpl getUserByNoArt : " + noArt, e);
        }
    }

}