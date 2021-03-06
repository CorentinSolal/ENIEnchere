package fr.eni.enienchere.ihm;

import fr.eni.enienchere.bll.ArticleManager;
import fr.eni.enienchere.bll.BLLException;
import fr.eni.enienchere.bll.BLLFactory;
import fr.eni.enienchere.bo.Article;
import fr.eni.enienchere.bo.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet({"/HomeServlet",""})
public class HomeServlet extends HttpServlet {
    private static final String INDEX="/index.jsp";
    private static final String CONNECTION="/connection.jsp";
    private static final String BIDLIST="/bidList.jsp";
    private static final String NEWBID="/newBid.jsp";
    private static final String PROFIL="/profil.jsp";
    private static final String MODIFPROFILE="/modifProfil.jsp";


    private HttpSession session;
    private ArticleManager am = BLLFactory.getArticleManager();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        List<Article> listeArticles = new ArrayList<Article>();
        session= request.getSession();
        User user= (User) session.getAttribute("user");
        request.setAttribute("user", user);
        try {
            listeArticles=am.getAllArticles();
            request.setAttribute("article", listeArticles);
        } catch (BLLException e) {
            throw new RuntimeException(e);
        }

        getServletContext().getRequestDispatcher(INDEX).forward(request, response);
    }
}