package com.moxiaofan.java.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangxy on 2018/4/19.
 */


public class BranchMarket extends Market {

    public BranchMarket(String name){
        this.name = name;
    }

    private List<Market> list = new ArrayList<>();

    @Override
    public void add(Market market) {
        list.add(market);
    }

    @Override
    public void remove(Market market) {
        list.remove(market);
    }

    @Override
    public void pay() {
        System.out.println(name + " pay ");
        for(Market market : list){
            market.pay();
        }
    }
}
