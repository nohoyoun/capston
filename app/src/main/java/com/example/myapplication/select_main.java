package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class select_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_main);

        ImageButton button1 = findViewById(R.id.selectperson);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(select_main.this, MainActivity2.class);
                startActivity(intent);
            }
        });

        ImageButton button2 = findViewById(R.id.selectfood);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(select_main.this, MainActivity15.class);
                startActivity(intent);
            }
        });
        ImageButton button3 = findViewById(R.id.selectcafe);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(select_main.this, MapsView.class);
                startActivity(intent);
            }
        });


    }
}