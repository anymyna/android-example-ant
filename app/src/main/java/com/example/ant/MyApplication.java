package com.example.ant;

import android.app.Application;
import android.util.Log;

import androidx.room.Room;

import com.example.ant.room.AppDatabase;
import com.tencent.mmkv.MMKV;

public class MyApplication extends Application {

    private static  MyApplication mInstance;
    AppDatabase db;
    @Override
    public void onCreate() {
        super.onCreate();

        mInstance = this;
        String rootDir = MMKV.initialize(this);
        Log.d("MyApplication","mmkv root: " + rootDir);

        db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "database-name")
                .allowMainThreadQueries()
                .build();
    }


    public static MyApplication getInstance(){
        return mInstance;
    }

    public AppDatabase getDB(){
        return db;
    }



}
