package com.example.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;



public class Random_Game_Choice_Slot_Activity extends AppCompatActivity {

    class Car extends Thread{
        public void run() {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    Handler handler = new Handler();
    MySoundPlayer mySoundPlayer;
    private Animation flowAnim;
    private Button mSlotMechine;
    private TextView mSlotText;
    Random random = new Random();
    int i, j;
    Car c = new Car();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        MySoundPlayer.initSounds(getApplicationContext());
        //supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        setContentView(R.layout.activity_game_choice_slot);
        mSlotText = (TextView) findViewById(R.id.slottext);
        MySoundPlayer.play(MySoundPlayer.Coin_5);
        i = random.nextInt(6) + 1;
        j = 0;

        flowAnim = AnimationUtils.loadAnimation(this, R.anim.slot);
        mSlotMechine = findViewById(R.id.fr);

        mSlotMechine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MySoundPlayer.play(MySoundPlayer.Slot_Sound);
                mSlotText.startAnimation(flowAnim);

                flowAnim.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                    }
                    @Override
                    public void onAnimationEnd(Animation animation) {
                        mSlotMechine.setVisibility(View.INVISIBLE);
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
                                handler.postDelayed(new Runnable()  {
                                    public void run() {
                                        // 시간 지난 후 실행할 코딩
                                        Intent intent = new Intent(Random_Game_Choice_Slot_Activity.this, Dice_game_Activity.class);
                                        startActivity(intent);
                                    }
                                }, 2000); // 2초후
                                break;
                            }
                            case 2 : {
                                c.start();
                                handler.postDelayed(new Runnable()  {
                                    public void run() {
                                        // 시간 지난 후 실행할 코딩
                                        Intent intent = new Intent(Random_Game_Choice_Slot_Activity.this, Niddle_game_Activity.class);
                                        startActivity(intent);
                                    }
                                }, 2000); // 2초후
                                break;
                            }
                            case 3 : {
                                c.start();
                                handler.postDelayed(new Runnable()  {
                                    public void run() {
                                        // 시간 지난 후 실행할 코딩
                                        Intent intent = new Intent(Random_Game_Choice_Slot_Activity.this, Horse_game_Activity.class);
                                        startActivity(intent);
                                    }
                                }, 2000); // 2초후
                                break;
                            }
                            case 4 : {
                                c.start();
                                handler.postDelayed(new Runnable()  {
                                    public void run() {
                                        // 시간 지난 후 실행할 코딩
                                        Intent intent = new Intent(Random_Game_Choice_Slot_Activity.this, Cat_Game_Main_Activity.class);
                                        startActivity(intent);
                                    }
                                }, 2000); // 2초후
                                break;
                            }
                            case 5 : {
                                c.start();
                                handler.postDelayed(new Runnable()  {
                                    public void run() {
                                        // 시간 지난 후 실행할 코딩
                                        Intent intent = new Intent(Random_Game_Choice_Slot_Activity.this, Hamburger_game_Activity.class);
                                        startActivity(intent);
                                    }
                                }, 2000); // 2초후
                                break;
                            }
                            case 6 : {
                                c.start();
                                handler.postDelayed(new Runnable()  {
                                    public void run() {
                                        // 시간 지난 후 실행할 코딩
                                        Intent intent = new Intent(Random_Game_Choice_Slot_Activity.this, Roullet_Game_Activity.class);
                                        startActivity(intent);
                                    }
                                }, 2000); // 2초후
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
