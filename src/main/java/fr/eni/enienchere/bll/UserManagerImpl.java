package fr.eni.enienchere.bll;

import fr.eni.enienchere.bo.User;
import fr.eni.enienchere.dal.DALException;
import fr.eni.enienchere.dal.DAOFactory;
import fr.eni.enienchere.dal.UserDAO;

public class UserManagerImpl implements UserManager{

    private UserDAO userDAO;
    public UserManagerImpl() {
        userDAO= DAOFactory.getUserDAO();
    }

    public void addUser(User user) throws BLLException {
        try {
            userDAO.addUser(user);
        } catch (DALException e) {
            throw new BLLException("Erreur UserManagerImpl addUser",e);
        }
    }
    public void updateUser(User user) throws BLLException {
        try {
            userDAO.updateUser(user);
        } catch (DALException e) {
            throw new BLLException("Erreur UserManagerimpl updateUser",e);
        }
    }
    public void deleteUser(Integer id) throws BLLException {
        try {
            userDAO.deleteUser(id);
        } catch (DALException e) {
            throw new BLLException("Erreur UserManagerImpl deleteUser",e);
        }
    }
    public User selectUser(Integer id) throws BLLException {
        try {
            return userDAO.selectUser(id);
        } catch (DALException e) {
            throw new BLLException("Erreur UserManagerImpl selectUser",e);
        }
    }
    @Override
    public User connectUser(String username, String password) throws BLLException {
        try{
            return userDAO.connectUser(username,password);
        } catch (DALException e) {
            throw new BLLException("Erreur UserManagerImpl connectUser", e);
        }
    }
}
