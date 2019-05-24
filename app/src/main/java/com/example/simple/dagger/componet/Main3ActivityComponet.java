package com.example.simple.dagger.componet;

import com.example.simple.Main3Activity;
import com.example.simple.dagger.module.ObjectModule;

import dagger.Component;

@Component(modules = ObjectModule.class)
public interface Main3ActivityComponet {

    void inject(Main3Activity activity);
}
