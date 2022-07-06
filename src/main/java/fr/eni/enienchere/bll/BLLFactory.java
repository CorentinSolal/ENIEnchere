package fr.eni.enienchere.bll;

public class BLLFactory {

    public static ArticleManagerImpl getArticleManager() {
        return new ArticleManagerImpl();
    }
    public static UserManagerImpl getUserManager() {
        return new UserManagerImpl();
    }
        public static RetraitManagerImpl getRetraitManager() {return new RetraitManagerImpl();}
}
