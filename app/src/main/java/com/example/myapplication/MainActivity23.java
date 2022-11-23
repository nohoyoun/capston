package com.example.myapplication;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.widget.TextView;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity23 extends AppCompatActivity {

    TextView pathView01, pathView02, pathView03;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main23);

        pathView01 = findViewById(R.id.pathview01);
        pathView02 = findViewById(R.id.pathview02);
        pathView03 = findViewById(R.id.pathview03);

        File storeDir = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "MyDocApp");
        if (!storeDir.exists()) {
            if (!storeDir.mkdirs()) {
                Log.d("MyDocApp", "failed to create directory");
                return;
            }
        }
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        File temp = new File(storeDir.getPath() + File.separator + "test_" + timeStamp + ".docx");
        if(temp == null){
            Log.d(TAG, "Error at creating .docx file, check storage permissions :");
            return;
        }


        pathView01.setText(temp.getAbsolutePath());
        pathView02.setText(temp.getPath());
        try {
            pathView03.setText(temp.getCanonicalPath());
        } catch (IOException e) {
            Log.d(TAG, "Error at creating .docx file, check storage permissions :");
            return;
        }
    }

}
