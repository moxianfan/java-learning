package com.moxiaofan.java.designpattern.singleton;

/**
 * Created by wangxy on 2018/4/9.
 */


public enum EnumSingleton {
    /**
     * 数据源
     */
    DATASOURCE;

    private DBConnection connection = null;

    private EnumSingleton() {
        connection = new DBConnection();
    }

    public DBConnection getConnection() {
        return connection;
    }
}

