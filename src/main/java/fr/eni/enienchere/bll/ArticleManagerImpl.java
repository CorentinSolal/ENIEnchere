package fr.eni.enienchere.bll;

import fr.eni.projectsevenenchere.bo.Article;
import fr.eni.projectsevenenchere.dal.ArticleDAO;
import fr.eni.projectsevenenchere.dal.DALException;
import fr.eni.projectsevenenchere.dal.DAOFactory;

import java.util.List;

public class ArticleManagerImpl implements ArticleManager   {

    private ArticleDAO articleDao;

    public ArticleManagerImpl() {
         articleDao = DAOFactory.getArticleDao(); //couplage faible
    }

    public List<Article> getAllArticles() throws BLLException {
        try {
            return articleDao.selectAll();
        } catch (DALException e) {
            throw new BLLException("", e);
        }
    }

   public void enregistrerArticle (Article article) throws BLLException {
        if(article.getIdArt()==null) {
            try {
                articleDao.insert(article);
            } catch (DALException e) {
                throw new BLLException("enregistrerArticle : " + article, e);
            }
        } else {
            try {
                articleDao.update(article);
            } catch (DALException e) {
                throw new BLLException("enregistrerArticle : " + article, e);
            }
        }
    }

    public void deleteArticle(Integer idArt) throws BLLException{
        try {
                articleDao.delete(idArt);
        }catch (DALException e) {
            throw new BLLException("supprimerArticle : " + idArt,e);
        }
    }
}