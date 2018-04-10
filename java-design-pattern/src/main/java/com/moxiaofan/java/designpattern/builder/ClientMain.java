package com.moxiaofan.java.designpattern.builder;

/**
 * Created by wangxy on 2018/4/10.
 */


public class ClientMain {
    public static void main(String[] args){
        ComputerBuilder computerBuilder = new HPComputerBuilder();
        Director director = new Director(computerBuilder);
        director.comstructComputer();
    }
}
