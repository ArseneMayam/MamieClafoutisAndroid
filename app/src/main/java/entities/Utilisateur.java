package entities;

/**
 * Created by mayammouarangue on 24/11/17.
 */

public class Utilisateur {


    // attributs
    private int id;
    private String nom;
    private String prenom;
    private int etablissement_id;
    private int role_id;
    private String userName;
    private String password;
    private boolean isVisible;
    private String tokenIdentification;
    private String tokenInscription;

    // contructeurs

    public Utilisateur(int id, String nom, String prenom, int etablissement_id, int role_id, String userName, String password, boolean isVisible, String tokenIdentification, String tokenInscription) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.etablissement_id = etablissement_id;
        this.role_id = role_id;
        this.userName = userName;
        this.password = password;
        this.isVisible = isVisible;
        this.tokenIdentification = tokenIdentification;
        this.tokenInscription = tokenInscription;
    }

    //getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getEtablissement_id() {
        return etablissement_id;
    }

    public void setEtablissement_id(int etablissement_id) {
        this.etablissement_id = etablissement_id;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isVisible() {
        return isVisible;
    }

    public void setVisible(boolean visible) {
        isVisible = visible;
    }

    public String getTokenIdentification() {
        return tokenIdentification;
    }

    public void setTokenIdentification(String tokenIdentification) {
        this.tokenIdentification = tokenIdentification;
    }

    public String getTokenInscription() {
        return tokenInscription;
    }

    public void setTokenInscription(String tokenInscription) {
        this.tokenInscription = tokenInscription;
    }
}
