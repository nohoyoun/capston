package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorListenerAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity12 extends AppCompatActivity {

    ImageView img;
    ImageView img2;
    ImageView img3;
    ImageView img4;
    ImageView img5;
    Random random = new Random();
    Random random2 = new Random();
    Random random3 = new Random();
    Random random4 = new Random();

    int number1, number2, number3, number4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);

        img = (ImageView)findViewById(R.id.horse1);
        img2 = (ImageView)findViewById(R.id.horse2);
        img3 = (ImageView)findViewById(R.id.horse3);
        img4 = (ImageView)findViewById(R.id.horse4);
        img5 = (ImageView)findViewById(R.id.flag);



        number1 = random.nextInt(200)*100;
        number2 = random2.nextInt(200)*100;
        number3 = random3.nextInt(200)*100;
        number4 = random4.nextInt(200)*100;

        Button button = findViewById(R.id.start1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                    TranslateAnimation ani = new TranslateAnimation(
                            0, 2900, 0, 0);
                    ani.setDuration(number1);
                    img.startAnimation(ani);


                    TranslateAnimation ani2 = new TranslateAnimation(
                            0, 2900, 0, 0);
                    ani2.setDuration(number2);
                    img2.startAnimation(ani2);


                    TranslateAnimation ani3 = new TranslateAnimation(
                            0, 2900, 0, 0);
                    ani3.setDuration(number3);
                    img3.startAnimation(ani3);


                    TranslateAnimation ani4 = new TranslateAnimation(
                            0, 2900, 0, 0);
                    ani4.setDuration(number4);
                    img4.startAnimation(ani4);


                    ani.setAnimationListener(new Animation.AnimationListener() {
                        @Override
                        public void onAnimationStart(Animation animation) {
                        }
                        @Override
                        public void onAnimationEnd(Animation animation) {
                            Intent intent = new Intent(MainActivity12.this, MainActivity10.class);
                            startActivity(intent);
                            img.clearAnimation();
                            img2.clearAnimation();
                            img2.setVisibility(View.INVISIBLE);
                            img3.clearAnimation();
                            img3.setVisibility(View.INVISIBLE);
                            img4.clearAnimation();
                            img4.setVisibility(View.INVISIBLE);
                        }
                        @Override
                        public void onAnimationRepeat(Animation animation) {
                        }
                    });

                ani2.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                    }
                    @Override
                    public void onAnimationEnd(Animation animation) {
                        Intent intent = new Intent(MainActivity12.this, MainActivity10.class);
                        startActivity(intent);
                        img.clearAnimation();
                        img.setVisibility(View.INVISIBLE);
                        img2.clearAnimation();
                        img3.clearAnimation();
                        img3.setVisibility(View.INVISIBLE);
                        img4.clearAnimation();
                        img4.setVisibility(View.INVISIBLE);
                    }
                    @Override
                    public void onAnimationRepeat(Animation animation) {
                    }
                });

                ani3.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                    }
                    @Override
                    public void onAnimationEnd(Animation animation) {
                        Intent intent = new Intent(MainActivity12.this, MainActivity10.class);
                        startActivity(intent);
                        img.clearAnimation();
                        img.setVisibility(View.INVISIBLE);
                        img2.clearAnimation();
                        img2.setVisibility(View.INVISIBLE);
                        img3.clearAnimation();
                        img4.clearAnimation();
                        img4.setVisibility(View.INVISIBLE);
                    }
                    @Override
                    public void onAnimationRepeat(Animation animation) {
                    }
                });

                ani4.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                    }
                    @Override
                    public void onAnimationEnd(Animation animation) {
                        Intent intent = new Intent(MainActivity12.this, MainActivity10.class);
                        startActivity(intent);
                        img.clearAnimation();
                        img.setVisibility(View.INVISIBLE);
                        img2.clearAnimation();
                        img2.setVisibility(View.INVISIBLE);
                        img3.clearAnimation();
                        img3.setVisibility(View.INVISIBLE);
                        img4.clearAnimation();
                    }
                    @Override
                    public void onAnimationRepeat(Animation animation) {
                    }
                });


            }

        });

    }

}