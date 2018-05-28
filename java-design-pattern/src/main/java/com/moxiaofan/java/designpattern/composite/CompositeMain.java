package com.moxiaofan.java.designpattern.composite;


/**
 * Created by wangxy on 2018/4/19.
 */

/**
 * 组合模式
 */
public class CompositeMain {
    public static void main(String[] args) {
        Market market = new BranchMarket("总店");
        Market branchMarket = new BranchMarket("分店");
        Market joinMarket1 = new JoinMarket("加盟店1");
        Market joinMarket2 = new JoinMarket("加盟店2");
        branchMarket.add(joinMarket1);
        branchMarket.add(joinMarket2);
        market.add(branchMarket);
        market.pay();
    }
}
