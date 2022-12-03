package com.example.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;

public class Select_Menu_Activity extends AppCompatActivity {

    // MediaPlayer mediaPlayer;
    SharedPreferences pref;          // 프리퍼런스
    SharedPreferences.Editor editor; // 에디터

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //mediaPlayer = MediaPlayer.create(this, R.raw.main_thema_bgm);
        //supportRequestWindowFeature(Window.FEATURE_NO_TITLE); //타이틀바없애는 명령
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_menu);

        pref = getSharedPreferences("pref3", Activity.MODE_PRIVATE);
        editor = pref.edit();
        editor.clear().apply();
        String text;

        text = "이 자리";

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        MySoundPlayer.initSounds(getApplicationContext());

        findViewById(R.id.selectcafe).setOnClickListener((v)->{
            // MySoundPlayer.play(MySoundPlayer.Blop_Sound);
        });
        findViewById(R.id.selectperson).setOnClickListener((v)->{
            // MySoundPlayer.play(MySoundPlayer.Blop_Sound);
        });
        findViewById(R.id.selectfood).setOnClickListener((v)->{
            // MySoundPlayer.play(MySoundPlayer.Blop_Sound);
        });

        ImageButton button1 = findViewById(R.id.selectperson);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            //    mediaPlayer.stop();
            //    mediaPlayer.reset();
                editor.putString("restfood", text);
                editor.apply();
                //맵찾기에서 입력된 변수삭제
                MySoundPlayer.play(MySoundPlayer.Blop_Sound);
                Intent intent = new Intent(Select_Menu_Activity.this, MainActivity2.class);
                startActivity(intent);
                finish();
           //     mediaPlayer.stop();
            }
        });

        ImageButton button2 = findViewById(R.id.selectfood);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            //    mediaPlayer.stop();
            //    mediaPlayer.reset();
            //    mediaPlayer.stop();

                MySoundPlayer.play(MySoundPlayer.Blop_Sound);
                Intent intent = new Intent(Select_Menu_Activity.this, RandomMain18Activity.class);
                startActivity(intent);
                finish();
            }
        });

        ImageButton button3 = findViewById(R.id.selectcafe);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            //    mediaPlayer.stop();
            //    mediaPlayer.reset();
             //   mediaPlayer.stop();
                MySoundPlayer.play(MySoundPlayer.Blop_Sound);
                Intent intent = new Intent(Select_Menu_Activity.this, MapsActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }
}