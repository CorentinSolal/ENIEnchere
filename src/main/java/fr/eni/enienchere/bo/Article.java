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
        setDateStart();
        this.dateEnd = dateEnd;
        this.startPrice = startPrice;
        this.endPrice = startPrice;
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
    public void setNoCat(String libelle) {
        switch (libelle) {
            case "Instruments de musique" : this.noCat = 1; break;
            case "Informatique" : this.noCat = 2; break;
            case "Mobilier" : this.noCat = 3; break;
            case "Vêtements" : this.noCat = 4; break;
            case "Nourritures" : this.noCat = 5; break;
            case "autre" : this.noCat = 6; break;
            default:this.noCat =6;break;
        }
    }
    public LocalDate getDateStart() {
        return dateStart;
    }
    public void setDateStart() {
        this.dateStart = LocalDate.now();
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
    public String toString() {
        return "Article{" +
                "idArt=" + idArt +
                ", nameArt='" + nameArt + '\'' +
                ", descArt='" + descArt + '\'' +
                ", noCat=" + noCat +
                ", dateStart=" + dateStart +
                ", dateEnd=" + dateEnd +
                ", startPrice=" + startPrice +
                ", endPrice=" + endPrice +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
