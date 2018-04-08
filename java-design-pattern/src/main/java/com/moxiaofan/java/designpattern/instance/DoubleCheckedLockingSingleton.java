package com.moxiaofan.java.designpattern.instance;

/**
 * Created by wangxy on 2018/4/8.
 */

/**
 * 双重检查锁定
 */
public class DoubleCheckedLockingSingleton {
    private static DoubleCheckedLockingSingleton INSTANCE = null;

    private DoubleCheckedLockingSingleton() {
    }

    public static synchronized DoubleCheckedLockingSingleton getDoubleCheckedLockingSingleton() {
        if (INSTANCE == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return INSTANCE;
    }
}
