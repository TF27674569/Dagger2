package com.example.simple.dagger.componet;


import com.example.simple.Main2Activity;
import com.example.simple.dagger.scope.ActivityScope;


import dagger.Component;

@ActivityScope
@Component(dependencies = AppComponent.class)
public interface Main2ActivityComponet {

    void inject(Main2Activity activity);
}
