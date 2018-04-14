package com.moxiaofan.java.designpattern.factory;

/**
 * Created by wangxy on 2018/4/14.
 */


public class EmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("send ems");
    }
}
