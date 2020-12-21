package com.example.ant;


import android.os.Bundle;
import android.util.Log;
import android.view.View;


import androidx.appcompat.app.AppCompatActivity;

import com.example.ant.room.User;
import com.example.ant.room.UserDao;

import java.util.List;


public class RoomDemoActivity extends AppCompatActivity {
    String TAG = "RoomDemoActivity";

    private UserDao userDao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_room);

        Log.d(TAG,"onCreate");
        userDao = MyApplication.getInstance().getDB().userDao();


        // 插入
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                User user = new User();
                user.firstName = "ant";
                user.lastName = "ant";
                user.uid = 1;
                userDao.insertAll(user);
                Log.d(TAG,"insertAll user uid: " + user.uid);
            }
        });


        // 查询单个
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                User user = userDao.findByName("ant","ant");
//                Log.d(TAG,"search  uid: " + user.uid);
                User user = userDao.getUser(1);
                Log.d(TAG,"search  firstName: " + user.firstName);
            }
        });

        // 删除
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                User user = userDao.findByName("ant","ant");
                userDao.delete(user);
                Log.d(TAG,"delete user uid: " + user.uid);
            }
        });

        // 查询所有
        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<User> list = userDao.getAll();
                Log.d(TAG,"list size: " + list.size());
            }
        });

        // 更新
        findViewById(R.id.button5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                User user = new User();
                user.firstName = "bee";
                user.lastName = "bee";
                user.uid = 1;
                userDao.update(user);
                Log.d(TAG,"update uid: " + user.uid);


            }
        });

    }
}
