package fr.eni.enienchere.ihm;

import fr.eni.enienchere.bll.ArticleManager;
import fr.eni.enienchere.bll.BLLException;
import fr.eni.enienchere.bll.BLLFactory;
import fr.eni.enienchere.bo.Article;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet (name = "BidDetailsServlet", value = "/BidDetailsServlet")
public class BidDetailsServlet extends HttpServlet {
    private static final String INDEX="/index.jsp";
    private static final String CONNECTION="/connection.jsp";
    private static final String BIDDETAILS ="/bidDetails.jsp";
    private static final String NEWBID=".jsp";
    private static final String PROFIL="/profil.jsp";

    HttpSession session;

     ArticleManager am = BLLFactory.getArticleManager();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArticleManager am = BLLFactory.getArticleManager();
        Article article=null;
        try {
            article=am.selectById(10);
            request.setAttribute("article", am);
        }catch (BLLException e) {
            throw new RuntimeException(e);
        }
       session = request.getSession();
       getServletContext().getRequestDispatcher(BIDDETAILS).forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        session=request.getSession();
        doGet(request, response);
    }
}
