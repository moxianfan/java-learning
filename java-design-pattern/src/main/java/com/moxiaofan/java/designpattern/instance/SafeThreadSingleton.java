package com.moxiaofan.java.designpattern.instance;

/**
 * Created by wangxy on 2018/4/8.
 */

/**
 * 线程安全
 */
public class SafeThreadSingleton {
    private static SafeThreadSingleton INSTANCE = null;

    private SafeThreadSingleton() {
    }

    public static synchronized SafeThreadSingleton getSafeThreadSingleton() {
        if (INSTANCE == null) {
            INSTANCE = new SafeThreadSingleton();
        }
        return INSTANCE;
    }
}
