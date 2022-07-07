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
    private static final String BIDDETAILS ="/bidDetails.jsp";
    HttpSession session;

     ArticleManager am = BLLFactory.getArticleManager();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Article article=null;
        try {
            article=am.selectById(Integer.parseInt(request.getParameter("id")));
            System.out.println(article);
            request.setAttribute("article", article);
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
