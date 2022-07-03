package fr.eni.enienchere.bo;

import java.sql.Date;
import java.time.LocalDate;

public class Article {

    private Integer idArt;
    private String nomArt;
    private String descArt;
    private Integer noCat;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private Integer prixInit;
    private Integer prixFinal;

    public Article() {
    }

    public Article(String nomArt, String descArt, Integer noCat, LocalDate dateFin, Integer prixInit) {
        this.nomArt = nomArt;
        this.descArt = descArt;
        this.noCat = noCat;
        this.dateDebut=LocalDate.now();
        this.dateFin = dateFin;
        this.prixInit = prixInit;
        prixFinal = prixInit;
    }
    public Article(Integer idArt,String nomArt, String descArt, Integer noCat, LocalDate dateFin, Integer prixInit) {
        this.idArt = idArt;
        this.nomArt = nomArt;
        this.descArt = descArt;
        this.noCat = noCat;
        this.dateDebut=LocalDate.now();
        this.dateFin = dateFin;
        this.prixInit = prixInit;
        this.prixFinal = prixInit;
    }

    public Article(Integer idArt, String nomArt, String descArt, LocalDate dateDebut, LocalDate dateFin, Integer prixInit, Integer prixFinal, Integer noCat) {
        this.idArt = idArt;
        this.nomArt = nomArt;
        this.descArt = descArt;
        this.noCat = noCat;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.prixInit = prixInit;
        this.prixFinal = prixFinal;
    }

    public Integer getIdArt() {
        return idArt;
    }

    public void setIdArt(Integer idArt) {
        this.idArt = idArt;
    }

    public String getNomArt() {
        return nomArt;
    }

    public void setNomArt(String nomArt) {
        this.nomArt = nomArt;
    }

    public String getDescArt() {
        return descArt;
    }

    public void setDescArt(String descArt) {
        this.descArt = descArt;
    }

    public Integer getNoCat() {
        return noCat;
    }

    public void setNoCat(Integer noCat) {
        this.noCat = noCat;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    public Integer getPrixInit() {
        return prixInit;
    }

    public void setPrixInit(Integer prixInit) {
        this.prixInit = prixInit;
    }

    public Integer getPrixFinal() {
        return prixFinal;
    }

    public void setPrixFinal(Integer prixFinal) {
        this.prixFinal = prixFinal;
    }
}
