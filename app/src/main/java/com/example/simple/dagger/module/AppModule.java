package com.example.simple.dagger.module;

import com.example.simple.bean.Goods;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Singleton
    @Provides
    Goods providesGoods(){
        return new Goods();
    }

}
