package managers;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

import entities.Ingredient;
import services.C;
import services.ConnexionBd;

/**
 * Created by Been WhereU on 2017-11-27.
 *
 *
 */
public static ArrayList<Arena> getAll(Context ctx) {
        ArrayList<Arena> retour = new ArrayList<>();

        SQLiteDatabase bd = ConnexionBd.getBd(ctx);
        Cursor c = bd.rawQuery(queryGetAll, null);

        while (c.moveToNext()) {
        int id = c.getInt(0);
        String nomArena = c.getString(1);
        String image_arena = c.getString(6);
        Arena a = new Arena(id, nomArena, image_arena);
        retour.add(a);
        }
public class Manager_ingredient {

    private static final String queryGetByIDIngredient = "select distinct nom_arena,id_arena from arena as a inner join arrondissement as  ar on ar.id_arrondissement = a.id_arrondissement  where ar.nom_arrondissement like 'anjou'";
    private static final String queryGetAll = "select * from " + C.Ingredient.nomTable;
}



    public static ArrayList<Ingredient> getAll(Context ctx, Ingredient){
        ArrayList<Ingredient>  retour = new ArrayList<>();
        SQLiteDatabase base = ConnexionBd.getBd(ctx);
        Cursor c = base.rawQuery(queryGetAll,null);
        while (c.moveToNext()){
            int id = c.getInt(0);

        }
    }

}
