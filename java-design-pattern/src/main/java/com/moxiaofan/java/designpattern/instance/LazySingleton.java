package com.moxiaofan.java.designpattern.instance;

/**
 * Created by wangxy on 2018/4/8.
 */

/**
 * 懒汉模式
 */
public class LazySingleton {
    private static LazySingleton INSTANCE = null;

    private LazySingleton() {
    }

    public static LazySingleton getLazySingleton() {
        if (INSTANCE == null) {
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }
}
