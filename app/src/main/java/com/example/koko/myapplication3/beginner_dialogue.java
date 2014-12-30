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


public class beginner_dialogue extends ActionBarActivity {
    GridView grid;
    static final String[] Dialogue = new String[]{
        "KONNICHIWA.", "Hello.",
        "OHAYO.", "Good morning.",
        "KONBANWA.", "Good evening.",
        "OYASUMI NASAI.", "Good night.",
        "HAJIME MASHITE.", "Nice to you meet you.",
        "SAYONARA.", "Goodbye.",
        "ARIGATO.", "Thank you.",
        "GOMEN NASAI.", "I'm sorry.",
        "OGENKI DESUKA?", "How are you?",
        "GENKI DESU.", "I'm fine.",
        "SHIRIMASEN.", "I don't know."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginner_dialogue);
        grid = (GridView) findViewById(R.id.gridView3);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, Dialogue);
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
        getMenuInflater().inflate(R.menu.menu_beginner_dialogue, menu);
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
