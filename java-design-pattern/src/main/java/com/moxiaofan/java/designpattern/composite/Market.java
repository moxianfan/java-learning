package com.moxiaofan.java.designpattern.composite;

/**
 * Created by wangxy on 2018/4/19.
 */


public abstract class Market {
    public String name;

    public abstract void add(Market market);

    public abstract void remove(Market market);

    public abstract void pay();
}
