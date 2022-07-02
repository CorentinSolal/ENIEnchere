package fr.eni.enienchere.ihm;

import fr.eni.enienchere.bll.BLLException;
import fr.eni.enienchere.bll.BLLFactory;
import fr.eni.enienchere.bll.UserManager;
import fr.eni.enienchere.bo.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ConnectionServlet", value = "/ConnectionServlet")
public class ConnectionServlet extends HttpServlet {
    private static final String INDEX="/index.jsp";
    private static final String CONNECTION="/connection.jsp";
    private static final String BIDLIST="/bidList.jsp";
    private static final String NEWBID="/.jsp";
    private static final String PROFIL="/profil.jsp";

    private UserManager um;
    private HttpSession session;
    @Override
    public void init() throws ServletException {
        um= BLLFactory.getUserManager();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher(CONNECTION).forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        session=request.getSession();
        try {
            User user= um.connectUser(request.getParameter("username"), request.getParameter("password"));
            session.setAttribute("id", user.getNoUser());
            session.setAttribute("username", user.getPseudo());
            session.setAttribute("connected","true");
            System.out.println(request.getParameter("username"));
            System.out.println(request.getParameter("password"));
            request.getRequestDispatcher(INDEX).forward(request, response);
        }catch (BLLException e) {
            request.setAttribute("error", "Erreur lors de la connection");
            request.getRequestDispatcher(CONNECTION).forward(request, response);
            e.printStackTrace();
        }
    }
}
