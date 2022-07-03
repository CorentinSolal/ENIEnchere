package fr.eni.enienchere.dal;

import fr.eni.enienchere.bo.Bid;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BidDAOImpl implements BidDAO{

    private static final String NEWBID="insert into ENCHERE(date_enchere, montantEnchere) values(?,?)";


    public BidDAOImpl() {
    }

    public void newBid(Bid bid) throws DALException {
        try (Connection conn = ConnectionProvider.getConnection()) {

            PreparedStatement stmt = conn.prepareStatement(NEWBID);

            ResultSet rs = stmt.executeQuery();

        } catch (SQLException e) {
            e.printStackTrace();
            throw new DALException("erreur select all", e);
        }
    }

}
