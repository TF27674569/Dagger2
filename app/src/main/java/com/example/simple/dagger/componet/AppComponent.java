package com.example.simple.dagger.componet;

import com.example.simple.App;
import com.example.simple.bean.Goods;
import com.example.simple.dagger.module.AppModule;


import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    void inject(App application);

    //告诉依赖的Component,我给你提供了这个类。
    Goods getGoods();
}
