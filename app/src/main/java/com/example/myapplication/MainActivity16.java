package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity16 extends AppCompatActivity {

    TextView name;
    TextView horse1race, horse2race, horse3race, horse4race;
    String input;
    private ArrayList<String> votename, votename2, votename3, votename4;
    int count = 0;
    int count2 = 0;
    int count3 = 0;
    int count4 = 0;
    String team1,team2, team3, team4;

    Button gotomain, startgame;

    SharedPreferences pref;          // 프리퍼런스
    SharedPreferences.Editor editor; // 에디터

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_main16);

        pref = getSharedPreferences("pref2", Activity.MODE_PRIVATE);

        name = findViewById(R.id.racingname);

        horse1race = findViewById(R.id.horse1race);
        horse2race = findViewById(R.id.horse2race);
        horse3race = findViewById(R.id.horse3race);
        horse4race = findViewById(R.id.horse4race);

        gotomain = findViewById(R.id.gotomain);
        startgame = findViewById(R.id.startracing);

        editor = pref.edit();
        editor.clear().apply();


        gotomain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            //메인으로가는 intent코드작성
            }
        });

        startgame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                team1 = horse1race.getText().toString();
                editor.putString("team1", team1);
                team2 = horse2race.getText().toString();
                editor.putString("team2", team2);
                team3 = horse3race.getText().toString();
                editor.putString("team3", team3);
                team4 = horse4race.getText().toString();
                editor.putString("team4", team4);

                editor.apply();
                finish();
            }
        });
    }

    public void vote1(View view) {

        name = findViewById(R.id.racingname);
        horse1race = findViewById(R.id.horse1race);

        if(count == 0) {
            votename = new ArrayList<>();
        }

        input = name.getText().toString();

        horse1race.setText(input);

        votename.add(input);

        horse1race.setText(votename + "\n");

        count++;
    }
    public void vote2(View view) {

        name = findViewById(R.id.racingname);
        horse2race = findViewById(R.id.horse2race);

        if(count2 == 0) {
            votename2 = new ArrayList<>();
        }

        input = name.getText().toString();

        horse2race.setText(input);

        votename2.add(input);

        horse2race.setText(votename2 + "\n");

        count2++;
    }
    public void vote3(View view) {

        name = findViewById(R.id.racingname);
        horse3race = findViewById(R.id.horse3race);

        if(count3 == 0) {
            votename3 = new ArrayList<>();
        }

        input = name.getText().toString();

        horse3race.setText(input);

        votename3.add(input);

        horse3race.setText(votename3 + "\n");

        count3++;
    }
    public void vote4(View view) {

        name = findViewById(R.id.racingname);
        horse4race = findViewById(R.id.horse4race);

        if(count4 == 0) {
            votename4 = new ArrayList<>();
        }

        input = name.getText().toString();

        horse4race.setText(input);

        votename4.add(input);

        horse4race.setText(votename4 + "\n");

        count4++;
    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //바깥레이어 클릭시 안닫히게
        if(event.getAction()==MotionEvent.ACTION_OUTSIDE){
            return false;
        }
        return true;
    }
    @Override
    public void onBackPressed() {
        //안드로이드 백버튼 막기
        return;
    }
}