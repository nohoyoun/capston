package com.example.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;



public class Random_Food_Choice_Slot_Activity extends AppCompatActivity {

    private Animation flowAnim;
    private Button mSlotMechine;
    private TextView mSlotText;
    Random random = new Random();
    int i;
    MySoundPlayer mySoundPlayer;

    @Override
    public boolean onKeyDown(int keycode, KeyEvent event){  //뒤로가기 버튼클릭시!
        if(keycode == KeyEvent.KEYCODE_BACK){
            Intent intent = new Intent(Random_Food_Choice_Slot_Activity.this, Select_Menu_Activity.class);
            startActivity(intent);
            finish();
            return true;
        }

        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_choice_slot);

        MySoundPlayer.initSounds(getApplicationContext());

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);


        mSlotText = (TextView) findViewById(R.id.slottext);

        i = random.nextInt(9) + 1;

        flowAnim = AnimationUtils.loadAnimation(this, R.anim.slot);
        mSlotMechine = findViewById(R.id.fr);

        mSlotMechine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MySoundPlayer.play(MySoundPlayer.Slot_Sound);
                mSlotText.startAnimation(flowAnim);
                flowAnim.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                    }
                    @Override
                    public void onAnimationEnd(Animation animation) {
                        mSlotMechine.setVisibility(View.INVISIBLE);

                        switch (i) {
                            case 1: {
                                mSlotText.setText("치킨");
                                //mapsactivity에 음식이름 넘겨주는 기능
                                String temp = mSlotText.getText().toString();
                                Intent intent = new Intent(Random_Food_Choice_Slot_Activity.this, MapsActivity.class);
                                intent.putExtra("foodname", temp);
                                startActivity(intent);

                                break;
                            }
                            case 2: {
                                mSlotText.setText("피자");
                                //mapsactivity에 음식이름 넘겨주는 기능
                                String temp = mSlotText.getText().toString();
                                Intent intent = new Intent(Random_Food_Choice_Slot_Activity.this, MapsActivity.class);
                                intent.putExtra("foodname", temp);
                                startActivity(intent);

                                break;
                            }
                            case 3: {
                                mSlotText.setText("패스트푸드");
                                //mapsactivity에 음식이름 넘겨주는 기능
                                String temp = mSlotText.getText().toString();
                                Intent intent = new Intent(Random_Food_Choice_Slot_Activity.this, MapsActivity.class);
                                intent.putExtra("foodname", temp);
                                startActivity(intent);

                                break;
                            }
                            case 4: {
                                mSlotText.setText("중식");
                                //mapsactivity에 음식이름 넘겨주는 기능
                                String temp = mSlotText.getText().toString();
                                Intent intent = new Intent(Random_Food_Choice_Slot_Activity.this, MapsActivity.class);
                                intent.putExtra("foodname", temp);
                                startActivity(intent);
                                break;
                            }
                            case 5: {
                                mSlotText.setText("양식");
                                //mapsactivity에 음식이름 넘겨주는 기능
                                String temp = mSlotText.getText().toString();
                                Intent intent = new Intent(Random_Food_Choice_Slot_Activity.this, MapsActivity.class);
                                intent.putExtra("foodname", temp);
                                startActivity(intent);
                                break;
                            }
                            case 6: {
                                mSlotText.setText("한식");
                                //mapsactivity에 음식이름 넘겨주는 기능
                                String temp = mSlotText.getText().toString();
                                Intent intent = new Intent(Random_Food_Choice_Slot_Activity.this, MapsActivity.class);
                                intent.putExtra("foodname", temp);
                                startActivity(intent);
                                break;
                            }
                            case 7: {
                                mSlotText.setText("일식");
                                //mapsactivity에 음식이름 넘겨주는 기능
                                String temp = mSlotText.getText().toString();
                                Intent intent = new Intent(Random_Food_Choice_Slot_Activity.this, MapsActivity.class);
                                intent.putExtra("foodname", temp);
                                startActivity(intent);
                                break;
                            }
                            case 8: {
                                mSlotText.setText("고기");
                                //mapsactivity에 음식이름 넘겨주는 기능
                                String temp = mSlotText.getText().toString();
                                Intent intent = new Intent(Random_Food_Choice_Slot_Activity.this, MapsActivity.class);
                                intent.putExtra("foodname", temp);
                                startActivity(intent);
                                break;
                            }
                            case 9: {
                                mSlotText.setText("분식");
                                //mapsactivity에 음식이름 넘겨주는 기능
                                String temp = mSlotText.getText().toString();
                                Intent intent = new Intent(Random_Food_Choice_Slot_Activity.this, MapsActivity.class);
                                intent.putExtra("foodname", temp);
                                startActivity(intent);
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
