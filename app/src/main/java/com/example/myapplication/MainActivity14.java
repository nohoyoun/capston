package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

public class MainActivity14 extends AppCompatActivity {


    TextView txt1, txt2, txt3, txt4, txt5, txt6;

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

        Intent intent = getIntent();
        String scname1 = intent.getStringExtra("name1");
        txt1.setText(scname1);

        String scname2 = intent.getStringExtra("name2");
        txt2.setText(scname2);

        String scname3 = intent.getStringExtra("name3");
        txt3.setText(scname3);

        String scname4 = intent.getStringExtra("name4");
        txt4.setText(scname4);

        String scname5 = intent.getStringExtra("name5");
        txt5.setText(scname5);

        String scname6 = intent.getStringExtra("name6");
        txt6.setText(scname6);
    }
}