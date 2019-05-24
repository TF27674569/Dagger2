package com.example.simple;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.simple.bean.Order;
import com.example.simple.bean.Preson;
import com.example.simple.dagger.componet.DaggerMain3ActivityComponet;

import javax.inject.Inject;

public class Main3Activity extends Activity {

    @Inject
    Preson preson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerMain3ActivityComponet.builder()
                .build()
                .inject(this);

        Log.e("Main3Activity", "order: "+preson );

    }
}
