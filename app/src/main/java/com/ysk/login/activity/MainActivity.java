package com.ysk.login.activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.ysk.login.R;
import com.ysk.login.adapter.UserAdapter;
import com.ysk.login.bean.User;
import com.ysk.login.util.SqliteHelper;

import java.util.ArrayList;
import java.util.List;
//登陆后就到这个界面
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
