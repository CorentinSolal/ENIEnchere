package fr.eni.enienchere.ihm;

import fr.eni.enienchere.bll.ArticleManager;
import fr.eni.enienchere.bll.BLLException;
import fr.eni.enienchere.bll.BLLFactory;
import fr.eni.enienchere.bo.Article;
import fr.eni.enienchere.bo.Categorie;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "BidListServlet", value = "/BidListServlet")
public class BidListServlet extends HttpServlet {
    private static final String INDEX="/index.jsp";
    private static final String CONNECTION="/connection.jsp";
    private static final String BIDLIST="/bidList.jsp";
    private static final String NEWBID=".jsp";
    private static final String PROFIL="/profil.jsp";
    HttpSession session;
    private ArticleManager am = BLLFactory.getArticleManager();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        session = request.getSession();

        try {
            List<Categorie> categories=am.selectCategories();
            request.setAttribute("categories", categories);

            List<Article> listeArticles=am.getAllArticles();
            request.setAttribute("article", listeArticles);
        } catch (BLLException e) {
            throw new RuntimeException(e);
        }
        getServletContext().getRequestDispatcher(BIDLIST).forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        session= request.getSession();
        String keyword=request.getParameter("keyword");
        try {
            List<Article> listeArticles=am.getArtByMotCle(keyword);
            session.setAttribute("article", listeArticles);
            getServletContext().getRequestDispatcher(BIDLIST).forward(request, response);
        } catch (BLLException e) {
            e.printStackTrace();
            response.sendRedirect("HomeServlet");
        }
    }
}