package fr.eni.enienchere.bo;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class User {
    private Integer noUser;
    private String pseudo;
    private String lastName;
    private String firstName;
    private String adresse;
    private String cpo;
    private String ville;
    private String email;
    private String telephone;
    private String password;
    private int credit;
    private byte admin;
    public User() {
    }

    public User(String pseudo, String lastName, String firstName, String adresse, String cpo, String ville, String email, String telephone, String password, int credit, byte admin) {
        this.pseudo = pseudo;
        this.lastName = lastName;
        this.firstName = firstName;
        this.adresse = adresse;
        this.cpo = cpo;
        this.ville = ville;
        this.email = email;
        this.telephone = telephone;
        this.password = password;
        this.credit = credit;
        this.admin = admin;
    }

    public User(Integer noUser, String pseudo, String lastName, String firstName, String adresse, String cpo, String ville, String email, String telephone, String password, int credit, byte admin) {
        this.noUser = noUser;
        this.pseudo = pseudo;
        this.lastName = lastName;
        this.firstName = firstName;
        this.adresse = adresse;
        this.cpo = cpo;
        this.ville = ville;
        this.email = email;
        this.telephone = telephone;
        this.password = password;
        this.credit = credit;
        this.admin = admin;
    }

    public User(String pseudo, String lastName, String firstName, String adresse, String cpo, String ville, String email, String telephone, String password) {
        this.pseudo = pseudo;
        this.lastName = lastName;
        this.firstName = firstName;
        this.adresse = adresse;
        this.cpo = cpo;
        this.ville = ville;
        this.email = email;
        this.telephone = telephone;
        this.password = password;
    }

    public User(Integer noUser, String pseudo, String lastName, String firstName, String adresse, String cpo, String ville, String email, String telephone, String password) {
        this.noUser = noUser;
        this.pseudo = pseudo;
        this.lastName = lastName;
        this.firstName = firstName;
        this.adresse = adresse;
        this.cpo = cpo;
        this.ville = ville;
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
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
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
    public byte getAdmin() {
        return admin;
    }
    public void setAdmin(byte admin) {
        this.admin = admin;
    }
    public String toString() {
        return "User{" +
                "noUser=" + noUser +
                ", username='" + pseudo + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", adresse='" + adresse + '\'' +
                ", cpo='" + cpo + '\'' +
                ", ville='" + ville + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", password='" + password + '\'' +
                ", credit=" + credit +
                ", admin=" + admin +
                '}';
    }
}
