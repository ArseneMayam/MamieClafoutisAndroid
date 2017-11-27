package entities;

/**
 * Created by mayammouarangue on 24/11/17.
 */

public class Produit {
    //attributs
    private int id;
    private String nom;
    private Categorie categorie;
    private String description;
    private Float prix;
    private boolean estVisible;
    private String reference;
    private Float poid;
    private Unite unite;


    //constructeur




    // getters and setters
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public Float getPrix() {
        return prix;
    }

    public void setPrix(Float prix) {
        this.prix = prix;
    }

    public boolean isEstVisible() {
        return estVisible;
    }

    public void setEstVisible(boolean estVisible) {
        this.estVisible = estVisible;
    }

    public Float getPoid() {
        return poid;
    }

    public void setPoid(Float poid) {
        this.poid = poid;
    }

    public Unite getUnite() {
        return unite;
    }

    public void setUnite(Unite unite) {
        this.unite = unite;
    }
}
