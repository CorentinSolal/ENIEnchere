package fr.eni.enienchere.bll;

import fr.eni.projectsevenenchere.bo.Categorie;
import fr.eni.projectsevenenchere.dal.CategorieDAO;
import fr.eni.projectsevenenchere.dal.DALException;
import fr.eni.projectsevenenchere.dal.DAOFactory;

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
