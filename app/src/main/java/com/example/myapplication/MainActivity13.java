package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity13 extends AppCompatActivity {

    Button minus, plus, play;
    TextView selnum;
    LinearLayout playone, playtwo, playthree, playfour, playfive, playsix;
    TextView pushname1, pushname2,pushname3,pushname4,pushname5,pushname6;
    int num;

    SharedPreferences pref;          // 프리퍼런스
    SharedPreferences.Editor editor; // 에디터

    String name1, name2, name3, name4, name5, name6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);

        pref = getSharedPreferences("pref1", Activity.MODE_PRIVATE);

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

        editor = pref.edit();
        editor.clear().apply();

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name1 = pushname1.getText().toString();
                editor.putString("name1", name1);
                name2 = pushname2.getText().toString();
                editor.putString("name2", name2);
                name3 = pushname3.getText().toString();
                editor.putString("name3", name3);
                name4 = pushname4.getText().toString();
                editor.putString("name4", name4);
                name5 = pushname5.getText().toString();
                editor.putString("name5", name5);
                name6 = pushname6.getText().toString();
                editor.putString("name6", name6);
                editor.putInt("num0", num);

                editor.apply();
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