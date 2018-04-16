package com.moxiaofan.java.designpattern.adapter;

/**
 * Created by wangxy on 2018/4/16.
 */


public class ObjectAdapterMain {
    public static void main(String[] args) {
        Usb usb = new Usber();
        ObjectAdapter objectAdapter = new ObjectAdapter(usb);
        objectAdapter.isPs2();
    }
}
