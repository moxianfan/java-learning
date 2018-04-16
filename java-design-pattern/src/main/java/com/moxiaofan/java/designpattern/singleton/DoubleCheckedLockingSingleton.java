package com.moxiaofan.java.designpattern.singleton;

/**
 * Created by wangxy on 2018/4/8.
 */

/**
 * 双重检查锁定
 * <p>
 * 由于指令重排优化的存在，导致初始化Singleton和将对象地址赋给instance字段的顺序是不确定的。
 * 在某个线程创建单例对象时，在构造方法被调用之前，就为该对象分配了内存空间并将对象的字段设置为默认值。
 * 此时就可以将分配的内存地址赋值给instance字段了，然而该对象可能还没有初始化。
 * 若紧接着另外一个线程来调用getInstance，取到的就是状态不正确的对象，程序就会出错。
 * </p>
 */
public class DoubleCheckedLockingSingleton {
    //1
    private static DoubleCheckedLockingSingleton INSTANCE = null;

    //2
    //private static volatile DoubleCheckedLockingSingleton INSTANCE = null;

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
