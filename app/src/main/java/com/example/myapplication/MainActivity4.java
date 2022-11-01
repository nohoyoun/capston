package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity4 extends AppCompatActivity {

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    ImageView cat_image;
    int number;
    SoundPool sound;
    Random random = new Random();
    int soundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);

        number = random.nextInt(5) + 1;
        cat_image = (ImageView)findViewById(R.id.cat1);
        cat_image.setVisibility(View.INVISIBLE);
        sound = new SoundPool(5, AudioManager.STREAM_MUSIC,0);
        soundId = sound.load(this, R.raw.catfear,1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = 1;

                if(number == number1){
                    btn1.setVisibility(View.INVISIBLE);
                    btn2.setVisibility(View.INVISIBLE);
                    btn3.setVisibility(View.INVISIBLE);
                    btn4.setVisibility(View.INVISIBLE);
                    btn5.setVisibility(View.INVISIBLE);
                    cat_image.setVisibility(View.VISIBLE);
                    sound.play(soundId, 1f, 1f, 0, 0, 1f);

                    Intent intent = new Intent(MainActivity4.this, MainActivity10.class);
                    startActivity(intent);
                }else {
                    btn1.setVisibility(View.INVISIBLE);
                }

            }

        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number2 = 2;

                if(number == number2){
                    btn1.setVisibility(View.INVISIBLE);
                    btn2.setVisibility(View.INVISIBLE);
                    btn3.setVisibility(View.INVISIBLE);
                    btn4.setVisibility(View.INVISIBLE);
                    btn5.setVisibility(View.INVISIBLE);
                    cat_image.setVisibility(View.VISIBLE);
                    sound.play(soundId, 1f, 1f, 0, 0, 1f);

                    Intent intent = new Intent(MainActivity4.this, MainActivity10.class);
                    startActivity(intent);
                }else {
                    btn2.setVisibility(View.INVISIBLE);
                }
            }

        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number3 = 3;

                if(number == number3){
                    btn1.setVisibility(View.INVISIBLE);
                    btn2.setVisibility(View.INVISIBLE);
                    btn3.setVisibility(View.INVISIBLE);
                    btn4.setVisibility(View.INVISIBLE);
                    btn5.setVisibility(View.INVISIBLE);
                    cat_image.setVisibility(View.VISIBLE);
                    sound.play(soundId, 1f, 1f, 0, 0, 1f);

                    Intent intent = new Intent(MainActivity4.this, MainActivity10.class);
                    startActivity(intent);
                }
                else {
                    btn3.setVisibility(View.INVISIBLE);
                }
            }

        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number4=4;

                if(number == number4){
                    btn1.setVisibility(View.INVISIBLE);
                    btn2.setVisibility(View.INVISIBLE);
                    btn3.setVisibility(View.INVISIBLE);
                    btn4.setVisibility(View.INVISIBLE);
                    btn5.setVisibility(View.INVISIBLE);
                    cat_image.setVisibility(View.VISIBLE);
                    sound.play(soundId, 1f, 1f, 0, 0, 1f);

                    Intent intent = new Intent(MainActivity4.this, MainActivity10.class);
                    startActivity(intent);
                }
                else {
                    btn4.setVisibility(View.INVISIBLE);
                }
            }

        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number5=5;

                if(number == number5){
                    btn1.setVisibility(View.INVISIBLE);
                    btn2.setVisibility(View.INVISIBLE);
                    btn3.setVisibility(View.INVISIBLE);
                    btn4.setVisibility(View.INVISIBLE);
                    btn5.setVisibility(View.INVISIBLE);
                    cat_image.setVisibility(View.VISIBLE);
                    sound.play(soundId, 1f, 1f, 0, 0, 1f);

                    Intent intent = new Intent(MainActivity4.this, MainActivity10.class);
                    startActivity(intent);
                }
                else {
                    btn5.setVisibility(View.INVISIBLE);
                }
            }

        });


    }

}