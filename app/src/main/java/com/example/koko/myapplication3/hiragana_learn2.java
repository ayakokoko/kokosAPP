package com.example.koko.myapplication3;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;


public class hiragana_learn2 extends ActionBarActivity {
    GridView grid;

    static final String[] letters = new String[]{
            "が\nga", "ぎ\ngi", "ぐ\ngu", "げ\nge", "ご\ngo",
            "ざ\nza", "じ\nji", "ず\nzu", "ぜ\nze", "ぞ\nzo",
            "だ\nda\n ", "ぢ\nji\n(di)", "づ\nzu\n(du)", "で\nde\n ", "ど\ndo\n ",
            "ば\nba", "び\nbi", "ぶ\nbu", "べ\be", "ぼ\nbo",
            "ぱ\npa", "ぴ\npi", "ぷ\npu", "ぺ\npe", "ぽ\npo",
            "しゃ\nsha\n(sya)", "", "しゅ\nshu\n(syu)", "", "しょ\nsho\n(syo)",
            "ちゃ\ncha\n(tya)", "", "ちゅ\nchu\n(tyu)", "ちぇ\nche\n(tye)", "ちょ\ncho\n(tyo)",
            "にゃ\nnya", "", "にゅ\nnyu", "", "にょ\nnyo",
            "ひゃ\nhya", "", "ひゅ\nhyu", "", "ひょ\nhyo",
            "みゃ\nmya", "", "みゅ\nmyu", "", "みょ\nmyo",
            "りゃ\nrya", "", "りゅ\nryu", "", "りょ\nryo",

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hiragana_learn2);
        grid = (GridView) findViewById(R.id.gridView4);

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
        getMenuInflater().inflate(R.menu.menu_hiragana_learn2, menu);
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
