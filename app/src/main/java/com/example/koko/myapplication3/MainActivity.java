package com.example.koko.myapplication3;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
                                      public void onClick(View view) {
                                          Intent beginnerIntent = new Intent(MainActivity.this, Beginner.class);
                                          startActivity(beginnerIntent);
                                      }
                                  }
        );

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intermediateIntent = new Intent(MainActivity.this, intermediate.class);
                startActivity(intermediateIntent);
            }

        });
    }



        public boolean onCreateOptionsMenu (Menu menu){
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.menu_main, menu);
            return true;
        }


    }

//I deleted the stuff here