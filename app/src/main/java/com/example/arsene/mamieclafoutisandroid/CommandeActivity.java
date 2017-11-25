package com.example.arsene.mamieclafoutisandroid;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class CommandeActivity extends AppCompatActivity {

    Context ctx;
    ListView commandeListView;
    Button passerCommande;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commande);
        ctx = this;
        passerCommande = (Button) findViewById(R.id.bttnPasserCommande);
        commandeListView = (ListView) findViewById(R.id.commandeListeView);




        // listen bttn passer commande
        passerCommande.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
