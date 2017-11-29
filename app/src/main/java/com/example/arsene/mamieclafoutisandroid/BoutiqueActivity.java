package com.example.arsene.mamieclafoutisandroid;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class BoutiqueActivity extends Activity {
    Context ctx;
    ListView boutiqueListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boutique);
        ctx = this;
        boutiqueListView = (ListView) findViewById(R.id.boutiqueListView);

    }
}
