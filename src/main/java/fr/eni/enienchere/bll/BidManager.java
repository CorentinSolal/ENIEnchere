package fr.eni.enienchere.bll;

import fr.eni.enienchere.bo.Bid;

public interface BidManager {

    void saveBid(Bid bid) throws BLLException;

}
