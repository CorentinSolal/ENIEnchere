package fr.eni.enienchere.bo;

public class User {

    private Integer noUser;
    private String pseudo;
    private String nom;
    private String prenom;
    private String adresse;
    private Integer cpo;
    private String email;
    private Integer telephone;
    private String password;
    private int credit;
    private boolean admin;

    public User(Integer noUser, String pseudo, String nom, String prenom, String adresse, Integer cpo, String email, Integer telephone, String password) {
        this.noUser = noUser;
        this.pseudo = pseudo;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.cpo = cpo;
        this.email = email;
        this.telephone = telephone;
        this.password = password;
    }

    public User(String pseudo, String nom, String prenom, String adresse, Integer cpo, String email, Integer telephone, String password) {
        this.pseudo = pseudo;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.cpo = cpo;
        this.email = email;
        this.telephone = telephone;
        this.password = password;
    }

    public Integer getNoUser() {
        return noUser;
    }

    public void setNoUser(Integer noUser) {
        this.noUser = noUser;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Integer getCpo() {
        return cpo;
    }

    public void setCpo(Integer cpo) {
        this.cpo = cpo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getTelephone() {
        return telephone;
    }

    public void setTelephone(Integer telephone) {
        this.telephone = telephone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
}
