package fr.eni.enienchere.bll;

import fr.eni.enienchere.bo.User;

public interface UserManager {
    void addUser(User user) throws BLLException;
    void updateUser(User user) throws BLLException;
    void deleteUser(Integer id) throws BLLException;
    User selectUser(Integer id) throws BLLException;
    User connectUser(String username, String password) throws BLLException;
}
