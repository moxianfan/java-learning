package com.moxiaofan.java.designpattern.decorator;

/**
 * Created by wangxy on 2018/4/18.
 */

/**
 * 适配器模式
 */
public class DecoratorMain {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component = new ConcreteDecorate1(component);
        component = new ConcreteDecorate2(component);
        component.operation();
    }
}
