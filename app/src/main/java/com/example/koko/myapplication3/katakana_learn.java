package com.example.koko.myapplication3;

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


public class katakana_learn extends ActionBarActivity {
    GridView grid;

    static final String[] letters = new String[]{

            "ア a", "イ i", "ウ u", "エ e", "オ o",

            "カ ka", "キ ki", "ク ku", "ケ ke", "コ ko",

            "サ sa", "シ shi", "ス su", "セ se", "ソ so",

            "タ ta", "チ chi", "ツ tsu", "テ te", "ト to",

            "ナ na", "ニ ni", "ヌ nu", "ネ ne", "ノ no",

            "ハ ha", "ヒ hi", "フ fu", "ヘ he", "ホ ho",

            "マ ma", "ミ mi", "ム mu", "メ me", "モ mo",

            "ヤ ya", "　", "ユ yu", "　", "ヨ yo",

            "ラ ra", "リ ri", "ル ru", "レ re", "ロ ro",
            "ワ wa", "　", "　", "　", "ヲ wo", "ン n"
    };


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_katakana_learn);

        grid = (GridView) findViewById(R.id.gridView2);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, letters);

        grid.setAdapter(adapter);

        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView parent, View v, int position, long id) {
                Toast.makeText(getApplicationContext(),
                        ((TextView) v).getText(), Toast.LENGTH_SHORT).show();
            }
        });

    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_katakana_learn, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
