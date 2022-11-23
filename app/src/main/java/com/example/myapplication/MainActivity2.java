package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_select_game);
        super.onCreate(savedInstanceState);

        String dir = "./src";
        String file_path = "main.java";

        Button button0 = findViewById(R.id.random);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, Random_Game_Choice_Slot_Activity.class);
                startActivity(intent);
            }
        });

        Button button1 = findViewById(R.id.spearbtn);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, Niddle_game_Activity.class);
                startActivity(intent);
            }
        });

        Button button2 = findViewById(R.id.Dicebtn);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, Dice_game_Activity.class);
                startActivity(intent);
            }
        });

        Button button3 = findViewById(R.id.horseracing);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, Horse_game_Activity.class);
                startActivity(intent);
            }
        });


        Button button4 = findViewById(R.id.catbtn);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, Cat_Game_Main_Activity.class);
                startActivity(intent);
            }
        });

        Button button5 = findViewById(R.id.ham);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, Hamburger_game_Activity.class);
                startActivity(intent);
            }
        });

        Button button6 = findViewById(R.id.share);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, Roullet_Game_Activity.class);
                startActivity(intent);
            }
        });
        Button button7 = findViewById(R.id.end);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, Select_Menu_Activity.class);
                startActivity(intent);
            }
        });
    }


    }
