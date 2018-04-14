package com.moxiaofan.java.designpattern.factory;

/**
 * Created by wangxy on 2018/4/14.
 */


public class SendFactory {
    public Sender produceMailSender(){
        return new MailSender();
    }

    public Sender produceEmsSender(){
        return new EmsSender();
    }
}
