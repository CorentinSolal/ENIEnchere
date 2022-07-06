package fr.eni.enienchere.bo;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class User {

    private Integer noUser;
    @NotBlank
    private String username;
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
    private byte admin;

    public User() {
    }

    public User(String username, String lastName, String firstName, String adresse, String cpo, String ville, String email, String telephone, String password, int credit, byte admin) {
        this.username = username;
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

    public User(Integer noUser, String username, String lastName, String firstName, String adresse, String cpo, String ville, String email, String telephone, String password, int credit, byte admin) {
        this.noUser = noUser;
        this.username = username;
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

    public User(String username, String lastName, String firstName, String adresse, String cpo, String ville, String email, String telephone, String password) {
        this.username = username;
        this.lastName = lastName;
        this.firstName = firstName;
        this.adresse = adresse;
        this.cpo = cpo;
        this.ville = ville;
        this.email = email;
        this.telephone = telephone;
        this.password = password;
    }

    public User(Integer noUser, String username, String lastName, String firstName, String adresse, String cpo, String ville, String email, String telephone, String password) {
        this.noUser = noUser;
        this.username = username;
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
        return username;
    }

    public void setPseudo(String username) {
        this.username = username;
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

    @Override
    public String toString() {
        return "User{" +
                "noUser=" + noUser +
                ", username='" + username + '\'' +
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
