package fr.eni.enienchere.dal;

import fr.eni.enienchere.bo.Bid;

public interface BidDAO {

    void newBid(Bid bid) throws DALException;
}
