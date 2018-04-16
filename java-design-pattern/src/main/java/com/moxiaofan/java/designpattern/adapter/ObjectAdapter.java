package com.moxiaofan.java.designpattern.adapter;

/**
 * Created by wangxy on 2018/4/16.
 */

public class ObjectAdapter implements Ps2 {

    private Usb usb;

    public ObjectAdapter(Usb usb) {
        this.usb = usb;
    }

    @Override
    public void isPs2() {
        usb.isUsb();
    }
}
