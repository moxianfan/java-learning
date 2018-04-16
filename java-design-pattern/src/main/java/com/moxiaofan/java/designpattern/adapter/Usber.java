package com.moxiaofan.java.designpattern.adapter;

/**
 * Created by wangxy on 2018/4/16.
 */


public class Usber implements Usb {
    @Override
    public void isUsb() {
        System.out.println("I am USB");
    }
}
