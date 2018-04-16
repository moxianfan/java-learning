package com.moxiaofan.java.designpattern.singleton;

/**
 * Created by wangxy on 2018/4/8.
 */

/**
 * 饿汉模式
 */
public class EagerSingleton {
    private static EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getEagerSingleton() {
        return INSTANCE;
    }

}
