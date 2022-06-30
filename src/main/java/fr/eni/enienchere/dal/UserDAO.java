package fr.eni.enienchere.dal;

import fr.eni.enienchere.bo.User;

public interface UserDAO {

    void addUser(User user) throws DALException;
    void updateUser(User user) throws DALException;
    void deleteUser(Integer id) throws DALException;
    User selectUser(Integer id) throws DALException;
}
