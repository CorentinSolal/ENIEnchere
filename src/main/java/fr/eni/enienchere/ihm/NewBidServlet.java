package fr.eni.enienchere.ihm;

import fr.eni.enienchere.bll.ArticleManager;
import fr.eni.enienchere.bll.BLLException;
import fr.eni.enienchere.bll.BLLFactory;
import fr.eni.enienchere.bo.Article;
import fr.eni.enienchere.bo.Categorie;
import fr.eni.enienchere.bo.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;

@WebServlet(name = "NewBidServlet", value = "/NewBidServlet")
public class NewBidServlet extends HttpServlet {
    private static final String NEWBID="/newBid.jsp";
    private ArticleManager am;
    private HttpSession session;
    @Override
    public void init() throws ServletException {
        am= BLLFactory.getArticleManager();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getSession();
        session=request.getSession();
        User user= (User) session.getAttribute("user");
        request.setAttribute("user", user);
        try {
            List<Categorie> categories=am.selectCategories();
            request.setAttribute("categories", categories);
        } catch (BLLException e) {
            e.printStackTrace();
        }

        getServletContext().getRequestDispatcher(NEWBID).forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getSession();
        User user= (User) session.getAttribute("user");

        Article newArticle = new Article();

        newArticle.setNoCat(request.getParameter("categorie"));
        newArticle.setNameArt(request.getParameter("name"));
        newArticle.setDescArt(request.getParameter("description"));

        //Transformer le String endDate en LocalDate
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        formatter = formatter.withLocale( Locale.FRANCE );
        LocalDate date = LocalDate.parse(request.getParameter("endDate"), formatter);

        newArticle.setDateEnd(date);
        newArticle.setStartPrice(Integer.parseInt(request.getParameter("startPrice")));
        newArticle.setImageUrl(request.getParameter("urlImage"));

        try {
            am.insertArticle(newArticle,user.getNoUser());
            response.sendRedirect("HomeServlet");
        } catch (BLLException e) {
            getServletContext().getRequestDispatcher(NEWBID).forward(request, response);
            e.printStackTrace();
        }
    }
}
