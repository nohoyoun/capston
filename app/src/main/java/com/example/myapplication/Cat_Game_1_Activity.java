package com.example.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class Cat_Game_1_Activity extends AppCompatActivity {

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
    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_game_1);
        MySoundPlayer.initSounds(getApplicationContext());

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

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
                MySoundPlayer.play(MySoundPlayer.Woosh_Sound);
                if(number == number1){
                    btn1.setVisibility(View.INVISIBLE);
                    btn2.setVisibility(View.INVISIBLE);
                    btn3.setVisibility(View.INVISIBLE);
                    btn4.setVisibility(View.INVISIBLE);
                    btn5.setVisibility(View.INVISIBLE);
                    cat_image.setVisibility(View.VISIBLE);
                    sound.play(soundId, 1f, 1f, 0, 0, 1f);
                    //딜레이
                   handler.postDelayed(new Runnable()  {
                        public void run() {
                            // 시간 지난 후 실행할 코딩
                            Intent intent = new Intent(Cat_Game_1_Activity.this, MainActivity10.class);
                            startActivity(intent);
                        }
                    }, 2000); // 2초후
                }else {
                    btn1.setVisibility(View.INVISIBLE);
                }

            }

        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number2 = 2;
                MySoundPlayer.play(MySoundPlayer.Woosh_Sound);

                if(number == number2){
                    btn1.setVisibility(View.INVISIBLE);
                    btn2.setVisibility(View.INVISIBLE);
                    btn3.setVisibility(View.INVISIBLE);
                    btn4.setVisibility(View.INVISIBLE);
                    btn5.setVisibility(View.INVISIBLE);
                    cat_image.setVisibility(View.VISIBLE);
                    sound.play(soundId, 1f, 1f, 0, 0, 1f);

                    handler.postDelayed(new Runnable()  {
                        public void run() {
                            // 시간 지난 후 실행할 코딩
                            Intent intent = new Intent(Cat_Game_1_Activity.this, MainActivity10.class);
                            startActivity(intent);
                        }
                    }, 2000); // 2초후
                }else {
                    btn2.setVisibility(View.INVISIBLE);
                }
            }

        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number3 = 3;
                MySoundPlayer.play(MySoundPlayer.Woosh_Sound);
                if(number == number3){
                    btn1.setVisibility(View.INVISIBLE);
                    btn2.setVisibility(View.INVISIBLE);
                    btn3.setVisibility(View.INVISIBLE);
                    btn4.setVisibility(View.INVISIBLE);
                    btn5.setVisibility(View.INVISIBLE);
                    cat_image.setVisibility(View.VISIBLE);
                    sound.play(soundId, 1f, 1f, 0, 0, 1f);

                    handler.postDelayed(new Runnable()  {
                        public void run() {
                            // 시간 지난 후 실행할 코딩
                            Intent intent = new Intent(Cat_Game_1_Activity.this, MainActivity10.class);
                            startActivity(intent);
                        }
                    }, 2000); // 2초후
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
                MySoundPlayer.play(MySoundPlayer.Woosh_Sound);
                if(number == number4){
                    btn1.setVisibility(View.INVISIBLE);
                    btn2.setVisibility(View.INVISIBLE);
                    btn3.setVisibility(View.INVISIBLE);
                    btn4.setVisibility(View.INVISIBLE);
                    btn5.setVisibility(View.INVISIBLE);
                    cat_image.setVisibility(View.VISIBLE);
                    sound.play(soundId, 1f, 1f, 0, 0, 1f);

                    handler.postDelayed(new Runnable()  {
                        public void run() {
                            // 시간 지난 후 실행할 코딩
                            Intent intent = new Intent(Cat_Game_1_Activity.this, MainActivity10.class);
                            startActivity(intent);
                        }
                    }, 2000); // 2초후
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
                MySoundPlayer.play(MySoundPlayer.Woosh_Sound);
                if(number == number5){
                    btn1.setVisibility(View.INVISIBLE);
                    btn2.setVisibility(View.INVISIBLE);
                    btn3.setVisibility(View.INVISIBLE);
                    btn4.setVisibility(View.INVISIBLE);
                    btn5.setVisibility(View.INVISIBLE);
                    cat_image.setVisibility(View.VISIBLE);
                    sound.play(soundId, 1f, 1f, 0, 0, 1f);


                    handler.postDelayed(new Runnable()  {
                        public void run() {
                            // 시간 지난 후 실행할 코딩
                            Intent intent = new Intent(Cat_Game_1_Activity.this, MainActivity10.class);
                            startActivity(intent);
                        }
                    }, 2000); // 2초후
                }
                else {
                    btn5.setVisibility(View.INVISIBLE);
                }
            }

        });


    }

}