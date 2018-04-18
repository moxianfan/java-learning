package com.moxiaofan.java.designpattern.decorator;

/**
 * Created by wangxy on 2018/4/18.
 */


public class ConcreteDecorate2 extends Decorate {

    public ConcreteDecorate2(Component component){
        super(component);
    }

    private void method(){
        System.out.println("  method 2");
    }

    @Override
    public void operation() {
        this.method();
        super.operation();
    }
}
