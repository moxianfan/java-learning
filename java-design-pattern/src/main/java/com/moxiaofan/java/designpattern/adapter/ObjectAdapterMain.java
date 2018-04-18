package com.moxiaofan.java.designpattern.adapter;

/**
 * Created by wangxy on 2018/4/16.
 */


public class ObjectAdapterMain {
    public static void main(String[] args) {
        Usb usber = new Usber();
        ObjectAdapter objectAdapter = new ObjectAdapter(usber);
        objectAdapter.isPs2();
    }
}
