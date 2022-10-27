package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity7 extends AppCompatActivity {

    TextView txtResult; //당첨 결과 표시

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);


        //Button에 Listener 설정
        for(int i=0; i<12; i++){
            findViewById(R.id.button+i).setOnClickListener(onButtonClick);
        }

        //결과를 표시할 TextView 위젯 읽기
        txtResult = (TextView) findViewById(R.id.textView2);
    }

    //버튼 처리
    Button.OnClickListener onButtonClick = new Button.OnClickListener(){
        @Override
        public void onClick(View v){
            //Tag 내용 가져오기
            String tag = findViewById(v.getId()).getTag().toString();
            checkValue(tag);
        }
    };

    private void checkValue(String tag){
        //tag를 숫자로 변환
        int nTag = Integer.parseInt(tag);

        //1~4의 난수 만들기
        int r = new Random().nextInt(12) + 1; //Random().nextInt() => 0~3
        String msg = tag + "번 버튼 : ";

        //tag와 발생된 난수가 같은지 체크
        if(nTag == r){
            msg += "축하합니다! 당첨되셨습니다.";
        } else{
            msg += "안타깝습니다. 다음 기회에 도전하세요.";
        }

        txtResult.setText(msg);
    }
}