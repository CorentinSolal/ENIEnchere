package fr.eni.enienchere.bll;

import fr.eni.enienchere.bo.Article;
import fr.eni.enienchere.bo.Bid;
import fr.eni.enienchere.dal.ArticleDAO;
import fr.eni.enienchere.dal.DALException;
import fr.eni.enienchere.dal.DAOFactory;

import java.util.List;

public class ArticleManagerImpl implements ArticleManager   {
    private ArticleDAO articleDao;
    public ArticleManagerImpl() {
         articleDao = DAOFactory.getArticleDao(); //couplage faible
    }
    public List<Article> getAllArticles() throws BLLException {
        try {
            return articleDao.getAllArticles();
        } catch (DALException e) {
            throw new BLLException("Error ArticleManagerImpl getAllArticles", e);
        }
    }

   public void insertArticle (Article article, int id) throws BLLException {
        if(article.getIdArt()==null) {
            try {
                articleDao.insert(article,id);
            } catch (DALException e) {
                throw new BLLException("Error ArticleManagerImpl enregistrerArticle : " + article, e);
            }
        } else {
            try {
                articleDao.update(article,id);
            } catch (DALException e) {
                throw new BLLException("Error ArticleManagerImpl enregistrerArticle : " + article, e);
            }
        }
    }

    public void deleteArticle(Integer idArt) throws BLLException{
        try {
                articleDao.delete(idArt);
        }catch (DALException e) {
            throw new BLLException("Error ArticleManagerImpl deleteArticle : " + idArt,e);
        }
    }

    public void selectById(Integer id) throws BLLException {
        try {
            articleDao.selectById(id);
        } catch (DALException e) {
            throw new BLLException("Error ArticleManagerImpl selectById : " + id, e);
        }
    }

    public void updateArticle(Article article, int idUser) throws BLLException {
        try {
            articleDao.update(article, idUser);
        } catch (DALException e) {
            throw new BLLException("Error ArticleManagerImpl updateArticle : " + idUser, e);
        }
    }

    public void selectByUserArticle(Integer idArt) throws BLLException {
        try {
            articleDao.selectByUser(idArt);
        } catch (DALException e) {
            throw new BLLException("Error ArticleManagerImpl selectByUserArticle : " + idArt, e);
        }
    }

    public void selectCategorieArticle (int no_article) throws BLLException {
        try {
            articleDao.selectCategorie(no_article);
        } catch (DALException e) {
            throw new BLLException("Error ArticleManagerImpl selectCategorieArt : " + no_article, e);
        }
    }

    public void insertEnchere (Bid bid, Integer idBid)  throws BLLException {
        try {
            articleDao.insertEnchere(bid, idBid);
        } catch (DALException e) {
            throw new BLLException("Error ArticleManagerImpl insertEnchere : " + idBid, e);
        }
    }

}