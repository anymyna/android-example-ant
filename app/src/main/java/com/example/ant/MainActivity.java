package com.example.ant;


import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {
    String TAG = "MainActivity";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Log.d(TAG,"onCreate");



        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ComponentName cn = new ComponentName(MainActivity.this,MMKVActivity.class) ;
                Intent intent = new Intent() ;
                intent.setComponent(cn) ;
                startActivity(intent) ;
            }
        });



        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ComponentName cn = new ComponentName(MainActivity.this,RoomDemoActivity.class) ;
                Intent intent = new Intent() ;
                intent.setComponent(cn) ;
                startActivity(intent) ;
            }
        });

        //
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ComponentName cn = new ComponentName(MainActivity.this,RetrofitActivity.class) ;
                Intent intent = new Intent() ;
                intent.setComponent(cn) ;
                startActivity(intent) ;
            }
        });

        //
        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        //
        findViewById(R.id.button5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



            }
        });

    }
}
