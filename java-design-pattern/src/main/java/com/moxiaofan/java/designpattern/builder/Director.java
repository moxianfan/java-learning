package com.moxiaofan.java.designpattern.builder;

/**
 * Created by wangxy on 2018/4/10.
 */


public class Director {
    private ComputerBuilder computerBuilder;

    public Director(ComputerBuilder computerBuilder){
        this.computerBuilder = computerBuilder;
    }

    public Computer comstructComputer(){
        computerBuilder.buildMaster();
        computerBuilder.buildScreen();
        computerBuilder.buildKeyboard();
        computerBuilder.buildAudio();
        computerBuilder.buildMouse();
        return computerBuilder.buildComputer();
    }
}
