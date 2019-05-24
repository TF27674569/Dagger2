package com.example.simple;

import android.app.Application;

import com.example.simple.dagger.componet.AppComponent;
import com.example.simple.dagger.componet.DaggerAppComponent;

public class App extends Application {


    private static AppComponent sAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        sAppComponent = DaggerAppComponent.builder()
                .build();
    }

    public static AppComponent getAppComponent(){
        return sAppComponent;
    }
}
