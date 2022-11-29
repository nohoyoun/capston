package com.example.myapplication;

import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Help_Activity extends AppCompatActivity {

    int soundId;
    SoundPool sound;
    MySoundPlayer mySoundPlayer;
    // 221129 help_Activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        MySoundPlayer.initSounds(getApplicationContext());
        findViewById(R.id.finish_help).setOnClickListener((v)->{
           // MySoundPlayer.play(MySoundPlayer.DING_DONG);
        });
        Button button = findViewById(R.id.finish_help);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {  // finish 기능 이용해서 닫기버튼이벤트 발생.
                Intent intent = new Intent(Help_Activity.this, MainActivity.class);
                startActivity(intent);
                finish();
                MySoundPlayer.play(MySoundPlayer.Blop_Sound);
            }
        });

    }
}