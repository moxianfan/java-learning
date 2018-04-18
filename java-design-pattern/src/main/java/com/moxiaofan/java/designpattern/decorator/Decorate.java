package com.moxiaofan.java.designpattern.decorator;

/**
 * Created by wangxy on 2018/4/18.
 */


public abstract class Decorate extends ConcreteComponent {

    private Component component;

    public Decorate(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
