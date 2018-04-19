package com.moxiaofan.java.designpattern.composite;

/**
 * Created by wangxy on 2018/4/19.
 */


public class JoinMarket extends Market {

    public JoinMarket(String name){
        this.name = name;
    }

    @Override
    public void add(Market market) {

    }

    @Override
    public void remove(Market market) {

    }

    @Override
    public void pay() {
        System.out.println(name +" pay ");
    }
}
