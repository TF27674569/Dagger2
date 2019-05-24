package com.example.simple.dagger.componet;


import com.example.simple.MainActivity;
import com.example.simple.dagger.scope.ActivityScope;
import dagger.Component;

@ActivityScope
@Component(dependencies = AppComponent.class)
public interface MainActivityComponet {

    void inject(MainActivity activity);
}
