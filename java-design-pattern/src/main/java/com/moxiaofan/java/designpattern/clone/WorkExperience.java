package com.moxiaofan.java.designpattern.clone;

import java.io.Serializable;

/**
 * Created by wangxy on 2018/4/12.
 */


public class WorkExperience implements Serializable {
    private static final long serialVersionUID = -5461562344310808271L;
    public String workDate;

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public String company;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}