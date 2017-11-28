package managers;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

import entities.Role;
import services.ConnexionBd;
import utils.Mydb;

/**
 * Created by Been WhereU on 2017-11-28.
 */

public class Manager_role {
    private static final String querryGetRole = " select * from " + Mydb.Role.nomTable + ";";

    public static ArrayList<Role> getRole(Context ctx){
        ArrayList<Role> retour = new ArrayList();
        SQLiteDatabase base = ConnexionBd.getBd(ctx);
        Cursor c = base.rawQuery(querryGetRole,null);

        while (c.moveToNext()){
            int id = c.getInt(0);
            String titre = c.getString(1);
            Role r = new Role(id,titre);
            retour.add(r);
        }
        return retour;
    }
}
