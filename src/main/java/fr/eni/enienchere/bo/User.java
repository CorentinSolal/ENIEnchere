package fr.eni.enienchere.bo;

public class User {

    private Integer noUser;
    private String pseudo;
    private String nom;
    private String prenom;
    private String adresse;
    private String cpo;
    private String ville;
    private String email;
    private String telephone;
    private String password;
    private int credit;
    private boolean admin;

    public User(Integer noUser, String pseudo, String nom, String prenom, String adresse, String cpo,String ville, String email, String telephone, String password) {
        this.noUser = noUser;
        this.pseudo = pseudo;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.cpo = cpo;
        this.ville =ville;
        this.email = email;
        this.telephone = telephone;
        this.password = password;
        this.credit=1000;
        this.admin=false;
    }

    public User(String pseudo, String nom, String prenom, String adresse, String cpo,String ville, String email, String telephone, String password) {
        this.pseudo = pseudo;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.cpo = cpo;
        this.ville =ville;
        this.email = email;
        this.telephone = telephone;
        this.password = password;
        this.credit=1000;
        this.admin=false;
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

    public String getCpo() {
        return cpo;
    }

    public void setCpo(String cpo) {
        this.cpo = cpo;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
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
