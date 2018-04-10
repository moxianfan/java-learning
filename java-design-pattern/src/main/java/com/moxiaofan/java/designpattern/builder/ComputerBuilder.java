package com.moxiaofan.java.designpattern.builder;

/**
 * Created by wangxy on 2018/4/10.
 */


public interface ComputerBuilder {
    void buildMaster();

    void buildScreen();

    void buildKeyboard();

    void buildMouse();

    void buildAudio();

    Computer buildComputer();
}
