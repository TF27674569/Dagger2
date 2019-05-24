package com.example.simple.bean;

import javax.inject.Inject;

public class Preson {
    private String name;
    private int age;


    @Inject
    public Preson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Preson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
