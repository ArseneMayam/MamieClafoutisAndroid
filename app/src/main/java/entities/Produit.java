package entities;

/**
 * Created by mayammouarangue on 24/11/17.
 */

public class Produit {
    //attributs
    private int id;
    private String nom;
    private int categorie_id;
    private String description;
    private Float prix;
    private String url_image;
    private int estvisible;
    private String reference;

    //constructeur

    public Produit(int id, String nom, int categorie_id, String description, Float prix, String url_image, int estvisible, String reference) {
        this.id = id;
        this.nom = nom;
        this.categorie_id = categorie_id;
        this.description = description;
        this.prix = prix;
        this.url_image = url_image;
        this.estvisible = estvisible;
        this.reference = reference;
    }

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

    public int getCategorie_id() {
        return categorie_id;
    }

    public void setCategorie_id(int categorie_id) {
        this.categorie_id = categorie_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getPrix() {
        return prix;
    }

    public void setPrix(Float prix) {
        this.prix = prix;
    }

    public String getUrl_image() {
        return url_image;
    }

    public void setUrl_image(String url_image) {
        this.url_image = url_image;
    }

    public int getEstvisible() {
        return estvisible;
    }

    public void setEstvisible(int estvisible) {
        this.estvisible = estvisible;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
}
