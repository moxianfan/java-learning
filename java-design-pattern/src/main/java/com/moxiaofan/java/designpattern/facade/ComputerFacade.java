package com.moxiaofan.java.designpattern.facade;

/**
 * Created by wangxy on 2018/4/19.
 */


public class ComputerFacade {
    private CPU cpu;
    private Disk disk;
    private Memory memory;

    public ComputerFacade(){
        cpu = new CPU();
        disk = new Disk();
        memory = new Memory();
    }

    public void start(){
        cpu.start();
        disk.start();
        memory.start();
    }

    public void shutdown(){
        cpu.shutdown();
        disk.shutdown();
        memory.shutdown();
    }

}
