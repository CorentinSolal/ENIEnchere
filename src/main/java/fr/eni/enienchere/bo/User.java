package fr.eni.enienchere.bo;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class User {

    private Integer noUser;
    @NotBlank
    private String pseudo;
    @NotBlank
    private String lastName;
    @NotBlank
    private String firstName;
    @NotBlank
    private String adresse;
    @NotBlank
    private String cpo;
    @NotBlank
    private String ville;
    @Email
    private String email;
    private String telephone;
    @Size(min=4,max=20,message="Must be 8-20 characteres long")
    private String password;
    private int credit;
    private boolean admin;

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

    public User() {
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

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
}
