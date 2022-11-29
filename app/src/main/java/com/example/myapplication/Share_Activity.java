package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Share_Activity extends AppCompatActivity {

    Button btn1;
    TextView txt1, txt2;

    public File ScreenShot(View view){
        view.setDrawingCacheEnabled(true);  //화면에 뿌릴때 캐시를 사용하게 한다

        Bitmap screenBitmap = view.getDrawingCache();   //캐시를 비트맵으로 변환

        String filename = "screenshot" + System.currentTimeMillis() +".png";
        File file = new File(Environment.getExternalStorageDirectory()+"/Pictures", filename);  //Pictures폴더 screenshot.png 파일
        FileOutputStream os = null;
        try{
            os = new FileOutputStream(file);
            screenBitmap.compress(Bitmap.CompressFormat.JPEG, 90, os);   //비트맵을 PNG파일로 변환
            os.close();
        }catch (IOException e){
            e.printStackTrace();
            return null;
        }

        view.setDrawingCacheEnabled(false);
        return file;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        btn1 = findViewById(R.id.sharebtn);
        txt1 = (TextView)findViewById(R.id.name1);
        txt2 = (TextView)findViewById(R.id.restaurant);

        Intent intent = getIntent();
        String push = intent.getStringExtra("push");
        txt1.setText(push);

        SharedPreferences sharedPreferences = getSharedPreferences("pref3", MODE_PRIVATE);
        String restname = sharedPreferences.getString("restname", "이 자리");
        txt2.setText(restname);

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                View rootView = getWindow().getDecorView();

                File screenShot = ScreenShot(rootView);
                if(screenShot!=null){
                    //갤러리에 추가
                    sendBroadcast(new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE, Uri.fromFile(screenShot)));
                }

                //Uri uri = Uri.fromFile(screenShot);
                Uri uri = FileProvider.getUriForFile(getBaseContext(), "com.example.myapplication.fileprovider", screenShot);

                Intent shareintent = new Intent(Intent.ACTION_SEND);
                shareintent.putExtra(Intent.EXTRA_STREAM, uri);
                shareintent.setType("image/JPEG");
                startActivity(Intent.createChooser(shareintent, "공유"));

            }
        });


    }}