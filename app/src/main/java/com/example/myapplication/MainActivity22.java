package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;



public class MainActivity22 extends AppCompatActivity {

    private Animation flowAnim;
    private Button mSlotMechine;
    private TextView mSlotText;
    Random random = new Random();
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);
        mSlotText = (TextView) findViewById(R.id.slottext);

        i = random.nextInt(9) + 1;

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
                                mSlotText.setText("치킨");
                                break;
                            }
                            case 2: {
                                mSlotText.setText("피자");
                                break;
                            }
                            case 3: {
                                mSlotText.setText("햄버거");
                                break;
                            }
                            case 4: {
                                mSlotText.setText("중식");
                                break;
                            }
                            case 5: {
                                mSlotText.setText("양식");
                                break;
                            }
                            case 6: {
                                mSlotText.setText("한식");
                                break;
                            }
                            case 7: {
                                mSlotText.setText("일식");
                                break;
                            }
                            case 8: {
                                mSlotText.setText("고기");
                                break;
                            }
                            case 9: {
                                mSlotText.setText("고기");
                                break;
                            }
                            //이동하는 함수 작성
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
