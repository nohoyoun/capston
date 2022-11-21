package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity8 extends AppCompatActivity {

    Button btn1;
    Button go;
    Button restart;
    ImageView one, two, three, four, five, six, seven, eight, nine, ten, eleven;
    int number;
    Random random = new Random();
    int a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        btn1 = findViewById(R.id.hamburger);

        final Animation shake = AnimationUtils.loadAnimation(
                this,R.anim.shake);

        one = (ImageView)findViewById(R.id.one);
        two = (ImageView)findViewById(R.id.two);
        three = (ImageView)findViewById(R.id.three);
        four = (ImageView)findViewById(R.id.four);
        five = (ImageView)findViewById(R.id.five);
        six = (ImageView)findViewById(R.id.six);
        seven = (ImageView)findViewById(R.id.seven);
        eight = (ImageView)findViewById(R.id.eight);
        nine = (ImageView)findViewById(R.id.nine);
        ten = (ImageView)findViewById(R.id.ten);
        eleven = (ImageView)findViewById(R.id.eleven);

        one.setVisibility(View.INVISIBLE);
        two.setVisibility(View.INVISIBLE);
        three.setVisibility(View.INVISIBLE);
        four.setVisibility(View.INVISIBLE);
        five.setVisibility(View.INVISIBLE);
        six.setVisibility(View.INVISIBLE);
        seven.setVisibility(View.INVISIBLE);
        eight.setVisibility(View.INVISIBLE);
        nine.setVisibility(View.INVISIBLE);
        ten.setVisibility(View.INVISIBLE);
        eleven.setVisibility(View.INVISIBLE);

        number = random.nextInt(7) + 1;
        a=0;


        //1은 베이컨, 2는 토마토, 3은 고기, 4는 피클 5는 치즈, 6은 양배추, 7은 윗빵
        //윗빵이 나오면 게임종료
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (a == 0) {
                    one.startAnimation(shake);
                    one.setVisibility(View.VISIBLE);
                    a++;
                } else if (a == 1) {
                    two.startAnimation(shake);
                    number = random.nextInt(7) + 1;
                    a++;
                    if (number == 1) {
                        two.setImageResource(R.drawable.bacon);
                        two.setVisibility(View.VISIBLE);
                    } else if (number == 2) {
                        two.setImageResource(R.drawable.tamato);
                        two.setVisibility(View.VISIBLE);
                    } else if (number == 3) {
                        two.setImageResource(R.drawable.meat);
                        two.setVisibility(View.VISIBLE);
                    } else if (number == 4) {
                        two.setImageResource(R.drawable.piccle);
                        two.setVisibility(View.VISIBLE);
                    } else if (number == 5) {
                        two.setImageResource(R.drawable.cheese);
                        two.setVisibility(View.VISIBLE);
                    } else if (number == 6) {
                        two.setImageResource(R.drawable.lettus);
                        two.setVisibility(View.VISIBLE);
                    } else {
                        two.setImageResource(R.drawable.bunup);
                        two.setVisibility(View.VISIBLE);
                        //코드입력
                        Intent intent = new Intent(MainActivity8.this, MainActivity10.class);
                        startActivity(intent);
                        btn1.setVisibility(View.INVISIBLE);

                    }
                } else if (a == 2) {
                    three.startAnimation(shake);
                    number = random.nextInt(7) + 1;
                    a++;
                    if (number == 1) {
                        three.setImageResource(R.drawable.bacon);
                        three.setVisibility(View.VISIBLE);
                    } else if (number == 2) {
                        three.setImageResource(R.drawable.tamato);
                        three.setVisibility(View.VISIBLE);
                    } else if (number == 3) {
                        three.setImageResource(R.drawable.meat);
                        three.setVisibility(View.VISIBLE);
                    } else if (number == 4) {
                        three.setImageResource(R.drawable.piccle);
                        three.setVisibility(View.VISIBLE);
                    } else if (number == 5) {
                        three.setImageResource(R.drawable.cheese);
                        three.setVisibility(View.VISIBLE);
                    } else if (number == 6) {
                        three.setImageResource(R.drawable.lettus);
                        three.setVisibility(View.VISIBLE);
                    } else {
                        three.setImageResource(R.drawable.bunup);
                        three.setVisibility(View.VISIBLE);
                        //코드입력
                        Intent intent = new Intent(MainActivity8.this, MainActivity10.class);
                        startActivity(intent);
                        btn1.setVisibility(View.INVISIBLE);
                    }
                } else if (a == 3) {
                    four.startAnimation(shake);

                    number = random.nextInt(7) + 1;
                    a++;
                    if (number == 1) {
                        four.setImageResource(R.drawable.bacon);
                        four.setVisibility(View.VISIBLE);
                    } else if (number == 2) {
                        four.setImageResource(R.drawable.tamato);
                        four.setVisibility(View.VISIBLE);
                    } else if (number == 3) {
                        four.setImageResource(R.drawable.meat);
                        four.setVisibility(View.VISIBLE);
                    } else if (number == 4) {
                        four.setImageResource(R.drawable.piccle);
                        four.setVisibility(View.VISIBLE);
                    } else if (number == 5) {
                        four.setImageResource(R.drawable.cheese);
                        four.setVisibility(View.VISIBLE);
                    } else if (number == 6) {
                        four.setImageResource(R.drawable.lettus);
                        four.setVisibility(View.VISIBLE);
                    } else {
                        four.setImageResource(R.drawable.bunup);
                        four.setVisibility(View.VISIBLE);
                        //코드입력
                        Intent intent = new Intent(MainActivity8.this, MainActivity10.class);
                        startActivity(intent);
                        btn1.setVisibility(View.INVISIBLE);
                    }
                } else if (a == 4) {
                    five.startAnimation(shake);

                    number = random.nextInt(7) + 1;
                    a++;
                    if (number == 1) {
                        five.setImageResource(R.drawable.bacon);
                        five.setVisibility(View.VISIBLE);
                    } else if (number == 2) {
                        five.setImageResource(R.drawable.tamato);
                        five.setVisibility(View.VISIBLE);
                    } else if (number == 3) {
                        five.setImageResource(R.drawable.meat);
                        five.setVisibility(View.VISIBLE);
                    } else if (number == 4) {
                        five.setImageResource(R.drawable.piccle);
                        five.setVisibility(View.VISIBLE);
                    } else if (number == 5) {
                        five.setImageResource(R.drawable.cheese);
                        five.setVisibility(View.VISIBLE);
                    } else if (number == 6) {
                        five.setImageResource(R.drawable.lettus);
                        five.setVisibility(View.VISIBLE);
                    } else {
                        five.setImageResource(R.drawable.bunup);
                        five.setVisibility(View.VISIBLE);
                        //코드입력
                        Intent intent = new Intent(MainActivity8.this, MainActivity10.class);
                        startActivity(intent);
                        btn1.setVisibility(View.INVISIBLE);
                    }
                } else if (a == 5) {
                    six.startAnimation(shake);

                    number = random.nextInt(7) + 1;
                    a++;
                    if (number == 1) {
                        six.setImageResource(R.drawable.bacon);
                        six.setVisibility(View.VISIBLE);
                    } else if (number == 2) {
                        six.setImageResource(R.drawable.tamato);
                        six.setVisibility(View.VISIBLE);
                    } else if (number == 3) {
                        six.setImageResource(R.drawable.meat);
                        six.setVisibility(View.VISIBLE);
                    } else if (number == 4) {
                        six.setImageResource(R.drawable.piccle);
                        six.setVisibility(View.VISIBLE);
                    } else if (number == 5) {
                        six.setImageResource(R.drawable.cheese);
                        six.setVisibility(View.VISIBLE);
                    } else if (number == 6) {
                        six.setImageResource(R.drawable.lettus);
                        six.setVisibility(View.VISIBLE);
                    } else {
                        six.setImageResource(R.drawable.bunup);
                        six.setVisibility(View.VISIBLE);
                        //코드입력
                        Intent intent = new Intent(MainActivity8.this, MainActivity10.class);
                        startActivity(intent);
                        btn1.setVisibility(View.INVISIBLE);
                    }
                } else if (a == 6) {
                    seven.startAnimation(shake);

                    number = random.nextInt(7) + 1;
                    a++;
                    if (number == 1) {
                        seven.setImageResource(R.drawable.bacon);
                        seven.setVisibility(View.VISIBLE);
                    } else if (number == 2) {
                        seven.setImageResource(R.drawable.tamato);
                        seven.setVisibility(View.VISIBLE);
                    } else if (number == 3) {
                        seven.setImageResource(R.drawable.meat);
                        seven.setVisibility(View.VISIBLE);
                    } else if (number == 4) {
                        seven.setImageResource(R.drawable.piccle);
                        seven.setVisibility(View.VISIBLE);
                    } else if (number == 5) {
                        seven.setImageResource(R.drawable.cheese);
                        seven.setVisibility(View.VISIBLE);
                    } else if (number == 6) {
                        seven.setImageResource(R.drawable.lettus);
                        seven.setVisibility(View.VISIBLE);
                    } else {
                        seven.setImageResource(R.drawable.bunup);
                        seven.setVisibility(View.VISIBLE);
                        //코드입력
                        Intent intent = new Intent(MainActivity8.this, MainActivity10.class);
                        startActivity(intent);
                        btn1.setVisibility(View.INVISIBLE);
                    }
                } else if (a == 7) {
                    eight.startAnimation(shake);

                    number = random.nextInt(7) + 1;
                    a++;
                    if (number == 1) {
                        eight.setImageResource(R.drawable.bacon);
                        eight.setVisibility(View.VISIBLE);
                    } else if (number == 2) {
                        eight.setImageResource(R.drawable.tamato);
                        eight.setVisibility(View.VISIBLE);
                    } else if (number == 3) {
                        eight.setImageResource(R.drawable.meat);
                        eight.setVisibility(View.VISIBLE);
                    } else if (number == 4) {
                        eight.setImageResource(R.drawable.piccle);
                        eight.setVisibility(View.VISIBLE);
                    } else if (number == 5) {
                        eight.setImageResource(R.drawable.cheese);
                        eight.setVisibility(View.VISIBLE);
                    } else if (number == 6) {
                        eight.setImageResource(R.drawable.lettus);
                        eight.setVisibility(View.VISIBLE);
                    } else {
                        eight.setImageResource(R.drawable.bunup);
                        eight.setVisibility(View.VISIBLE);
                        //코드입력
                        Intent intent = new Intent(MainActivity8.this, MainActivity10.class);
                        startActivity(intent);
                        btn1.setVisibility(View.INVISIBLE);
                    }
                } else if (a == 8) {
                    nine.startAnimation(shake);

                    number = random.nextInt(7) + 1;
                    a++;
                    if (number == 1) {
                        nine.setImageResource(R.drawable.bacon);
                        nine.setVisibility(View.VISIBLE);
                    } else if (number == 2) {
                        nine.setImageResource(R.drawable.tamato);
                        nine.setVisibility(View.VISIBLE);
                    } else if (number == 3) {
                        nine.setImageResource(R.drawable.meat);
                        nine.setVisibility(View.VISIBLE);
                    } else if (number == 4) {
                        nine.setImageResource(R.drawable.piccle);
                        nine.setVisibility(View.VISIBLE);
                    } else if (number == 5) {
                        nine.setImageResource(R.drawable.cheese);
                        nine.setVisibility(View.VISIBLE);
                    } else if (number == 6) {
                        nine.setImageResource(R.drawable.lettus);
                        nine.setVisibility(View.VISIBLE);
                    } else {
                        nine.setImageResource(R.drawable.bunup);
                        nine.setVisibility(View.VISIBLE);
                        //코드입력
                        Intent intent = new Intent(MainActivity8.this, MainActivity10.class);
                        startActivity(intent);
                        btn1.setVisibility(View.INVISIBLE);
                    }
                } else if (a == 9) {
                    ten.startAnimation(shake);

                    number = random.nextInt(7) + 1;
                    a++;
                    if (number == 1) {
                    ten.setImageResource(R.drawable.bacon);
                    ten.setVisibility(View.VISIBLE);
                } else if (number == 2) {
                    ten.setImageResource(R.drawable.tamato);
                    ten.setVisibility(View.VISIBLE);
                } else if (number == 3) {
                    ten.setImageResource(R.drawable.meat);
                    ten.setVisibility(View.VISIBLE);
                } else if (number == 4) {
                    ten.setImageResource(R.drawable.piccle);
                    ten.setVisibility(View.VISIBLE);
                } else if (number == 5) {
                    ten.setImageResource(R.drawable.cheese);
                    ten.setVisibility(View.VISIBLE);
                } else if (number == 6) {
                    ten.setImageResource(R.drawable.lettus);
                    ten.setVisibility(View.VISIBLE);
                } else {
                    ten.setImageResource(R.drawable.bunup);
                    ten.setVisibility(View.VISIBLE);
                    //코드입력
                        Intent intent = new Intent(MainActivity8.this, MainActivity10.class);
                        startActivity(intent);
                        btn1.setVisibility(View.INVISIBLE);
                    }
            }else if(a==10)
            {eleven.startAnimation(shake);
                eleven.setImageResource(R.drawable.bunup);
                eleven.setVisibility(View.VISIBLE);
                btn1.setVisibility(View.INVISIBLE);
                Intent intent = new Intent(MainActivity8.this, MainActivity10.class);
                startActivity(intent);
            }

        }

        });
}
}