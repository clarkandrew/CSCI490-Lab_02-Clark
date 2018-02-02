package com.example.andrewclark.intentdemo_lab2_clark;

import android.app.Activity;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;





public class MainActivity extends AppCompatActivity {
    private Button button;
    public static final int bg = 1;
    public int curBackground;

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);

    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
       
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button = findViewById(R.id.intentButton);
        button.setText(R.string.setWall);

        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                startActivityForResult(intent, bg);
            }
        });

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if(requestCode == bg && resultCode == Activity.RESULT_OK) {
            Bundle extras = data.getExtras();
            if(extras != null) {
                int imgsrc = extras.getInt("imgsrc");

                ConstraintLayout act1 = findViewById(R.id.mainLayout);
                act1.setBackground(getDrawable(imgsrc));


            }
        }

    }








}
