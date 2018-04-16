package com.moxiaofan.java.designpattern.adapter;

/**
 * Created by wangxy on 2018/4/16.
 */


public class ClassAdapter extends Usber implements Ps2 {
    @Override
    public void isPs2() {
        isUsb();
    }
}
