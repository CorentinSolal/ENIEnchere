package fr.eni.enienchere.bo;

import java.time.LocalDate;

public class Bid {
    private LocalDate dateEnchere;
    private int montantEnchere;

    public Bid(LocalDate dateEnchere, int montantEnchere) {
        this.dateEnchere = dateEnchere;
        this.montantEnchere = montantEnchere;
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
