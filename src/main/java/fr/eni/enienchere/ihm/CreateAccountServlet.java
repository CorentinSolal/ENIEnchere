package fr.eni.enienchere.ihm;

import fr.eni.enienchere.bll.BLLException;
import fr.eni.enienchere.bll.BLLFactory;
import fr.eni.enienchere.bll.UserManager;
import fr.eni.enienchere.bo.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CreateAccountServlet", value = "/CreateAccountServlet")
public class CreateAccountServlet extends HttpServlet {
    private static final String INDEX="/index.jsp";
    private static final String NEWACCOUNT="/newAccount.jsp";

    private UserManager userManager;
    private HttpSession session;
    @Override
    public void init() throws ServletException {
        userManager= BLLFactory.getUserManager();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        session=request.getSession();
        getServletContext().getRequestDispatcher(NEWACCOUNT).forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        session=request.getSession();
        User newUser = new User();
        newUser.setPseudo(request.getParameter("username"));
        newUser.setLastName(request.getParameter("lastName"));
        newUser.setFirstName(request.getParameter("firstName"));
        newUser.setEmail(request.getParameter("email"));
        newUser.setTelephone(request.getParameter("phoneNumber"));
        newUser.setAdresse(request.getParameter("street"));
        newUser.setCpo(request.getParameter("postalCode"));
        newUser.setVille(request.getParameter("city"));
        newUser.setPassword(request.getParameter("password"));

        try {
            userManager.addUser(newUser);
            response.sendRedirect("HomeServlet");
        } catch (BLLException e) {
            e.printStackTrace();
        }

    }
}