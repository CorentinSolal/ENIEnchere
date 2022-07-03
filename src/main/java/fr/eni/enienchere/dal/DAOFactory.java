package fr.eni.enienchere.dal;

public class DAOFactory {

    private static ArticleDAO instanceArticle;
    private static UserDAO instanceUser;

    private static CategorieDAO instanceCategorie;

    private static RetraitDAO instanceRetrait;

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

    public static CategorieDAO getCategorieDAO() {
        if (instanceCategorie ==null)
            instanceCategorie = new CategorieDAOImpl();
        return instanceCategorie;
    }

    public static RetraitDAO getRetraitDAO() {
        if (instanceRetrait==null)
            instanceRetrait = new RetraitDAOImpl();
        return instanceRetrait;
    }

}
