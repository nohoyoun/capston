package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity19 extends AppCompatActivity {

    TextView horse1rank, horse2rank,horse3rank,horse4rank;
    TextView teamname;
    Button restart, go19;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main19);

        horse1rank = findViewById(R.id.horse1rank);
        horse2rank = findViewById(R.id.horse2rank);
        horse3rank = findViewById(R.id.horse3rank);
        horse4rank = findViewById(R.id.horse4rank);

        restart = findViewById(R.id.gotomain);
        go19 = findViewById(R.id.go19);

        teamname = findViewById(R.id.teampush);

        SharedPreferences sharedPreferences = getSharedPreferences("pref1", MODE_PRIVATE);
        Integer rank1 = sharedPreferences.getInt("rank1", 0);
        Integer rank2 = sharedPreferences.getInt("rank2", 0);
        Integer rank3 = sharedPreferences.getInt("rank3", 0);
        Integer rank4 = sharedPreferences.getInt("rank4", 0);

        horse1rank.setText(String.valueOf(rank1) + "등");
        horse2rank.setText(String.valueOf(rank2) + "등");
        horse3rank.setText(String.valueOf(rank3) + "등");
        horse4rank.setText(String.valueOf(rank4) + "등");

        SharedPreferences sharedPreferences1 = getSharedPreferences("pref2", MODE_PRIVATE);
        String teamnm1 = sharedPreferences1.getString("team1", "");
        String teamnm2 = sharedPreferences1.getString("team2", "");
        String teamnm3 = sharedPreferences1.getString("team3", "");
        String teamnm4 = sharedPreferences1.getString("team4", "");

        if(rank1 == 4) {
            teamname.setText(teamnm1);
        }else if(rank2 == 4) {
            teamname.setText(teamnm2);
        }else if (rank3 == 4) {
            teamname.setText(teamnm3);
        }else if (rank4 == 4) {
            teamname.setText(teamnm4);
        }

        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity19.this, MainActivity2.class);
                startActivity(intent);
            }

        });

        go19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String temp = teamname.getText().toString();

                Intent intent = new Intent(MainActivity19.this, MainActivity9.class);
                intent.putExtra("push", temp);
                startActivity(intent);
            }

        });

    }
}