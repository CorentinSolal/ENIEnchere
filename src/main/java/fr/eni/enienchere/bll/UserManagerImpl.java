package fr.eni.enienchere.bll;

import fr.eni.projectsevenenchere.bo.User;
import fr.eni.projectsevenenchere.dal.DALException;
import fr.eni.projectsevenenchere.dal.DAOFactory;
import fr.eni.projectsevenenchere.dal.UserDAO;

public class UserManagerImpl implements UserManager{

    private UserDAO userDAO;
    public UserManagerImpl() {
        userDAO= DAOFactory.getUserDAO();
    }

    public void addUser(User user) throws BLLException {
        try {
            userDAO.addUser(user);
        } catch (DALException e) {
            throw new BLLException("",e);
        }
    }
    public void updateUser(User user) throws BLLException {
        try {
            userDAO.updateUser(user);
        } catch (DALException e) {
            throw new BLLException("",e);
        }
    }
    public void deleteUser(Integer id) throws BLLException {
        try {
            userDAO.deleteUser(id);
        } catch (DALException e) {
            throw new BLLException("",e);
        }
    }
    public User selectUser(Integer id) throws BLLException {
        try {
            return userDAO.selectUser(id);
        } catch (DALException e) {
            throw new BLLException("",e);
        }
    }
}
