package com.example.arsene.mamieclafoutisandroid;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

public class connexionActivity extends Activity {

    Context ctx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connexion);
        ctx =this;
    }
}
