package com.moxiaofan.java.designpattern.decorator;

/**
 * Created by wangxy on 2018/4/18.
 */


public class ConcreteDecorate1 extends Decorate {

    public ConcreteDecorate1(Component component){
        super(component);
    }

    private void method(){
        System.out.println(" method 1 ");
    }

    @Override
    public void operation() {
        this.method();
        super.operation();
    }
}
