package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity13 extends AppCompatActivity {

    Button minus, plus, play;
    TextView selnum;
    LinearLayout playone, playtwo, playthree, playfour, playfive, playsix;
    TextView pushname1, pushname2,pushname3,pushname4,pushname5,pushname6;
    int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);

        minus = findViewById(R.id.minus);
        plus = findViewById(R.id.plus);
        play = findViewById(R.id.play);

        selnum = (TextView) findViewById(R.id.num);
        num = 2;

        playone = findViewById(R.id.playone);
        playtwo = findViewById(R.id.playtwo);
        playthree = findViewById(R.id.playthree);
        playfour = findViewById(R.id.playfour);
        playfive = findViewById(R.id.playfive);
        playsix = findViewById(R.id.playsix);

        pushname1 = findViewById(R.id.pushname1);
        pushname2 = findViewById(R.id.pushname2);
        pushname3 = findViewById(R.id.pushname3);
        pushname4 = findViewById(R.id.pushname4);
        pushname5 = findViewById(R.id.pushname5);
        pushname6 = findViewById(R.id.pushname6);

        playthree.setVisibility(View.INVISIBLE);
        playfour.setVisibility(View.INVISIBLE);
        playfive.setVisibility(View.INVISIBLE);
        playsix.setVisibility(View.INVISIBLE);

        selnum.setText(String.valueOf(num));



        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp1 = pushname1.getText().toString();
                String temp2 = pushname2.getText().toString();
                String temp3 = pushname3.getText().toString();
                String temp4 = pushname4.getText().toString();
                String temp5 = pushname5.getText().toString();
                String temp6 = pushname6.getText().toString();


                Intent intent = new Intent(MainActivity13.this, MainActivity5.class);
                intent.putExtra("name1", temp1);
                intent.putExtra("name2", temp2);
                intent.putExtra("name3", temp3);
                intent.putExtra("name4", temp4);
                intent.putExtra("name5", temp5);
                intent.putExtra("name6", temp6);

                startActivity(intent);
                finish();
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num == 2) {
                    selnum.setText(String.valueOf(num));
                }else {
                    num--;
                    selnum.setText(String.valueOf(num));
                }

                if(num == 2) {
                    playthree.setVisibility(View.INVISIBLE);
                    playfour.setVisibility(View.INVISIBLE);
                    playfive.setVisibility(View.INVISIBLE);
                    playsix.setVisibility(View.INVISIBLE);
                }else if (num == 3) {
                    playthree.setVisibility(View.VISIBLE);
                    playfour.setVisibility(View.INVISIBLE);
                    playfive.setVisibility(View.INVISIBLE);
                    playsix.setVisibility(View.INVISIBLE);
                }else if (num == 4) {
                    playthree.setVisibility(View.VISIBLE);
                    playfour.setVisibility(View.VISIBLE);
                    playfive.setVisibility(View.INVISIBLE);
                    playsix.setVisibility(View.INVISIBLE);
                }else if  (num == 5) {
                    playthree.setVisibility(View.VISIBLE);
                    playfour.setVisibility(View.VISIBLE);
                    playfive.setVisibility(View.VISIBLE);
                    playsix.setVisibility(View.INVISIBLE);
                }else if  (num == 6) {
                    playthree.setVisibility(View.VISIBLE);
                    playfour.setVisibility(View.VISIBLE);
                    playfive.setVisibility(View.VISIBLE);
                    playsix.setVisibility(View.VISIBLE);
                }

            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num == 6) {
                    selnum.setText(String.valueOf(num));
                }else {
                    num++;
                    selnum.setText(String.valueOf(num));
                }
                if(num == 2) {
                    playthree.setVisibility(View.INVISIBLE);
                    playfour.setVisibility(View.INVISIBLE);
                    playfive.setVisibility(View.INVISIBLE);
                    playsix.setVisibility(View.INVISIBLE);
                }else if (num == 3) {
                    playthree.setVisibility(View.VISIBLE);
                    playfour.setVisibility(View.INVISIBLE);
                    playfive.setVisibility(View.INVISIBLE);
                    playsix.setVisibility(View.INVISIBLE);
                }else if (num == 4) {
                    playthree.setVisibility(View.VISIBLE);
                    playfour.setVisibility(View.VISIBLE);
                    playfive.setVisibility(View.INVISIBLE);
                    playsix.setVisibility(View.INVISIBLE);
                }else if  (num == 5) {
                    playthree.setVisibility(View.VISIBLE);
                    playfour.setVisibility(View.VISIBLE);
                    playfive.setVisibility(View.VISIBLE);
                    playsix.setVisibility(View.INVISIBLE);
                }else if  (num == 6) {
                    playthree.setVisibility(View.VISIBLE);
                    playfour.setVisibility(View.VISIBLE);
                    playfive.setVisibility(View.VISIBLE);
                    playsix.setVisibility(View.VISIBLE);
                }

            }
        });
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