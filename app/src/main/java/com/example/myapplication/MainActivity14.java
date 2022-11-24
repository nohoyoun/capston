package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import java.util.Collections;
import java.util.LinkedList;

public class MainActivity14 extends AppCompatActivity {


    TextView txt1, txt2, txt3, txt4, txt5, txt6;
    TextView sc1, sc2, sc3, sc4, sc5, sc6;
    TextView board;
    Button btn1;
    String temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main14);

        txt1 = (TextView)findViewById(R.id.pushscore1);
        txt2 = (TextView)findViewById(R.id.pushscore2);
        txt3 = (TextView)findViewById(R.id.pushscore3);
        txt4 = (TextView)findViewById(R.id.pushscore4);
        txt5 = (TextView)findViewById(R.id.pushscore5);
        txt6 = (TextView)findViewById(R.id.pushscore6);

        sc1 = findViewById(R.id.score1);
        sc2 = findViewById(R.id.score2);
        sc3 = findViewById(R.id.score3);
        sc4 = findViewById(R.id.score4);
        sc5 = findViewById(R.id.score5);
        sc6 = findViewById(R.id.score6);

        board = findViewById(R.id.text14);

        btn1 = findViewById(R.id.go14);

        SharedPreferences sharedPreferences = getSharedPreferences("pref1", MODE_PRIVATE);
        String name1 = sharedPreferences.getString("name1", "");
        String name2 = sharedPreferences.getString("name2", "");
        String name3 = sharedPreferences.getString("name3", "");
        String name4 = sharedPreferences.getString("name4", "");
        String name5 = sharedPreferences.getString("name5", "");
        String name6 = sharedPreferences.getString("name6", "");

        txt1.setText(name1);
        txt2.setText(name2);
        txt3.setText(name3);
        txt4.setText(name4);
        txt5.setText(name5);
        txt6.setText(name6);

        SharedPreferences sharedPreferences1 = getSharedPreferences("pref2", MODE_PRIVATE);
        Integer score1 = sharedPreferences1.getInt("dicenum1",0);
        Integer score2 = sharedPreferences1.getInt("dicenum2",0);
        Integer score3 = sharedPreferences1.getInt("dicenum3",0);
        Integer score4 = sharedPreferences1.getInt("dicenum4",0);
        Integer score5 = sharedPreferences1.getInt("dicenum5",0);
        Integer score6 = sharedPreferences1.getInt("dicenum6",0);


        sc1.setText(String.valueOf(score1));
        sc2.setText(String.valueOf(score2));
        sc3.setText(String.valueOf(score3));
        sc4.setText(String.valueOf(score4));
        sc5.setText(String.valueOf(score5));
        sc6.setText(String.valueOf(score6));

        LinkedList<Integer>list = new LinkedList<Integer>();
        if (score3 == 0) {
            score3 = 13;
        }
        if (score4 == 0) {
            score4 = 13;
        }
        if (score5 == 0) {
            score5 = 13;
        }
        if (score6 == 0) {
            score6 = 13;
        }
        list.add(score1);
        list.add(score2);
        list.add(score3);
        list.add(score4);
        list.add(score5);
        list.add(score6);
        Integer i = Collections.min(list);

        if(i == score1) {
            board.setText(name1 + "님이 당첨입니다.");
            temp = txt1.getText().toString();
        }else if(i == score2) {
            board.setText(name2 + "님이 당첨입니다.");
            temp = txt2.getText().toString();
        }else if (i == score3) {
            board.setText(name3 + "님이 당첨입니다.");
            temp = txt3.getText().toString();
        }else if (i == score4) {
            board.setText(name4 + "님이 당첨입니다.");
            temp = txt4.getText().toString();
        }else if (i == score5) {
            board.setText(name5 + "님이 당첨입니다.");
            temp = txt5.getText().toString();
        }else if (i == score6) {
            board.setText(name6 + "님이 당첨입니다.");
            temp = txt6.getText().toString();
        }


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity14.this, Share_Activity.class);
                intent.putExtra("push", temp);

                startActivity(intent);
            }
        });
    }
}