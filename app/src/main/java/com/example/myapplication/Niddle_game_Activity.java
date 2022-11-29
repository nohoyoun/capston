package com.example.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.RadioGroup;

import java.util.Random;

public class Niddle_game_Activity extends AppCompatActivity {

    ImageView iv_needle;
    ImageView table;
    float startDegree = 0f;
    float endDegree = 0f;
    private RadioGroup sel;
    int whichRadioButton = 1;
    boolean flag1;
    MySoundPlayer mySoundPlayer;
    AnimationDrawable ania;
    ImageView background;
    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_niddle_game);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        background = findViewById(R.id.background);

        MySoundPlayer_Congratulation.initSounds(getApplicationContext());
        MySoundPlayer.initSounds(getApplicationContext());   // 효과음


        //MySoundPlayer.initSounds(getApplicationContext());
        // 애니메이션 이미지 인식
        sel = findViewById(R.id.sel);
        iv_needle = (ImageView) findViewById(R.id.needle);
        table = (ImageView) findViewById(R.id.table);
        whichRadioButton = 1;

        sel.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.chick) {
                   whichRadioButton = 1;
                    iv_needle.setImageResource(R.drawable.chicken);
                    table.setImageResource(R.drawable.dish);
                } else if (checkedId == R.id.sozu) {
                   whichRadioButton = 2;
                    iv_needle.setImageResource(R.drawable.sozu);
                    table.setImageResource(R.drawable.table);
                } else if (checkedId == R.id.cafe) {
                   whichRadioButton = 3;
                    iv_needle.setImageResource(R.drawable.coffee);
                    table.setImageResource(R.drawable.coffetable);
                }
            }
        });



    }


// 룰렛 이미지 터치 시에 호출되는 메소드
        public void rotate (View view){

            // ---------- 회전각도 설정 ----------
            startDegree = endDegree;    // 이전 정지 각도를 시작 각도로 설정
            Random rand = new Random(); // 랜덤 객체 생성
            int degree_rand = rand.nextInt(360);    // 0~359 사이의 정수 추출
            endDegree = startDegree + 360 * 5 + degree_rand;  // 회전 종료각도 설정(초기 각도에서 세바퀴 돌고 0~359 난수만큼 회전)

            // ---------- 애니메이션 실행 ----------
            // 애니메이션 이미지에 대해 초기 각도에서 회전종료 각도까지 회전하는 애니메이션 객체 생성
            ObjectAnimator object = ObjectAnimator.ofFloat(iv_needle, "rotation", startDegree, endDegree);

            object.setInterpolator(new AccelerateDecelerateInterpolator()); // 애니메이션 속력 설정
            object.setDuration(1800);   // 애니메이션 시간(5초)
            object.start();   // 애니메이션 시작


            object.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animation) {
                    super.onAnimationEnd(animation);

                    MySoundPlayer_Congratulation.play(MySoundPlayer_Congratulation.DING_DONG1);
                    //코드입력
                    background.setImageResource(R.drawable.cg);
                    ania= (AnimationDrawable) background.getDrawable();
                    ania.start();
                    handler.postDelayed(new Runnable()  {
                        public void run() {
                            // 시간 지난 후 실행할 코딩
                            Intent intent = new Intent(Niddle_game_Activity.this, MainActivity10.class);
                            startActivity(intent);
                        }
                    }, 2000); // 2초후


                }
            });


        }

}