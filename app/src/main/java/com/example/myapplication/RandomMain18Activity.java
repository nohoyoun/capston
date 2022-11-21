package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;

import java.util.Random;

public class RandomMain18Activity extends AppCompatActivity {

    int num;
    Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_main18);

        num = random.nextInt(2)+1;
        num = 1;
        switch (num){
            case 1 :
                Intent intent = new Intent(RandomMain18Activity.this, MainActivity22.class);
                startActivity(intent);
                break;
            case 2 :
                Intent intent2 = new Intent(RandomMain18Activity.this, MainActivity15.class);
                startActivity(intent2);
                break;
        }


    }
}