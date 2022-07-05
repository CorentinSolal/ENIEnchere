package fr.eni.enienchere.ihm;

import fr.eni.enienchere.bll.BLLException;
import fr.eni.enienchere.bll.BLLFactory;
import fr.eni.enienchere.bll.UserManager;
import fr.eni.enienchere.bo.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ProfilServlet", value = "/ProfilServlet")
public class ProfilServlet extends HttpServlet {
    private static final String INDEX="/index.jsp";
    private static final String CONNECTION="/connection.jsp";
    private static final String BIDLIST="/bidList.jsp";
    private static final String NEWBID=".jsp";
    private static final String PROFIL="/profil.jsp";
    private static final String MODIFPROFIL="/modifProfil.jsp";
    private HttpSession session;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserManager um= BLLFactory.getUserManager();
        User user= null;
        try {
            user = um.selectUser(12);
        } catch (BLLException e) {
            throw new RuntimeException(e);
        }
        session = request.getSession();
        request.setAttribute("user",user);
        getServletContext().getRequestDispatcher(PROFIL).forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        session= request.getSession();
        getServletContext().getRequestDispatcher(MODIFPROFIL).forward(request, response);
    }
}
