package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.Random;

public class MainActivity5 extends AppCompatActivity {

    private RadioGroup choiceDice;
    RadioButton dice_one;
    Button throwDice;
    int whichRadioButton = 1;

    ImageView dice_image;
    ImageView dice_image2;
    Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        throwDice = findViewById(R.id.throwbtn);
        choiceDice = findViewById(R.id.dicesel);
        dice_one = findViewById(R.id.onedice);
        dice_image = findViewById(R.id.dice1);
        dice_image2 = findViewById(R.id.dice2);
        choiceDice.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.onedice) whichRadioButton = 1;
                else if (checkedId == R.id.twodice) whichRadioButton = 2;
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
                    dice_image2.setVisibility(View.INVISIBLE);
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
                }
                    if (whichRadioButton == 2) {
                        dice_image2.setVisibility(View.VISIBLE);
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
                    }
                }//end



        });

    }
}