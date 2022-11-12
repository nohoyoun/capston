package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.bluehomestudio.luckywheel.LuckyWheel;
import com.bluehomestudio.luckywheel.OnLuckyWheelReachTheTarget;
import com.bluehomestudio.luckywheel.WheelItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity15 extends AppCompatActivity {

    //선언
    private LuckyWheel luckyWheel;

    List<WheelItem> wheelItems ;

    String point;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);

        //변수에 담기
        luckyWheel = findViewById(R.id.luck_wheel);

        //점수판 데이터 생성
        generateWheelItems();

        //점수판 타겟 정해지면 이벤트 발생
        luckyWheel.setLuckyWheelReachTheTarget(new OnLuckyWheelReachTheTarget() {
            @Override
            public void onReachTarget() {

                //아이템 변수에 담기
                WheelItem wheelItem = wheelItems.get(Integer.parseInt(point)-1);

                //아이템 텍스트 변수에 담기
                String money = wheelItem.text;

                //메시지
                Toast.makeText(MainActivity15.this, money, Toast.LENGTH_SHORT).show();
                //메세지 텍스트를 바탕으로 지도에서 음식점 찾기기능 추가
                //intent 이용해서 넘겨주기
            }
        });

        //시작버튼
        Button start = findViewById(R.id.spin_botton);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random random = new Random();
                point = String.valueOf(random.nextInt(6)+1); // 1 ~ 6
                luckyWheel.rotateWheelTo(Integer.parseInt(point));
            }
        });
    }

    private void generateWheelItems() {

        wheelItems = new ArrayList<>();

        Drawable d = getResources().getDrawable(R.drawable.cathand2, null);

        Bitmap bitmap = drawableToBitmap(d);
        wheelItems.add(new WheelItem(Color.parseColor("#F44336"), bitmap, "중식"));
        wheelItems.add(new WheelItem(Color.parseColor("#E91E63"), bitmap, "피자"));
        wheelItems.add(new WheelItem(Color.parseColor("#9C27B0"), bitmap, "패스트푸드"));
        wheelItems.add(new WheelItem(Color.parseColor("#3F51B5"), bitmap, "양식"));
        wheelItems.add(new WheelItem(Color.parseColor("#1E88E5"), bitmap, "힌식"));
        wheelItems.add(new WheelItem(Color.parseColor("#009688"), bitmap, "족발"));
        wheelItems.add(new WheelItem(Color.parseColor("#1E4432"), bitmap, "고기"));
        wheelItems.add(new WheelItem(Color.parseColor("#A52356"), bitmap, "분식"));

        //점수판에 데이터 넣기
        luckyWheel.addWheelItems(wheelItems);
    }


    /**
     * drawable -> bitmap
     * @param drawable drawable
     * @return
     */
    public static Bitmap drawableToBitmap (Drawable drawable) {

        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable)drawable).getBitmap();
        }

        Bitmap bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);

        return bitmap;
    }
}