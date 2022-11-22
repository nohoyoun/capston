package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;

public class Select_Menu_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_menu);

        ImageButton button1 = findViewById(R.id.selectperson);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Select_Menu_Activity.this, MainActivity2.class);
                startActivity(intent);
            }
        });

        ImageButton button2 = findViewById(R.id.selectfood);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Select_Menu_Activity.this, RandomMain18Activity.class);
                startActivity(intent);
            }
        });

        ImageButton button3 = findViewById(R.id.selectcafe);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Select_Menu_Activity.this, MapsActivity.class);
                startActivity(intent);
            }
        });


    }
}