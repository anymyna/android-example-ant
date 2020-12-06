package com.example.ant;

import android.app.Application;
import android.util.Log;

import com.tencent.mmkv.MMKV;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        String rootDir = MMKV.initialize(this);
        Log.d("MMKVActivity","mmkv root: " + rootDir);
    }
}
