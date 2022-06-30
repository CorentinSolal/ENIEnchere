package fr.eni.enienchere.bo;

public class Retrait {
    private String rue;
    private String cpo;
    private String ville;
    public Retrait(String rue, String cpo, String ville) {
        this.rue = rue;
        this.cpo = cpo;
        this.ville = ville;
    }
    public String getRue() {
        return rue;
    }
    public void setRue(String rue) {
        this.rue = rue;
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
}
