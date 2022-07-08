package fr.eni.enienchere.ihm;

import fr.eni.enienchere.bll.ArticleManager;
import fr.eni.enienchere.bll.BLLException;
import fr.eni.enienchere.bll.BLLFactory;
import fr.eni.enienchere.bll.UserManager;
import fr.eni.enienchere.bo.Article;
import fr.eni.enienchere.bo.User;

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
     UserManager um = BLLFactory.getUserManager();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            session=request.getSession();
            User user= (User) session.getAttribute("user");

            int idUser=am.getUserByNoArt(Integer.parseInt(request.getParameter("id")));

            Article article=am.selectById(Integer.parseInt(request.getParameter("id")));

            User seller=um.selectUser(idUser);
            request.setAttribute("user", user);
            request.setAttribute("seller",seller);
            request.setAttribute("article", article);
        }catch (BLLException e) {
            throw new RuntimeException(e);
        }
       getServletContext().getRequestDispatcher(BIDDETAILS).forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        session=request.getSession();
        response.sendRedirect("HomeServlet");
    }
}
