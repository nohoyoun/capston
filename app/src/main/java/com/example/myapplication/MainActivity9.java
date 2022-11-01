package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class MainActivity9 extends AppCompatActivity {

    Button btn1;
    TextView txt1;
    View container;


    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main9);

            btn1 = findViewById(R.id.sharebtn);
            txt1 = (TextView)findViewById(R.id.name1);

            Intent intent = getIntent();
            String push = intent.getStringExtra("push");
            txt1.setText(push);
            container = getWindow().getDecorView();


            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    container.buildDrawingCache();
                    Bitmap captureView = container.getDrawingCache();

                    String adress = Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/data/com.memkey/Memkey" + "capture.jpeg";
                    FileOutputStream fos;
                    try {
                        fos = new FileOutputStream(adress);
                        captureView.compress(Bitmap.CompressFormat.JPEG, 100, fos);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }

                    Uri uri = Uri.fromFile(new File(adress));

                    Intent Sharing_intent = new Intent(Intent.ACTION_SEND);

                    Sharing_intent.putExtra(Intent.EXTRA_TEXT, uri);
                    Sharing_intent.setType("image/*");

                    Intent Sharing = Intent.createChooser(Sharing_intent, "공유하기");
                    startActivity(Sharing);
                }
            });



    }
}