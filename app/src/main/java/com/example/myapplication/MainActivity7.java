package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity7 extends AppCompatActivity {

    ImageView gift1, gift2, gift3, gift4, gift5, gift6, gift7, gift8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        gift1 = findViewById(R.id.gift1);
        gift2 = findViewById(R.id.gift2);
        gift3 = findViewById(R.id.gift3);
        gift4 = findViewById(R.id.gift4);
        gift5 = findViewById(R.id.gift5);
        gift6 = findViewById(R.id.gift6);
        gift7 = findViewById(R.id.gift7);
        gift8 = findViewById(R.id.gift8);


    }

    public void displayToast(String message) {
        Toast.makeText(getApplication(),message,Toast.LENGTH_SHORT).show();
    }
    
    public void showgift1(View view) {

    }
    
}