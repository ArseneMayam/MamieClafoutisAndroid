package com.example.arsene.mamieclafoutisandroid.utils;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import com.example.arsene.mamieclafoutisandroid.ConnexionActivity;
import com.example.arsene.mamieclafoutisandroid.ProduitActivity;
import com.google.gson.Gson;

import java.net.HttpURLConnection;

import entities.Produit;
import services.C;

/**
 * Created by Been WhereU on 2017-11-28.
 */

public class ProduitRequestHttp extends AsyncTask<String,Long,String> {

    Context ctx;
    ProduitActivity produitActivity;
    Produit produit;

    public ProduitRequestHttp(Context ctx, ProduitActivity produitActivity, Produit produit) {
        this.ctx = ctx;
        this.produitActivity = produitActivity;
        this.produit = produit;
    }


    @Override
    protected String doInBackground(String... strings) {
        String retour ="";
        HttpURLConnection connexion = null;
        StringBuilder stbuilder = new StringBuilder();

        String requestURL = C.adresseIp+strings[0];
        Log.d("Produit",requestURL);


            Gson gson = new Gson();
            String produitView = gson.toJson(produitActivity);




        return null;
    }
}
