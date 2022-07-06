package fr.eni.enienchere.bo;

import java.time.LocalDate;

public class Bid {

    private Integer idBid;
    private LocalDate bidDate;
    private int bidAmount;

    public Bid(LocalDate bidDate, int bidAmount) {
        this.bidDate = bidDate;
        this.bidAmount = bidAmount;
    }

    public Bid(Integer idBid, LocalDate bidDate, int bidAmount) {
        this.idBid = idBid;
        this.bidDate = bidDate;
        this.bidAmount = bidAmount;
    }

    public Integer getIdBid() {
        return idBid;
    }

    public void setIdBid(Integer idBid) {
        this.idBid = idBid;
    }

    public LocalDate getBidDate() {
        return bidDate;
    }

    public void setBidDate(LocalDate bidDate) {
        this.bidDate = bidDate;
    }

    public int getBidAmount() {
        return bidAmount;
    }

    public void setBidAmount(int bidAmount) {
        this.bidAmount = bidAmount;
    }
}
