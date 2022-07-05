package fr.eni.enienchere.bo;

import java.sql.Date;
import java.time.LocalDate;

public class Article {

    private Integer idArt;
    private String nameArt;
    private String descArt;
    private Integer noCat;
    private LocalDate dateStart;
    private LocalDate dateEnd;
    private Integer startPrice;
    private Integer endPrice;

    private String imageUrl;

    public Article() {
    }

    public Article(Integer idArt, String nameArt, String descArt, LocalDate dateStart, LocalDate dateEnd, Integer startPrice, Integer endPrice, Integer noCat, String imageUrl) {
        this.idArt = idArt;
        this.nameArt = nameArt;
        this.descArt = descArt;
        this.noCat = noCat;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.startPrice = startPrice;
        this.endPrice = endPrice;
        this.imageUrl = imageUrl;
    }

    public Integer getIdArt() {
        return idArt;
    }

    public void setIdArt(Integer idArt) {
        this.idArt = idArt;
    }

    public String getNameArt() {
        return nameArt;
    }

    public void setNameArt(String nameArt) {
        this.nameArt = nameArt;
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

    public LocalDate getDateStart() {
        return dateStart;
    }

    public void setDateStart(LocalDate dateStart) {
        this.dateStart = dateStart;
    }

    public LocalDate getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(LocalDate dateEnd) {
        this.dateEnd = dateEnd;
    }

    public Integer getStartPrice() {
        return startPrice;
    }

    public void setStartPrice(Integer startPrice) {
        this.startPrice = startPrice;
    }

    public Integer getEndPrice() {
        return endPrice;
    }

    public void setEndPrice(Integer endPrice) {
        this.endPrice = endPrice;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
