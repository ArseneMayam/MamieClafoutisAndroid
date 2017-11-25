package entities;

/**
 * Created by mayammouarangue on 24/11/17.
 */

public class Etablissement {
    // attributs
    private int id;
    private String name;
    private String tel;
    private int type_id;
    private int Adresse_int;
    private boolean isVisible;

    // constructeur

    public Etablissement(int id, String name, String tel, int type_id, int adresse_int, boolean isVisible) {
        this.id = id;
        this.name = name;
        this.tel = tel;
        this.type_id = type_id;
        Adresse_int = adresse_int;
        this.isVisible = isVisible;
    }

    // getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getType_id() {
        return type_id;
    }

    public void setType_id(int type_id) {
        this.type_id = type_id;
    }

    public int getAdresse_int() {
        return Adresse_int;
    }

    public void setAdresse_int(int adresse_int) {
        Adresse_int = adresse_int;
    }

    public boolean isVisible() {
        return isVisible;
    }

    public void setVisible(boolean visible) {
        isVisible = visible;
    }
}
