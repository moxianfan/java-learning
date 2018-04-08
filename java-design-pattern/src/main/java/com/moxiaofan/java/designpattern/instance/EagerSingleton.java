package com.moxiaofan.java.designpattern.instance;

/**
 * Created by wangxy on 2018/4/8.
 */

/**
 * 恶汉模式
 */
public class EagerSingleton {
    private static EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getEagerSingleton() {
        return INSTANCE;
    }

}
