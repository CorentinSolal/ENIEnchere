package fr.eni.enienchere.bo;

import java.time.LocalDate;

public class Article {

    private Integer idArt;
    private String nomArt;
    private String descArt;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private Integer prixInit;
    private Integer prixFinal;

    public Article() {
    }

    public Article(String nomArt, String descArt, LocalDate dateFin, Integer prixInit) {
        this.nomArt = nomArt;
        this.descArt = descArt;
        this.dateFin = dateFin;
        this.prixInit = prixInit;
    }

    public Article(String nomArt, String descArt, LocalDate dateDebut, LocalDate dateFin, Integer prixInit, Integer prixFinal) {
        this.nomArt = nomArt;
        this.descArt = descArt;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.prixInit = prixInit;
        this.prixFinal = prixFinal;
    }

    public Article(Integer idArt, String nomArt, String descArt, LocalDate dateDebut, LocalDate dateFin, Integer prixInit, Integer prixFinal) {
        this.idArt = idArt;
        this.nomArt = nomArt;
        this.descArt = descArt;
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
