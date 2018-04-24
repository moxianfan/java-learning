package com.moxiaofan.java.designpattern.strategy;

/**
 * Created by wangxy on 2018/4/24.
 */


public class AdvancedMemberStrategy implements MemberStrategy {
    private static final double CAL = 0.7;

    @Override
    public double calPrice(double bookPrice) {
        return bookPrice * CAL;
    }
}
