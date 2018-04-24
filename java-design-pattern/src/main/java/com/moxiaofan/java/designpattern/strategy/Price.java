package com.moxiaofan.java.designpattern.strategy;

/**
 * Created by wangxy on 2018/4/24.
 */


public class Price {
    private MemberStrategy memberStrategy;

    public Price(MemberStrategy memberStrategy) {
        this.memberStrategy = memberStrategy;
    }

    public double quote(double bookPrice) {
        return this.memberStrategy.calPrice(bookPrice);
    }

}
