package com.example.simple.dagger.module;

import com.example.simple.bean.Goods;
import com.example.simple.bean.Preson;


import dagger.Module;
import dagger.Provides;

@Module
public class ObjectModule {

    @Provides
    public Goods provideGoods(){
        return new Goods();
    }

    @Provides
    public Preson providePreson(Goods goods){
        return new Preson("张三",18);
    }
}
