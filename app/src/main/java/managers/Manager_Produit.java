package managers;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import entities.Produit;
import services.ConnexionBd;
import utils.Mydb;

/**
 * Created by Been WhereU on 2017-11-26.
 */

public class Manager_Produit {
    private static final String queryGetAll = "";

    public static void insert(Context ctx, Produit produit) {
        ContentValues cv = new ContentValues();
        cv.put(Mydb.Produit.id, produit.getId());
        cv.put(Mydb.Produit.nom, produit.getNom());
        cv.put(Mydb.Produit.categorieid, produit.getCategorie_id());
        cv.put(Mydb.Produit.description, produit.getDescription());
        cv.put(Mydb.Produit.prix, produit.getPrix());
        cv.put(Mydb.Produit.poid, produit.getPoid());
        cv.put(Mydb.Produit.reference, produit.getReference());
        cv.put(Mydb.Produit.unite_id, produit.getUnite_id());
        cv.put(Mydb.Produit.estvisible, produit.isEstVisible());


        SQLiteDatabase bd = ConnexionBd.getBd(ctx);
        bd.insert(Mydb.Produit.tablename, null, cv);

        bd.close();
    }


    /*public static ArrayList<Produit> getAll(Context ctx) {
        ArrayList<Produit> retour = new ArrayList<>();

        //SQLiteDatabase bd = Connexiondb.getBd(ctx);
        //Cursor c = bd.rawQuery(queryGetAll, null);

        /*while (c.moveToNext()) {
            int id = c.getInt(0);
            String nom = c.getString(1);
            //String categorie = c.getString(2);
            String prix = c.getString(3);
            String poid = c.getString(4);
            String reference = c.getString(5);
            String description = c.getString(6);
            //String unite = c.getString(7);
            Produit s = new Produit(id, nom, categorie, description, prix, poid, reference, unite);
            retour.add(s);
        }
        return retour;*/

    //}
}
