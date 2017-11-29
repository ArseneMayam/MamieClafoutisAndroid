package managers;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.arsene.mamieclafoutisandroid.utils.Mydb;

import java.util.ArrayList;

import entities.Adresse;
import entities.Etablissement;
import services.C;
import services.ConnexionBd;

/**
 * Created by bigg- on 11/28/2017.
 */

public class Manager_Etablissement {
    private static final String queryGetAll = "";

    public static void insert(Context ctx, Etablissement etablissement){

        ContentValues cv = new ContentValues();
        cv.put(C.Etablissement.id, etablissement.getId());
        cv.put(C.Etablissement.name, etablissement.getName());
        cv.put(C.Etablissement.tel, etablissement.getTel());


        SQLiteDatabase bd = ConnexionBd.getBd(ctx);
        bd.insert(Mydb.Produit.tablename, null, cv);

        bd.close();

    }

    public static ArrayList<Etablissement> getAll(Context ctx) {
        ArrayList<Etablissement> retour = new ArrayList<>();

        SQLiteDatabase bd = ConnexionBd.getBd(ctx);
        Cursor c = bd.rawQuery(queryGetAll, null);

        while (c.moveToNext()) {
            int id = c.getInt(0);
            String name = c.getString(1);
            String tel = c.getString(2);

            Etablissement s = new Etablissement(id, name, tel);
            retour.add(s);

        }
        return retour;

    }
}
