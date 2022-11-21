package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity5 extends AppCompatActivity {

    private RadioGroup choiceDice;
    RadioButton dice_one;
    Button throwDice;
    TextView pushnum;
    TextView nametag;
    int whichRadioButton = 1;
    int a;
    int count;
    int n1, n2, n3, n4, n5, n6;

    SharedPreferences pref;          // 프리퍼런스
    SharedPreferences.Editor editor; // 에디터


    ImageView dice_image;
    ImageView dice_image2;
    Random random = new Random();


    /*@Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();

        inflater.inflate(R.menu.selmenu, menu);

        return true;
    }*/
    @Override
    public boolean onOptionsItemSelected (MenuItem item)
    {

        switch(item.getItemId())
        {
            case R.id.personscore: {
                Intent intent = new Intent(MainActivity5.this, MainActivity14.class);
                startActivity(intent);
            }

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        final Animation shake = AnimationUtils.loadAnimation(
                this,R.anim.shake);

        pref = getSharedPreferences("pref2", Activity.MODE_PRIVATE);
        editor = pref.edit();
        editor.clear().apply();

        Intent intent = new Intent(MainActivity5.this, MainActivity13.class);
        startActivity(intent);


        //액티비티 시작할시 전에 실행했던 작업 초기화 필요

        throwDice = findViewById(R.id.throwbtn);
        choiceDice = findViewById(R.id.dicesel);
        dice_one = findViewById(R.id.onedice);
        dice_image = findViewById(R.id.dice1);
        dice_image2 = findViewById(R.id.dice2);
        pushnum = findViewById(R.id.pushnum);
        nametag = findViewById(R.id.nametag);

        a = 1;
        count = 1;
        n1 = 0;
        n2 = 0;
        n3 = 0;
        n4 = 0;
        n5 = 0;
        n6 = 0;


        pushnum.setText(String.valueOf(a));
        dice_image2.setVisibility(View.INVISIBLE);

        choiceDice.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.onedice) {
                    whichRadioButton = 1;
                    dice_image2.setVisibility(View.INVISIBLE);
                }
                else if (checkedId == R.id.twodice) {
                    whichRadioButton = 2;
                    dice_image2.setVisibility(View.VISIBLE);
                }
            }
        });
        throwDice.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {


                int numberofDice = 1;
                int numberofDice2 = 1;

                if (whichRadioButton==1)
                    numberofDice = random.nextInt(6) + 1;
                else {
                    numberofDice = random.nextInt(6) + 1;
                    numberofDice2 = random.nextInt(6) + 1;
                }

                if(whichRadioButton == 1) {
                    dice_image.startAnimation(shake);

                    switch (numberofDice) {
                        case 1:
                            dice_image.setImageResource(R.drawable.dice_1);
                            break;
                        case 2:
                            dice_image.setImageResource(R.drawable.dice_2);
                            break;
                        case 3:
                            dice_image.setImageResource(R.drawable.dice_3);
                            break;
                        case 4:
                            dice_image.setImageResource(R.drawable.dice_4);
                            break;
                        case 5:
                            dice_image.setImageResource(R.drawable.dice_5);
                            break;
                        case 6:
                            dice_image.setImageResource(R.drawable.dice_6);
                            break;
                    }
                        a = numberofDice;

                }
                    if (whichRadioButton == 2) {
                        dice_image.startAnimation(shake);
                        dice_image2.startAnimation(shake);

                        switch (numberofDice) {
                            case 1:
                                dice_image.setImageResource(R.drawable.dice_1);
                                break;
                            case 2:
                                dice_image.setImageResource(R.drawable.dice_2);
                                break;
                            case 3:
                                dice_image.setImageResource(R.drawable.dice_3);
                                break;
                            case 4:
                                dice_image.setImageResource(R.drawable.dice_4);
                                break;
                            case 5:
                                dice_image.setImageResource(R.drawable.dice_5);
                                break;
                            case 6:
                                dice_image.setImageResource(R.drawable.dice_6);
                                break;
                        }
                        switch (numberofDice2) {
                            case 1:
                                dice_image2.setImageResource(R.drawable.dice_1);
                                break;
                            case 2:
                                dice_image2.setImageResource(R.drawable.dice_2);
                                break;
                            case 3:
                                dice_image2.setImageResource(R.drawable.dice_3);
                                break;
                            case 4:
                                dice_image2.setImageResource(R.drawable.dice_4);
                                break;
                            case 5:
                                dice_image2.setImageResource(R.drawable.dice_5);
                                break;
                            case 6:
                                dice_image2.setImageResource(R.drawable.dice_6);
                                break;
                        }

                        a = numberofDice+numberofDice2;
                    }

                pushnum.setText(String.valueOf(a));
                editor.putInt("dicenum" + count, a);
                count++;
                editor.apply();


                SharedPreferences sharedPreferences = getSharedPreferences("pref1", MODE_PRIVATE);
                String name1 = sharedPreferences.getString("name1", "");
                String name2 = sharedPreferences.getString("name2", "");
                String name3 = sharedPreferences.getString("name3", "");
                String name4 = sharedPreferences.getString("name4", "");
                String name5 = sharedPreferences.getString("name5", "");
                String name6 = sharedPreferences.getString("name6", "");

                if(count == 2) {
                    nametag.setText(count-1 + "번째"+ name1 +"의 숫자는" + a + "입니다.");

                } else if (count == 3) {
                    nametag.setText(count-1 + "번째"+ name2 +"의 숫자는" + a + "입니다.");
                    if(name3.length() == 0) {
                        Intent intent = new Intent(MainActivity5.this, MainActivity14.class);
                        startActivity(intent);
                    }
                }else if (count == 4) {
                    nametag.setText(count-1 + "번째"+ name3 +"의 숫자는" + a + "입니다.");
                    if(name4.length() == 0) {
                        Intent intent = new Intent(MainActivity5.this, MainActivity14.class);
                        startActivity(intent);
                    }
                }else if (count == 5) {
                    //name1에 대한 숫자가 있을경우의 조건 작성
                    nametag.setText(count-1 + "번째"+ name4 +"의 숫자는" + a + "입니다.");
                    if(name5.length() == 0) {
                        Intent intent = new Intent(MainActivity5.this, MainActivity14.class);
                        startActivity(intent);
                    }
                }else if (count == 6) {
                    //name1에 대한 숫자가 있을경우의 조건 작성
                    nametag.setText(count-1 + "번째"+ name5 +"의 숫자는" + a + "입니다.");
                    if(name6.length() == 0) {
                        Intent intent = new Intent(MainActivity5.this, MainActivity14.class);
                        startActivity(intent);
                    }
                }else if (count == 7) {
                    //name1에 대한 숫자가 있을경우의 조건 작성
                    nametag.setText(count-1 + "번째"+ name6 +"의 숫자는" + a + "입니다.");

                        Intent intent = new Intent(MainActivity5.this, MainActivity14.class);
                        startActivity(intent);

                }
            }//end

        });

    }
}