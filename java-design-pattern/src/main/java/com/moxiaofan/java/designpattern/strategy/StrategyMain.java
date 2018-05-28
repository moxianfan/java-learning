package com.moxiaofan.java.designpattern.strategy;

/**
 * Created by wangxy on 2018/4/24.
 */

/**
 * 策略模式
 *
 * 环境(Context)角色：持有一个Strategy的引用。
 * 抽象策略(Strategy)角色：这是一个抽象角色，通常由一个接口或抽象类实现。此角色给出所有的具体策略类所需的接口。
 * 具体策略(ConcreteStrategy)角色：包装了相关的算法或行为。
 */

public class StrategyMain {
    public static void main(String[] args) {
        MemberStrategy advancedMemberStrategy = new AdvancedMemberStrategy();
        Price price = new Price(advancedMemberStrategy);
        double calPrice = price.quote(300);
        System.out.println(calPrice);
    }
}
