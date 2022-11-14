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

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
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
    int rank1, rank2, rank3, rank4;


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
                            0, 2200, 0, 0);
                    ani.setDuration(number1);
                    img.startAnimation(ani);


                    TranslateAnimation ani2 = new TranslateAnimation(
                            0, 2200, 0, 0);
                    ani2.setDuration(number2);
                    img2.startAnimation(ani2);


                    TranslateAnimation ani3 = new TranslateAnimation(
                            0, 2200, 0, 0);
                    ani3.setDuration(number3);
                    img3.startAnimation(ani3);


                    TranslateAnimation ani4 = new TranslateAnimation(
                            0, 2200, 0, 0);
                    ani4.setDuration(number4);
                    img4.startAnimation(ani4);


                LinkedList<Integer> list = new LinkedList<Integer>();

                list.add(number1);
                list.add(number2);
                list.add(number3);
                list.add(number4);

                Integer h = number1+number2+number3+number4;
                Integer i = Collections.min(list);
                Integer j = Collections.max(list);
                Integer k = (h - (Collections.min(list) + Collections.max(list)))/2;
                Integer n1 = number1 - k;
                Integer n2 = number2 - k;
                Integer n3 = number3 - k;
                Integer n4 = number4 - k;

                if(number1 == i) {//1번말이 1위일때 각자의 말 순위 코드
                    rank1 = 1;
                    if(number2 == j) {
                        rank2 = 4;
                        if(n3>0) {
                            rank3 = 2;
                            rank4 = 3;
                        }else if(n4>0) {
                            rank4 = 2;
                            rank3 = 3;
                        }
                    }else if(number3 == j) {
                        rank3 = 4;
                        if(n2>0) {
                            rank2 = 2;
                            rank4 = 3;
                        }else if(n4>0) {
                            rank4 = 2;
                            rank2 = 3;
                        }
                    }else if(number4 == j) {
                        rank4 = 4;
                        if(n2>0) {
                            rank2 = 2;
                            rank3 = 3;
                        }else if(n3>0) {
                            rank3 = 2;
                            rank2 = 3;
                        }
                    }
                }else if (number2 == i) {//2번말이 1위일때 각자의 말 순위 코드
                    rank2 = 1;
                    if(number1 == j) {
                        rank1 = 4;
                        if(n3>0) {
                            rank3 = 2;
                            rank4 = 3;
                        }else if(n4>0) {
                            rank4 = 2;
                            rank3 = 3;
                        }
                    }else if(number3 == j) {
                        rank3 = 4;
                        if(n2>0) {
                            rank2 = 2;
                            rank4 = 3;
                        }else if(n4>0) {
                            rank4 = 2;
                            rank2 = 3;
                        }
                    }else if(number4 == j) {
                        rank4 = 4;
                        if(n2>0) {
                            rank2 = 2;
                            rank3 = 3;
                        }else if(n3>0) {
                            rank3 = 2;
                            rank2 = 3;
                        }
                    }
                }else if (number3 == i) {//3번말이 1위일때 각자의 말 순위 코드
                    rank3 = 1;
                    if(number1 == j) {
                        rank1 = 4;
                        if(n2>0) {
                            rank2 = 2;
                            rank4 = 3;
                        }else if(n4>0) {
                            rank4 = 2;
                            rank2 = 3;
                        }
                    }else if(number2 == j) {
                        rank2 = 4;
                        if(n1>0) {
                            rank1 = 2;
                            rank4 = 3;
                        }else if(n4>0) {
                            rank4 = 2;
                            rank1 = 3;
                        }
                    }else if(number4 == j) {
                        rank4 = 4;
                        if(n1>0) {
                            rank2 = 2;
                            rank1 = 3;
                        }else if(n3>0) {
                            rank1 = 2;
                            rank2 = 3;
                        }
                    }
                }else if (number4 == i) {//4번말이 1위일때 각자의 말 순위 코드
                    rank4 = 1;
                    if(number1 == j) {
                        rank1 = 4;
                        if(n3>0) {
                            rank3 = 2;
                            rank2 = 3;
                        }else if(n2>0) {
                            rank2 = 2;
                            rank3 = 3;
                        }
                    }else if(number3 == j) {
                        rank3 = 4;
                        if(n2>0) {
                            rank2 = 2;
                            rank1 = 3;
                        }else if(n1>0) {
                            rank1 = 2;
                            rank2 = 3;
                        }
                    }else if(number1 == j) {
                        rank1 = 4;
                        if(n2>0) {
                            rank2 = 2;
                            rank3 = 3;
                        }else if(n3>0) {
                            rank3 = 2;
                            rank2 = 3;
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
                                Intent intent = new Intent(MainActivity12.this, MainActivity10.class);
                                startActivity(intent);
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
                            Intent intent = new Intent(MainActivity12.this, MainActivity10.class);
                            startActivity(intent);
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
                            Intent intent = new Intent(MainActivity12.this, MainActivity10.class);
                            startActivity(intent);
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
                            Intent intent = new Intent(MainActivity12.this, MainActivity10.class);
                            startActivity(intent);
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