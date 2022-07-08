package fr.eni.enienchere.bll;

public class BLLFactory {

    private static ArticleManagerImpl instanceArt;
    private static UserManagerImpl instanceUser;

    public static ArticleManagerImpl getArticleManager() {
        if (instanceArt == null) {
            instanceArt = new ArticleManagerImpl();
        }
        return instanceArt;
    }
    public static UserManagerImpl getUserManager() {
        if (instanceUser == null) {
            instanceUser = new UserManagerImpl();
        }
        return instanceUser;
    }
}
