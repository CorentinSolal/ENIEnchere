package fr.eni.enienchere.dal;

import fr.eni.enienchere.bo.Categorie;

public interface CategorieDAO {

    void insert(Categorie categorie) throws DALException ;

    void delete(Integer noCategorie) throws DALException ;

    void update(Categorie categorie) throws DALException ;
}
