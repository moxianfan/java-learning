package com.moxiaofan.java.designpattern.decorator;

/**
 * Created by wangxy on 2018/4/18.
 */


public class ConcreteComponent extends Component {
    @Override
    public void operation() {
        System.out.println("do Something");
    }
}
