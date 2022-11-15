package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity17 extends AppCompatActivity {
    private CircleManager circleManager;
    RelativeLayout layoutRoulette;
    
    Button btnRotate, start;
    TextView tvResult;

    private ArrayList<String> STRINGS;
    private float initAngle = 0.0f;
    private int num_roulette;

    //SharedPreferences.Editor editor; // 에디터
    SharedPreferences sharedPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main17);

        tvResult = findViewById(R.id.tvResult);
        btnRotate = findViewById(R.id.btnRotate);
        layoutRoulette = findViewById(R.id.layoutRoulette);
        start = findViewById(R.id.startbtn17);

        layoutRoulette.setVisibility(View.INVISIBLE);
        btnRotate.setVisibility(View.INVISIBLE);

        Intent intent = new Intent(MainActivity17.this, MainActivity13.class);
        startActivity(intent);

        sharedPreferences = getSharedPreferences("pref1", MODE_PRIVATE);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                start.setVisibility(View.INVISIBLE);
                layoutRoulette.setVisibility(View.VISIBLE);
                btnRotate.setVisibility(View.VISIBLE);

                Integer roulnum = sharedPreferences.getInt("num0", 1);

                num_roulette = roulnum;//activity13으로부터 숫자 넘겨받기 '완'
                STRINGS = setRandom(1000, num_roulette);
                circleManager = new CircleManager(MainActivity17.this, num_roulette);
                layoutRoulette.addView(circleManager);
            }
        });

        btnRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotateLayout(layoutRoulette, num_roulette);
            }
        });
    }

    public void rotateLayout(final RelativeLayout layout, final int num) {
        final float fromAngle = getRandom(360) + 3600 + initAngle;

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                getResult(fromAngle, num); // start when animation complete
            }
        }, 3000);

        RotateAnimation rotateAnimation = new RotateAnimation(initAngle, fromAngle,
                Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);

        rotateAnimation.setInterpolator(AnimationUtils.loadInterpolator(this, android.R.anim.accelerate_decelerate_interpolator));
        rotateAnimation.setDuration(3000);
        rotateAnimation.setFillEnabled(true);
        rotateAnimation.setFillAfter(true);
        layout.startAnimation(rotateAnimation);
    }

    // Set numbers on roulette to random
    //룰렛의 내용 작성
    public ArrayList<String> setRandom(int maxNumber, int num) {
        ArrayList<String> strings = new ArrayList<>();

        String name1 = sharedPreferences.getString("name1", "");
        String name2 = sharedPreferences.getString("name2", "");
        String name3 = sharedPreferences.getString("name3", "");
        String name4 = sharedPreferences.getString("name4", "");
        String name5 = sharedPreferences.getString("name5", "");
        String name6 = sharedPreferences.getString("name6", "");


        for (int i = 0; i < num; i++) {
            //입력한 변수 출력..완;
            switch (i) {
                case 0 :
                    strings.add(name1);
                    break;
                case 1 :
                    strings.add(name2);
                    break;
                case 2 :
                    strings.add(name3);
                    break;
                case 3 :
                    strings.add(name4);
                    break;
                case 4 :
                    strings.add(name5);
                    break;
                case 5 :
                    strings.add(name6);
                    break;
            }

        }

        return strings;
    }

    // get Angle to random
    private int getRandom(int maxNumber) {
        double r = Math.random();
        return (int)(r * maxNumber);
    }

    private void getResult(float angle, int num_roulette) {
        String text = "";
        angle = angle % 360;

        Log.d("roulette", "getResult : " + angle);

        if (num_roulette == 5) {
            if (angle > 342 || angle <= 54) { // 11   2
                text = STRINGS.get(3);
                buildAlert(text);
            } else if (angle > 54 && angle <= 126) { // 333   3
                text = STRINGS.get(2);
                buildAlert(text);
            } else if (angle > 126 && angle <= 198) { // 222   4
                text = STRINGS.get(1);
                buildAlert(text);
            } else if (angle > 198 && angle <= 270) { // 111    0
                text = STRINGS.get(0);
                buildAlert(text);
            } else if (angle > 270 && angle <= 342) { // 22     1
                text = STRINGS.get(4);
                buildAlert(text);
            }
        } else if (num_roulette == 6) {
            if (angle > 330 || angle <= 30) { // 22
                text = STRINGS.get(4);
                buildAlert(text);
            } else if (angle > 30 && angle <= 90) { // 11
                text = STRINGS.get(3);
                buildAlert(text);
            } else if (angle > 90 && angle <= 150) { // 333
                text = STRINGS.get(2);
                buildAlert(text);
            } else if (angle > 150 && angle <= 210) { // 222
                text = STRINGS.get(1);
                buildAlert(text);
            } else if (angle > 210 && angle <= 270) { // 111
                text = STRINGS.get(0);
                buildAlert(text);
            } else if (angle > 270 && angle <= 330) { // 3
                text = STRINGS.get(5);
                buildAlert(text);
            }
        }
        tvResult.setText("Result : " + text);
    }

    // if you want use AlertDialog then use this
    private void buildAlert(String text) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Congratulations")
                .setMessage("You have earned " + text + " points!")
                .setPositiveButton("OK", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        layoutRoulette.setRotation(360 - initAngle);
                    }
                });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public class CircleManager extends View {
        private Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        private int[] COLORS = {Color.RED, Color.GREEN, Color.BLUE, Color.CYAN, Color.MAGENTA, Color.GRAY};
        private int num;

        public CircleManager(Context context, int num) {
            super(context);
            this.num = num;
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);

            int width = layoutRoulette.getWidth();
            int height = layoutRoulette.getHeight();
            int sweepAngle = 360 / num;

            RectF rectF = new RectF(0, 0, width, height);
            Rect rect = new Rect(0, 0, width, height);

            int centerX = (rect.left + rect.right) / 2;
            int centerY = (rect.top + rect.bottom) / 2;
            int radius = (rect.right - rect.left) / 2;

            int temp = 0;

            for (int i = 0; i < num; i++) {
                paint.setColor(COLORS[i]);
                paint.setStyle(Paint.Style.FILL_AND_STROKE);
                paint.setAntiAlias(true);
                paint.setTextAlign(Paint.Align.CENTER);
                canvas.drawArc(rectF, temp, sweepAngle, true, paint);

                float medianAngle = (temp + (sweepAngle / 2f)) * (float) Math.PI / 180f;

                paint.setColor(Color.BLACK);
                paint.setTextSize(64);
                paint.setStyle(Paint.Style.FILL_AND_STROKE);

                float arcCenterX = (float) (centerX + (radius * Math.cos(medianAngle))); // Arc's center X
                float arcCenterY = (float) (centerY + (radius * Math.sin(medianAngle))); // Arc's center Y

                // put text at middle of Arc's center point and Circle's center point
                float textX = (centerX + arcCenterX) / 2;
                float textY = (centerY + arcCenterY) / 2;

                canvas.drawText(STRINGS.get(i), textX, textY, paint);
                temp += sweepAngle;
            }
        }
    }
}