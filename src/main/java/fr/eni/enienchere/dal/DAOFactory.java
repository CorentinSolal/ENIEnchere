package fr.eni.enienchere.dal;

public class DAOFactory {
    private static ArticleDAO instanceArticle;
    private static UserDAO instanceUser;
        public static ArticleDAO getArticleDao() {
        if (instanceArticle==null)
            instanceArticle = new ArticleDAOImpl();
        return instanceArticle;
    }
    public static UserDAO getUserDAO(){
        if (instanceUser==null)
            instanceUser = new UserDAOImpl();
        return instanceUser;
    }
}
