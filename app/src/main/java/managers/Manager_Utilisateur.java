package managers;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.arsene.mamieclafoutisandroid.utils.Mydb;

import java.util.ArrayList;

import entities.Utilisateur;
import services.ConnexionBd;

/**
 * Created by Been WhereU on 2017-11-26.
 */

public class Manager_Utilisateur {
    private static final String queryGetAll = "";

    public static void insert(Context ctx, Utilisateur utilisateur){

        ContentValues cv = new ContentValues();
        cv.put(Mydb.Utilisateur.id, utilisateur.getId());
        cv.put(Mydb.Utilisateur.nom, utilisateur.getUserName());
        cv.put(Mydb.Utilisateur.prenom, utilisateur.getPrenom());
        cv.put(Mydb.Utilisateur.userName, utilisateur.getUserName());
        cv.put(Mydb.Utilisateur.password, utilisateur.getPassword());
       // cv.put(Mydb.Utilisateur.role, utilisateur.getRoleid());
        cv.put(Mydb.Utilisateur.tokenIdentification, utilisateur.getTokenIdentification());
        cv.put(Mydb.Utilisateur.tokenInscription, utilisateur.getTokenInscription());
        cv.put(Mydb.Utilisateur.isvisible, utilisateur.isVisible());

        SQLiteDatabase bd = ConnexionBd.getBd(ctx);
        bd.insert(Mydb.Produit.tablename, null, cv);

        bd.close();

    }



    public static ArrayList<Utilisateur> getAll(Context ctx) {
        ArrayList<Utilisateur> retour = new ArrayList<>();

        SQLiteDatabase bd = ConnexionBd.getBd(ctx);
        Cursor c = bd.rawQuery(queryGetAll, null);

        while (c.moveToNext()) {
            int id = c.getInt(0);
            String nom = c.getString(1);
            String prenom = c.getString(2);
            String username = c.getString(3);
            String password = c.getString(4);
            int role = c.getInt(5);
            String tokenid = c.getString(6);
            String tokeninscription = c.getString(7);
            String visible = c.getString(8);

           // Utilisateur s = new Utilisateur(id, nom, prenom, username, password, role, tokenid,  tokeninscription , visible);
           // retour.add(s);
        }
        return retour;

    }




}
