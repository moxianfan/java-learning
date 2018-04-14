package com.moxiaofan.java.designpattern.clone;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by wangxy on 2018/4/12.
 */


public class Resume implements Serializable, Cloneable {
    private static final long serialVersionUID = 8614140644886700330L;
    private String name;
    private String sex;
    private Integer age;
    private WorkExperience work;

    public Resume(String name) {
        this.name = name;
        work = new WorkExperience();
    }

    //设置个人信息
    public void setPersonalInfo(String sex, Integer age) {
        this.sex = sex;
        this.age = age;
    }

    //设置工作经历
    public void setWorkExperience(String workDate, String company) {
        work.setWorkDate(workDate);
        work.setCompany(company);
    }

    //显示
    public void display() {
        System.out.println(String.format("%s %s %s", name, sex, age));
        System.out.println(String.format("工作经历：%s %s", work.getWorkDate(), work.getCompany()));
    }

    //浅复制
    @Override
    public Object clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }

    //深复制
    /*@Override
    protected Object clone() throws CloneNotSupportedException {
        int age = this.age;
        String sex = this.sex;
        String name = new String(this.name);

        Resume copy = new Resume(name);
        copy.setPersonalInfo(sex, age);
        copy.setWorkExperience(this.work.workDate, this.work.company);
        return copy;
    }*/

    //深复制
    public Object deepClone() throws IOException, ClassNotFoundException {
        //将对象写到流里
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        ObjectOutputStream oo = new ObjectOutputStream(bo);
        oo.writeObject(this);
        //从流里读出来
        ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
        ObjectInputStream oi = new ObjectInputStream(bi);
        return (oi.readObject());
    }


}
