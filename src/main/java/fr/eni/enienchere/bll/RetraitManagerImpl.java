package fr.eni.enienchere.bll;

import fr.eni.enienchere.bo.Retrait;
import fr.eni.enienchere.dal.DALException;
import fr.eni.enienchere.dal.DAOFactory;
import fr.eni.enienchere.dal.RetraitDAO;

public class RetraitManagerImpl implements RetraitManager{

    private RetraitDAO retraitDAO;

    public RetraitManagerImpl() { retraitDAO = DAOFactory.getRetraitDAO(); }

    public void addRetrait(Retrait retrait) throws BLLException {
        try {
            retraitDAO.addRetrait(retrait);
        } catch (DALException e) {
            throw new BLLException("addRetrait", e);
        }
    }

    public void updateRetrait(Retrait retrait) throws BLLException {
        try {
            retraitDAO.updateRetrait(retrait);
        } catch (DALException e) {
            throw new BLLException("updateRetrait", e);
        }
    }

    public void deleteRetrait(int noArticle) throws BLLException {
        try {
            retraitDAO.deleteRetrait(noArticle);
        } catch (DALException e) {
            throw new BLLException("deleteRetrait", e);
        }
    }

}
