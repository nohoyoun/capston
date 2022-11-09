package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
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
    int whichRadioButton = 1;
    int a;
    String b;

    ImageView dice_image;
    ImageView dice_image2;
    Random random = new Random();

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();

        inflater.inflate(R.menu.selmenu, menu);

        return true;
    }
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
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        Intent intent = new Intent(MainActivity5.this, MainActivity13.class);
        startActivity(intent);

        throwDice = findViewById(R.id.throwbtn);
        choiceDice = findViewById(R.id.dicesel);
        dice_one = findViewById(R.id.onedice);
        dice_image = findViewById(R.id.dice1);
        dice_image2 = findViewById(R.id.dice2);
        pushnum = findViewById(R.id.pushnum);

        a = 1;

        pushnum.setText(String.valueOf(a));
        dice_image2.setVisibility(View.INVISIBLE);

        Intent intent1 = getIntent();
        String num = intent1.getStringExtra("num");
        b = num;

        Intent intent2 = getIntent();
        String pushname1 = intent2.getStringExtra("pushname1");



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
                }//end

        });

    }
}