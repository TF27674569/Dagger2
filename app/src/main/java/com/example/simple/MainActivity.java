package com.example.simple;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.simple.bean.Goods;
import com.example.simple.bean.Order;
import com.example.simple.dagger.componet.DaggerMainActivityComponet;

import javax.inject.Inject;


public class MainActivity extends Activity {

    private final String TAG = "MainActivity";

    @Inject
    Goods goods1;

    @Inject
    Goods goods2;

    @Inject
    Goods goods3;

    @Inject
    Order order;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerMainActivityComponet.builder()
                .appComponent(App.getAppComponent())
                .build()
                .inject(this);



        Log.e(TAG, "goods1: "+goods1);
        Log.e(TAG, "goods2: "+goods2);
        Log.e(TAG, "goods3: "+goods3);
        Log.e(TAG, "order: "+order);
        Log.e(TAG, "order.goods: "+order.goods);

        startActivity(new Intent(this,Main2Activity.class));
    }
}
