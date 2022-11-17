package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Random;

public class RandomMain18Activity extends AppCompatActivity {

    int num;
    Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_main18);

        num = random.nextInt(6)+1;

        switch (num){
            case 1 :
                Intent intent = new Intent(RandomMain18Activity.this, MainActivity3.class);
                startActivity(intent);
                break;
            case 2 :
                Intent intent2 = new Intent(RandomMain18Activity.this, MainActivity18.class);
                startActivity(intent2);
                break;
            case 3 :
                Intent intent3 = new Intent(RandomMain18Activity.this, MainActivity5.class);
                startActivity(intent3);
                break;
            case 4 :
                Intent intent4 = new Intent(RandomMain18Activity.this, MainActivity8.class);
                startActivity(intent4);
                break;
            case 5 :
                Intent intent5 = new Intent(RandomMain18Activity.this, MainActivity12.class);
                startActivity(intent5);
                break;
            case 6 :
                Intent intent6 = new Intent(RandomMain18Activity.this, MainActivity17.class);
                startActivity(intent6);
                break;
        }


    }
}