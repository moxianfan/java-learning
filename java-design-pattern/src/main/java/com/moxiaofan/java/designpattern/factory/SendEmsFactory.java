package com.moxiaofan.java.designpattern.factory;

/**
 * Created by wangxy on 2018/4/14.
 */


public class SendEmsFactory implements Factory {
    @Override
    public Sender produceSender() {
        return new EmsSender();
    }
}
