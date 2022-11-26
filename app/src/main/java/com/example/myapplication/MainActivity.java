package com.example.myapplication;

import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.content.Intent;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button button;
    boolean play;
    int playSoundId;
 //   MediaPlayer mediaPlayer;   //배경음악

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*mediaPlayer = MediaPlayer.create(this, R.raw.sellbuymusic_under);
        mediaPlayer.start();*/    // bgm 넣어보려다 잘안되서 우선 나중에 시도할 예정.

        MySoundPlayer.initSounds(getApplicationContext());
       // MySoundPlayer.play(MySoundPlayer.Sell_Buy_Music_Under);
     /*   findViewById(R.id.startbtn).setOnClickListener((v)->{
            // MySoundPlayer.play(MySoundPlayer.DING_DONG);
        });*/


        Button button1=findViewById(R.id.startbtn);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MySoundPlayer.play(MySoundPlayer.Blop_Sound);
                Intent intent=new Intent(MainActivity.this, Select_Menu_Activity.class);
                startActivity(intent);
            }
        });

        
        Button button2=findViewById(R.id.help);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MySoundPlayer.play(MySoundPlayer.Blop_Sound);
                Intent intent1=new Intent(MainActivity.this, Help_Activity.class);
                startActivity(intent1);
            }
        });



        Button button3=findViewById(R.id.endbtn);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MySoundPlayer.play(MySoundPlayer.Blop_Sound);
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("종료하시겠습니까?");
                builder.setTitle("종료")
                        .setCancelable(false)
                        .setNegativeButton("예", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int i) {
                                finish();
                            }
                        })
                        .setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int i) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.setTitle("종료 알림창");
                alert.show();
            }
        });

    }
}