package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;



public class MainActivity20 extends AppCompatActivity {

    class Car extends Thread{
        public void run() {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }


    private Animation flowAnim;
    private Button mSlotMechine;
    private TextView mSlotText;
    Random random = new Random();
    int i, j;
    Car c = new Car();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main20);
        mSlotText = (TextView) findViewById(R.id.slottext);

        i = random.nextInt(6) + 1;
        j = 0;

        flowAnim = AnimationUtils.loadAnimation(this, R.anim.slot);
        mSlotMechine = findViewById(R.id.fr);

        mSlotMechine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSlotText.startAnimation(flowAnim);
                flowAnim.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                    }
                    @Override
                    public void onAnimationEnd(Animation animation) {
                        switch (i) {
                            case 1: {
                                mSlotText.setText("주사위굴리기");
                                j = 1;
                                break;
                            }
                            case 2: {
                                mSlotText.setText("화살표돌리기");
                                j = 2;
                                break;
                            }
                            case 3: {
                                mSlotText.setText("경마게임");
                                j = 3;
                                break;
                            }
                            case 4: {
                                mSlotText.setText("고양이찾기");
                                j = 4;
                                break;
                            }
                            case 5: {
                                mSlotText.setText("랜덤햄버거찾기");
                                j = 5;
                                break;
                            }
                            case 6: {
                                mSlotText.setText("룰렛돌리기");
                                j = 6;
                                break;
                            }
                        }

                        switch (j) {
                            case 1 : {
                                c.start();
                                Intent intent = new Intent(MainActivity20.this, MainActivity5.class);
                                startActivity(intent);
                                break;
                            }
                            case 2 : {
                                c.start();
                                Intent intent = new Intent(MainActivity20.this, MainActivity3.class);
                                startActivity(intent);
                                break;
                            }
                            case 3 : {
                                c.start();
                                Intent intent = new Intent(MainActivity20.this, MainActivity12.class);
                                startActivity(intent);
                                break;
                            }
                            case 4 : {
                                c.start();
                                Intent intent = new Intent(MainActivity20.this, MainActivity18.class);
                                startActivity(intent);
                                break;
                            }
                            case 5 : {
                                c.start();
                                Intent intent = new Intent(MainActivity20.this, MainActivity8.class);
                                startActivity(intent);
                                break;
                            }
                            case 6 : {
                                c.start();
                                Intent intent = new Intent(MainActivity20.this, MainActivity17.class);
                                startActivity(intent);
                                break;
                            }
                        }
                    }
                    @Override
                    public void onAnimationRepeat(Animation animation) {
                    }
                });


            }

        });



    }
}
