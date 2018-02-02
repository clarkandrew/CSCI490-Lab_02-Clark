package com.example.andrewclark.intentdemo_lab2_clark;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.ImageView;


public class SecondActivity extends AppCompatActivity {

    private int imgsrc;
    private ImageView img1;
    private ImageView img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        img1 = findViewById(R.id.image1);
        img1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                imgsrc = R.drawable.supermoon;
                sendback();
            }

        });

        img2 = findViewById(R.id.image2);
        img2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                imgsrc = R.drawable.waterfall;
                sendback();
            }

        });


    }

    public void sendback() {
        Intent intent = new Intent();
        intent.putExtra("imgsrc", imgsrc);
        setResult(RESULT_OK, intent);

        super.finish();


    }






}
