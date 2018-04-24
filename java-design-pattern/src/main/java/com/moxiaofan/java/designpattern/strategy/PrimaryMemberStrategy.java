package com.moxiaofan.java.designpattern.strategy;

/**
 * Created by wangxy on 2018/4/24.
 */


public class PrimaryMemberStrategy implements MemberStrategy {
    @Override
    public double calPrice(double bookPrice) {
        return bookPrice;
    }
}
