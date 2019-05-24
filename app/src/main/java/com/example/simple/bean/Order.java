package com.example.simple.bean;


import javax.inject.Inject;

public class Order {

    public Goods goods;

    @Inject
    public Order(Goods goods){
        this.goods = goods;
    }
}
