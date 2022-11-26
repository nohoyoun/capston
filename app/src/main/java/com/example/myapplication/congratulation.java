package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import java.util.Random;

public class congratulation extends AppCompatActivity {

    ImageView congr;
    AnimationDrawable ania;
    SoundPool sound;
    int soundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_congratulation);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_BLUR_BEHIND,
                WindowManager.LayoutParams.FLAG_BLUR_BEHIND);

       //MySoundPlayer.initSounds(getApplicationContext());
        sound = new SoundPool(5, AudioManager.STREAM_MUSIC,0);
        soundId = sound.load(this, R.raw.congu1,1);

        congr = findViewById(R.id.congratulation);
        ania= (AnimationDrawable) congr.getDrawable();
        ania.start();

        sound.play(soundId, 1f, 1f, 0, 0, 1f);
    }
}