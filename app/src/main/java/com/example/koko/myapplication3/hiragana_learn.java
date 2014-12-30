package com.example.koko.myapplication3;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class hiragana_learn extends Activity {
    GridView grid;

    static final String[] letters = new String[]{
            "あ\na", "い\ni", "う\nu", "え\ne", "お\no",

            "か\nka", "き\nki", "く\nku", "け\nke", "こ\nko",

            "さ\nsa", "し\nshi", "す\nsu", "せ\nse", "そ\nso",

            "た\nta", "ち\nchi", "つ\ntsu", "て\nte", "と\nto",

            "な\nna", "に\nni", "ぬ\nnu", "ね\nne", "の\nno",

            "は\nha", "ひ\nhi", "ふ\nfu", "へ\nhe", "ほ\nho",

            "ま\nma", "み\nmi", "む\nmu", "め\nme", "も\nmo",

            "や\nya", "　", "ゆ\nyu", "　", "よ\nyo",

            "ら\nra", "り\nri", "る\nru", "れ\nre", "ろ\nro",

            "わ\nwa", "　", "　", "　", "を\nwo", "ん\nn"
    };


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_hiragana_learn);

        grid = (GridView) findViewById(R.id.gridView1);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, letters);

        grid.setAdapter(adapter);

        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView parent, View v, int position, long id) {
                Toast.makeText(getApplicationContext(),
                        ((TextView) v).getText(), Toast.LENGTH_SHORT).show();
            }
        });

        Button button11 = (Button) findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent hiraganalearn2Intent = new Intent(hiragana_learn.this, hiragana_learn2.class);
                startActivity(hiraganalearn2Intent);
            }

        });

    }
}