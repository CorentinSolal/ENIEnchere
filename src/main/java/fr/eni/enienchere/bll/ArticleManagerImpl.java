package fr.eni.enienchere.bll;

import fr.eni.enienchere.bo.Article;
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
            throw new BLLException("Erreur ArticleManagerImpl getAllArticles", e);
        }
    }

   /*public void enregistrerArticle (Article article, int id) throws BLLException { //TODO FAUT FINIR CA
        if(article.getIdArt()==null) {
            try {
                articleDao.insert(article,id);
            } catch (DALException e) {
                throw new BLLException("Erreur ArticleManagerImpl enregistrerArticle : " + article, e);
            }
        } else {
            try {
                articleDao.update(article,id);
            } catch (DALException e) {
                throw new BLLException("Erreur ArticleManagerImpl enregistrerArticle : " + article, e);
            }
        }
    }*/

    public void deleteArticle(Integer idArt) throws BLLException{
        try {
                articleDao.delete(idArt);
        }catch (DALException e) {
            throw new BLLException("Erreur ArticleManagerImpl deleteArticle : " + idArt,e);
        }
    }
}