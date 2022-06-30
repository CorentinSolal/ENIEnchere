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
    private static final String CONNECTION="/connection.jsp";
    private static final String BIDLIST="/bidList.jsp";
    private static final String NEWBID="/.jsp";
    private static final String PROFIL="/profil.jsp";
    private static final String NEWACCOUNT="/newAccount.jsp";

    UserManager userManager= BLLFactory.getUserManager();

    @Override
    public void init() throws ServletException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher(NEWACCOUNT).forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String pseudo=request.getParameter("pseudo");
        String lastName=request.getParameter("name");
        String firstName=request.getParameter("firstName");
        String phoneNumber=request.getParameter("phoneNumber");
        String email=request.getParameter("email");
        String password=request.getParameter("password");
        String street=request.getParameter("street");
        String postalCode=request.getParameter("postalCode");
        String city=request.getParameter("city");

        try {
            userManager.addUser(new User(pseudo,lastName,firstName,street,postalCode,city,email,phoneNumber,password));
        } catch (BLLException e) {
            throw new RuntimeException(e);
        }
        response.sendRedirect(INDEX);

    }
}
