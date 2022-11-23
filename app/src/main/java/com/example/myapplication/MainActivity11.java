package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity11 extends AppCompatActivity {

    TextView pushtxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main11);

        pushtxt = findViewById(R.id.pushtxt);

        Intent intent1 = getIntent();
        String team = intent1.getStringExtra("team");
        pushtxt.setText(team);


        Button button2 = findViewById(R.id.restartmain);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity11.this, MainActivity2.class);
                startActivity(intent);
            }

        });

        Button button1 = findViewById(R.id.gomain);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = pushtxt.getText().toString();

                Intent intent = new Intent(MainActivity11.this, Share_Activity.class);
                intent.putExtra("push", temp);

                startActivity(intent);
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
