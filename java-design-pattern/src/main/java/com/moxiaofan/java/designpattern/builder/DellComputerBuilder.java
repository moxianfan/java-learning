package com.moxiaofan.java.designpattern.builder;

/**
 * Created by wangxy on 2018/4/10.
 */


public class DellComputerBuilder implements ComputerBuilder{
    Computer computer = new Computer();

    @Override
    public void buildMaster() {
        computer.setMaster("Dell Master");
    }

    @Override
    public void buildScreen() {
        computer.setScreen("Dell Screen");
    }

    @Override
    public void buildKeyboard() {
        computer.setKeyboard("Dell Keyboard");
    }

    @Override
    public void buildAudio() {
        computer.setAudio("Dell Audio");
    }

    @Override
    public void buildMouse() {
        computer.setMouse("Dell Mouse");
    }

    @Override
    public Computer buildComputer() {
        return computer;
    }
}
