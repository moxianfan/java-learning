package com.moxiaofan.java.designpattern.instance;

/**
 * Created by wangxy on 2018/4/8.
 */

import java.util.Properties;

/**
 * Initialization On Demand Holder idiom
 */
public class DemandHolderSingleton {
    private String parameterA;
    private String parameterB;

    private static class DemandHolder {
        static final DemandHolderSingleton INSTANCE = new DemandHolderSingleton();
    }

    private DemandHolderSingleton() {
        //readConfigFile();
    }

    public static DemandHolderSingleton getDemandHolderSingleton() {
        return DemandHolder.INSTANCE;
    }

    private void readConfigFile() {
        Properties properties = new Properties();
        //loadConfigFile();
        parameterA = properties.getProperty("parameterA");
        parameterB = properties.getProperty("parameterB");
    }

    public String getParameterA() {
        return parameterA;
    }

    public String getParameterB() {
        return parameterB;
    }
}
