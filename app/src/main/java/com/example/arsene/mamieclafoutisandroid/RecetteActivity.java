package com.example.arsene.mamieclafoutisandroid;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;



import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import adapters.IngredientAdapter;
import entities.Produit;

public class RecetteActivity extends Activity {

    Button btnmodifier;


    ArrayList<Produit> ingredientarray = new ArrayList<Produit>();

    IngredientAdapter rows;



    static ArrayList<String> result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recette);

        btnmodifier = (Button) findViewById(R.id.recettem);



        btnmodifier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}
