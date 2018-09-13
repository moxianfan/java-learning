package com.moxiaofan.java.designpattern.factory;

/**
 * Created by wangxy on 2018/4/14.
 */

/**
 * 工厂方法
 */
public class FactoryMethod {
    public static void main(String[] args){
        SendFactory sendFactory = new SendFactory();
        Sender emsSender = sendFactory.produceEmsSender();
        emsSender.send();
    }
}
