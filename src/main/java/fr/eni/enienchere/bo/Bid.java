package fr.eni.enienchere.bo;

import java.time.LocalDate;

public class Bid {

    private Integer idBid;
    private LocalDate dateEnchere;
    private int montantEnchere;

    public Bid(Integer idBid, LocalDate dateEnchere, int montantEnchere) {
        this.idBid = idBid;
        this.dateEnchere = dateEnchere;
        this.montantEnchere = montantEnchere;
    }

    public Bid(LocalDate dateEnchere, int montantEnchere) {
        this.dateEnchere = dateEnchere;
        this.montantEnchere = montantEnchere;
    }

    public Integer getIdBid() {
        return idBid;
    }

    public void setIdBid(Integer idBid) {
        this.idBid = idBid;
    }

    public LocalDate getDateEnchere() {
        return dateEnchere;
    }

    public void setDateEnchere(LocalDate dateEnchere) {
        this.dateEnchere = dateEnchere;
    }

    public int getMontantEnchere() {
        return montantEnchere;
    }

    public void setMontantEnchere(int montantEnchere) {
        this.montantEnchere = montantEnchere;
    }
}
