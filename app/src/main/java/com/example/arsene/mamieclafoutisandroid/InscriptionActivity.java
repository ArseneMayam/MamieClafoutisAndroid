package com.example.arsene.mamieclafoutisandroid;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class InscriptionActivity extends Activity {

    Context ctx;
    Spinner spinnerPoste;
    EditText inputNom;
    EditText inputPrenom;
    Button bttnSoumettreInscription;
    ArrayAdapter<String> spinnerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);
        ctx = this;

        // get les composants inputs
        inputNom = (EditText) findViewById(R.id.inputNom);
        inputPrenom =(EditText) findViewById(R.id.inputPrenom);
        spinnerPoste = (Spinner) findViewById(R.id.spinnerPoste);

        //le button
        bttnSoumettreInscription = (Button) findViewById(R.id.bttnSoumettreInscription);


        // Array adapter pour le spinner
        String[] lesPostes ={"professionelle"};
        spinnerAdapter = new ArrayAdapter<String>(ctx,android.R.layout.simple_spinner_dropdown_item,lesPostes);
        spinnerPoste.setAdapter(spinnerAdapter);

        // quel poste a été selectionné
        String lePoste = spinnerPoste.getSelectedItem().toString();


        // ecoute sur bttn soumettre
        bttnSoumettreInscription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
            }
        });



    }
}
