package com.moxiaofan.java.designpattern.builder;

/**
 * Created by wangxy on 2018/4/10.
 */


public class HPConcreteBuilder implements ComputerBuilder{

    Computer computer = new Computer();

    @Override
    public void buildMaster() {
        computer.setMaster("HP Master");
    }

    @Override
    public void buildScreen() {
        computer.setScreen("HP Screen");
    }

    @Override
    public void buildKeyboard() {
        computer.setKeyboard("HP Keyboard");
    }

    @Override
    public void buildAudio() {
        computer.setAudio("HP Audio");
    }

    @Override
    public void buildMouse() {
        computer.setMouse("HP Mouse");
    }

    @Override
    public Computer buildComputer() {
        return computer;
    }
}
