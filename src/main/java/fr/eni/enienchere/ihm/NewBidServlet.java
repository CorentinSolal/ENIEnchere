package fr.eni.enienchere.ihm;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "NewBidServlet", value = "/NewBidServlet")
public class NewBidServlet extends HttpServlet {
    private static final String INDEX="/index.jsp";
    private static final String CONNECTION="/connection.jsp";
    private static final String BIDLIST="/bidList.jsp";
    private static final String NEWBID=".jsp";
    private static final String PROFIL="/profil.jsp";
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
