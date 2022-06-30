package fr.eni.enienchere.dal;

import fr.eni.enienchere.bo.Bid;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BidDAOImpl implements BidDAO{
    // TODO FAIRE LA DAO POUR LIER LA BO A LA BASE DE DONNEES
    //TODO REPRENDRE LES MEMES METHODES QUE LES AUTRES DAO

    private static final String NEWBID="";
    private static final String SETDATE="";

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
    public void setDate() throws DALException {
        try (Connection conn = ConnectionProvider.getConnection()) {

            PreparedStatement stmt = conn.prepareStatement(SETDATE);

            ResultSet rs = stmt.executeQuery();

        } catch (SQLException e) {
            e.printStackTrace();
            throw new DALException("erreur select all", e);
        }
    }
}
