package com.example.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Horse_game_Activity extends AppCompatActivity {

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
    int rank1, rank2, rank3, rank4;

    AnimationDrawable ania, anib, anic, anid;

    AnimationDrawable ani1;
    ImageView background;
    Handler handler = new Handler();

    private ArrayList<Integer> list;

    SharedPreferences pref;          // 프리퍼런스
    SharedPreferences.Editor editor; // 에디터



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horse_game);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        img = (ImageView)findViewById(R.id.horse1);
        img2 = (ImageView)findViewById(R.id.horse2);
        img3 = (ImageView)findViewById(R.id.horse3);
        img4 = (ImageView)findViewById(R.id.horse4);
        img5 = (ImageView)findViewById(R.id.flag);

        number1 = random.nextInt(200)*3+15000;
        number2 = random2.nextInt(200)*3+15000;
        number3 = random3.nextInt(200)*3+15000;
        number4 = random4.nextInt(200)*3+15000;

        //MySoundPlayer.initSounds(getApplicationContext());
        background = findViewById(R.id.background);

        MySoundPlayer_Congratulation.initSounds(getApplicationContext());
        MySoundPlayer.initSounds(getApplicationContext());   // 효과음

        findViewById(R.id.start1).setOnClickListener((v)->{

        });
        Intent intent = new Intent(Horse_game_Activity.this, MainActivity16.class);
        startActivity(intent);


        pref = getSharedPreferences("pref1", Activity.MODE_PRIVATE);

        editor = pref.edit();
        editor.clear().apply();


        Button button = findViewById(R.id.start1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MySoundPlayer.play(MySoundPlayer.Toy_Train_Whistle_Sound);
                    TranslateAnimation ani = new TranslateAnimation(
                            0, 2200, 0, 0);
                    ani.setDuration(number1);
                    img.startAnimation(ani);
                    img.setImageResource(R.drawable.horserun);
                    ania= (AnimationDrawable) img.getDrawable();
                    ania.start();


                    TranslateAnimation ani2 = new TranslateAnimation(
                            0, 2200, 0, 0);
                    ani2.setDuration(number2);
                    img2.startAnimation(ani2);
                    img2.setImageResource(R.drawable.horserun2);
                    anib= (AnimationDrawable) img2.getDrawable();
                    anib.start();

                    TranslateAnimation ani3 = new TranslateAnimation(
                            0, 2200, 0, 0);
                    ani3.setDuration(number3);
                    img3.startAnimation(ani3);
                    img3.setImageResource(R.drawable.horserun3);
                    anic= (AnimationDrawable) img3.getDrawable();
                    anic.start();

                    TranslateAnimation ani4 = new TranslateAnimation(
                            0, 2200, 0, 0);
                    ani4.setDuration(number4);
                    img4.startAnimation(ani4);
                    img4.setImageResource(R.drawable.horserun4);
                    anid= (AnimationDrawable) img4.getDrawable();
                    anid.start();

                list = new ArrayList<Integer>();
                list.add(number1);
                list.add(number2);
                list.add(number3);
                list.add(number4);

                int h = number1+number2+number3+number4;
                int i = Collections.min(list);
                int j = Collections.max(list);
                double k = (h - (i + j))/2;
                double n1 = number1 - k;
                double n2 = number2 - k;
                double n3 = number3 - k;
                double n4 = number4 - k;

                if(number1 == i) {//1번말이 1위일때 각자의 말 순위 코드
                    rank1 = 1;
                    if(number2 == j) {
                        rank2 = 4;
                        if(n3>0) {
                            rank3 = 2;
                            rank4 = 3;
                            editor.putInt("rank1", rank1);
                            editor.putInt("rank2", rank2);
                            editor.putInt("rank3", rank3);
                            editor.putInt("rank4", rank4);
                            editor.apply();
                        }else if(n4>0) {
                            rank4 = 2;
                            rank3 = 3;
                            editor.putInt("rank1", rank1);
                            editor.putInt("rank2", rank2);
                            editor.putInt("rank3", rank3);
                            editor.putInt("rank4", rank4);
                            editor.apply();

                        }
                    }else if(number3 == j) {
                        rank3 = 4;
                        if(n2>0) {
                            rank2 = 2;
                            rank4 = 3;
                            editor.putInt("rank1", rank1);
                            editor.putInt("rank2", rank2);
                            editor.putInt("rank3", rank3);
                            editor.putInt("rank4", rank4);
                            editor.apply();
                        }else if(n4>0) {
                            rank4 = 2;
                            rank2 = 3;
                            editor.putInt("rank1", rank1);
                            editor.putInt("rank2", rank2);
                            editor.putInt("rank3", rank3);
                            editor.putInt("rank4", rank4);
                            editor.apply();
                        }
                    }else if(number4 == j) {
                        rank4 = 4;
                        if(n2>0) {
                            rank2 = 2;
                            rank3 = 3;
                            editor.putInt("rank1", rank1);
                            editor.putInt("rank2", rank2);
                            editor.putInt("rank3", rank3);
                            editor.putInt("rank4", rank4);
                            editor.apply();
                        }else if(n3>0) {
                            rank3 = 2;
                            rank2 = 3;
                            editor.putInt("rank1", rank1);
                            editor.putInt("rank2", rank2);
                            editor.putInt("rank3", rank3);
                            editor.putInt("rank4", rank4);
                            editor.apply();
                        }
                    }

                }else if (number2 == i) {//2번말이 1위일때 각자의 말 순위 코드
                    rank2 = 1;
                    if(number1 == j) {
                        rank1 = 4;
                        if(n3>0) {
                            rank3 = 2;
                            rank4 = 3;
                            editor.putInt("rank1", rank1);
                            editor.putInt("rank2", rank2);
                            editor.putInt("rank3", rank3);
                            editor.putInt("rank4", rank4);
                            editor.apply();
                        }else if(n4>0) {
                            rank4 = 2;
                            rank3 = 3;
                            editor.putInt("rank1", rank1);
                            editor.putInt("rank2", rank2);
                            editor.putInt("rank3", rank3);
                            editor.putInt("rank4", rank4);
                            editor.apply();
                        }
                    }else if(number3 == j) {
                        rank3 = 4;
                        if(n2>0) {
                            rank1 = 2;
                            rank4 = 3;
                            editor.putInt("rank1", rank1);
                            editor.putInt("rank2", rank2);
                            editor.putInt("rank3", rank3);
                            editor.putInt("rank4", rank4);
                            editor.apply();
                        }else if(n4>0) {
                            rank4 = 2;
                            rank1 = 3;
                            editor.putInt("rank1", rank1);
                            editor.putInt("rank2", rank2);
                            editor.putInt("rank3", rank3);
                            editor.putInt("rank4", rank4);
                            editor.apply();
                        }
                    }else if(number4 == j) {
                        rank4 = 4;
                        if(n2>0) {
                            rank1 = 2;
                            rank3 = 3;
                            editor.putInt("rank1", rank1);
                            editor.putInt("rank2", rank2);
                            editor.putInt("rank3", rank3);
                            editor.putInt("rank4", rank4);
                            editor.apply();
                        }else if(n3>0) {
                            rank3 = 2;
                            rank1 = 3;
                            editor.putInt("rank1", rank1);
                            editor.putInt("rank2", rank2);
                            editor.putInt("rank3", rank3);
                            editor.putInt("rank4", rank4);
                            editor.apply();
                        }
                    }

                }else if (number3 == i) {//3번말이 1위일때 각자의 말 순위 코드
                    rank3 = 1;
                    if(number1 == j) {
                        rank1 = 4;
                        if(n2>0) {
                            rank2 = 2;
                            rank4 = 3;
                            editor.putInt("rank1", rank1);
                            editor.putInt("rank2", rank2);
                            editor.putInt("rank3", rank3);
                            editor.putInt("rank4", rank4);
                            editor.apply();
                        }else if(n4>0) {
                            rank4 = 2;
                            rank2 = 3;
                            editor.putInt("rank1", rank1);
                            editor.putInt("rank2", rank2);
                            editor.putInt("rank3", rank3);
                            editor.putInt("rank4", rank4);
                            editor.apply();
                        }
                    }else if(number2 == j) {
                        rank2 = 4;
                        if(n1>0) {
                            rank1 = 2;
                            rank4 = 3;
                            editor.putInt("rank1", rank1);
                            editor.putInt("rank2", rank2);
                            editor.putInt("rank3", rank3);
                            editor.putInt("rank4", rank4);
                            editor.apply();
                        }else if(n4>0) {
                            rank4 = 2;
                            rank1 = 3;
                            editor.putInt("rank1", rank1);
                            editor.putInt("rank2", rank2);
                            editor.putInt("rank3", rank3);
                            editor.putInt("rank4", rank4);
                            editor.apply();
                        }
                    }else if(number4 == j) {
                        rank4 = 4;
                        if(n1>0) {
                            rank2 = 2;
                            rank1 = 3;
                            editor.putInt("rank1", rank1);
                            editor.putInt("rank2", rank2);
                            editor.putInt("rank3", rank3);
                            editor.putInt("rank4", rank4);
                            editor.apply();
                        }else if(n3>0) {
                            rank1 = 2;
                            rank2 = 3;
                            editor.putInt("rank1", rank1);
                            editor.putInt("rank2", rank2);
                            editor.putInt("rank3", rank3);
                            editor.putInt("rank4", rank4);
                            editor.apply();
                        }
                    }

                }else if (number4 == i) {//4번말이 1위일때 각자의 말 순위 코드
                    rank4 = 1;
                    if(number1 == j) {
                        rank1 = 4;
                        if(n3>0) {
                            rank3 = 2;
                            rank2 = 3;
                            editor.putInt("rank1", rank1);
                            editor.putInt("rank2", rank2);
                            editor.putInt("rank3", rank3);
                            editor.putInt("rank4", rank4);
                            editor.apply();
                        }else if(n2>0) {
                            rank2 = 2;
                            rank3 = 3;
                            editor.putInt("rank1", rank1);
                            editor.putInt("rank2", rank2);
                            editor.putInt("rank3", rank3);
                            editor.putInt("rank4", rank4);
                            editor.apply();
                        }
                    }else if(number3 == j) {
                        rank3 = 4;
                        if(n2>0) {
                            rank2 = 2;
                            rank1 = 3;
                            editor.putInt("rank1", rank1);
                            editor.putInt("rank2", rank2);
                            editor.putInt("rank3", rank3);
                            editor.putInt("rank4", rank4);
                            editor.apply();
                        }else if(n1>0) {
                            rank1 = 2;
                            rank2 = 3;
                            editor.putInt("rank1", rank1);
                            editor.putInt("rank2", rank2);
                            editor.putInt("rank3", rank3);
                            editor.putInt("rank4", rank4);
                            editor.apply();
                        }
                    }else if(number1 == j) {
                        rank1 = 4;
                        if(n2>0) {
                            rank2 = 2;
                            rank3 = 3;
                            editor.putInt("rank1", rank1);
                            editor.putInt("rank2", rank2);
                            editor.putInt("rank3", rank3);
                            editor.putInt("rank4", rank4);
                            editor.apply();
                        }else if(n3>0) {
                            rank3 = 2;
                            rank2 = 3;
                            editor.putInt("rank1", rank1);
                            editor.putInt("rank2", rank2);
                            editor.putInt("rank3", rank3);
                            editor.putInt("rank4", rank4);
                            editor.apply();
                        }
                    }
                }



                    ani.setAnimationListener(new Animation.AnimationListener() {
                        @Override
                        public void onAnimationStart(Animation animation) {
                        }
                        @Override
                        public void onAnimationEnd(Animation animation) {
                            img.setImageResource(R.drawable.flag);
                            if(number1 == j) {
                                MySoundPlayer_Congratulation.play(MySoundPlayer_Congratulation.DING_DONG1);
                                //코드입력
                                background.setImageResource(R.drawable.cg);
                                ani1= (AnimationDrawable) background.getDrawable();
                                ani1.start();
                                handler.postDelayed(new Runnable()  {
                                    public void run() {
                                        // 시간 지난 후 실행할 코딩
                                        Intent intent = new Intent(Horse_game_Activity.this, MainActivity19.class);
                                        startActivity(intent);
                                    }
                                }, 2000); // 2초후
                            }
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
                        img2.setImageResource(R.drawable.flag);
                        if(number2 == j) {
                            MySoundPlayer_Congratulation.play(MySoundPlayer_Congratulation.DING_DONG1);
                            //코드입력
                            background.setImageResource(R.drawable.cg);
                            ani1= (AnimationDrawable) background.getDrawable();
                            ani1.start();
                            handler.postDelayed(new Runnable()  {
                                public void run() {
                                    // 시간 지난 후 실행할 코딩
                                    Intent intent = new Intent(Horse_game_Activity.this, MainActivity19.class);
                                    startActivity(intent);
                                }
                            }, 2000); // 2초후
                        }
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
                        img3.setImageResource(R.drawable.flag);
                        if(number3 == j) {
                            MySoundPlayer_Congratulation.play(MySoundPlayer_Congratulation.DING_DONG1);
                            //코드입력
                            background.setImageResource(R.drawable.cg);
                            ani1= (AnimationDrawable) background.getDrawable();
                            ani1.start();
                            handler.postDelayed(new Runnable()  {
                                public void run() {
                                    // 시간 지난 후 실행할 코딩
                                    Intent intent = new Intent(Horse_game_Activity.this, MainActivity19.class);
                                    startActivity(intent);
                                }
                            }, 2000); // 2초후
                        }
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
                        img4.setImageResource(R.drawable.flag);
                        if(number4 == j) {
                            MySoundPlayer_Congratulation.play(MySoundPlayer_Congratulation.DING_DONG1);
                            //코드입력
                            background.setImageResource(R.drawable.cg);
                            ani1= (AnimationDrawable) background.getDrawable();
                            ani1.start();
                            handler.postDelayed(new Runnable()  {
                                public void run() {
                                    // 시간 지난 후 실행할 코딩
                                    Intent intent = new Intent(Horse_game_Activity.this, MainActivity19.class);
                                    startActivity(intent);
                                }
                            }, 2000); // 2초후
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