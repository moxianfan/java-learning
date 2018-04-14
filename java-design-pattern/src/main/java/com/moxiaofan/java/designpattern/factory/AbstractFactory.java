package com.moxiaofan.java.designpattern.factory;

/**
 * Created by wangxy on 2018/4/14.
 */


public class AbstractFactory {
    public static void main(String[] args){
        SendMailFactory mailFactory = new SendMailFactory();
        Sender mailSender = mailFactory.produceSender();
        mailSender.send();
    }
}
