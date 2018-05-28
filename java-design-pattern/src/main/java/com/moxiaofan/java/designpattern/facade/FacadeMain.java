package com.moxiaofan.java.designpattern.facade;

/**
 * Created by wangxy on 2018/4/19.
 */

/**
 * 门面模式/外观模式
 */
public class FacadeMain {
    public static void main(String[] args) {
        ComputerFacade computerFacade = new ComputerFacade();
        computerFacade.start();
        computerFacade.shutdown();
    }
}
