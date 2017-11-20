package com.example.most601.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Displey_msg_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_displey_msg_2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        Intent intent = getIntent();
        String msg = intent.getStringExtra(MainActivity.MESSEG_KEY);

        TextView view = findViewById(R.id.msg_2);
        view.setText(msg);



      //  getSupportActionBar().setDisplayHomeAsUpEnabled(false);
    }

}
