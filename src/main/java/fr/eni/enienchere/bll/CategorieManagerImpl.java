package fr.eni.enienchere.bll;

import fr.eni.enienchere.bo.Categorie;
import fr.eni.enienchere.dal.CategorieDAO;
import fr.eni.enienchere.dal.DALException;
import fr.eni.enienchere.dal.DAOFactory;

public class CategorieManagerImpl implements CategorieManager {

    private CategorieDAO categorieDAO;

    public CategorieManagerImpl( ) {
        categorieDAO = DAOFactory.getCategorieDAO();
    }

    public void enregistrerCategorie(Categorie categorie) throws BLLException{
        if(categorie.getNoCategorie()==null){
            try{
                categorieDAO.insert(categorie);
            } catch (DALException e){
                throw new BLLException("enregistrerCategorie"+ categorie,e);
            }
        }
    }

    public void deleteCategorie(Integer noCategorie) throws BLLException {
        try{
            categorieDAO.delete(noCategorie);
        }catch (DALException e){
            throw new BLLException("deleteCategorie"+ noCategorie,e);
        }
    }
}
