package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity20 extends AppCompatActivity {

    private Animation flowAnim;
    private ImageView mSlotMechine;
    private TextView mSlotText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    void init(){
        //mSlotMechine = (ImageView) findViewById(R.id.activity_main_slot);
        mSlotText = (TextView)findViewById(R.id.ddd);

        flowAnim = AnimationUtils.loadAnimation(this, R.anim.slot);

        mSlotMechine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSlotText.startAnimation(flowAnim);
            }
        });
    }
}