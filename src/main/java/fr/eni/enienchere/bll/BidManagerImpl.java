package fr.eni.enienchere.bll;

import fr.eni.enienchere.bo.Bid;
import fr.eni.enienchere.dal.BidDAO;
import fr.eni.enienchere.dal.DALException;
import fr.eni.enienchere.dal.DAOFactory;

public class BidManagerImpl implements BidManager{

    private BidDAO bidDAO;

    public BidManagerImpl(){bidDAO = DAOFactory.getBidDAO();}

    public void saveBid(Bid bid) throws BLLException{
        if (bid.getIdBid()==null){
            try {
                bidDAO.newBid(bid);
            }catch (DALException e){
                throw new BLLException("saveBid :" + bid,e);
            }
        }
        }



}
