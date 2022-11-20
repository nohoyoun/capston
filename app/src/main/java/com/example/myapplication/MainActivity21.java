package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity21 extends AppCompatActivity {

    TextView restraunt;
    Button gogame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main21);

       restraunt = findViewById(R.id.rest);
       gogame = findViewById(R.id.gogame);

        Intent intent = getIntent();
        String restname = intent.getStringExtra("rest");
        restraunt.setText(restname);



    }
}