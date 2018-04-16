package com.moxiaofan.java.designpattern.prototype;

import java.io.*;

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

    public void setPersonalInfo(String sex, Integer age) {
        this.sex = sex;
        this.age = age;
    }

    public void setWorkExperience(String workDate, String company) {
        work.setWorkDate(workDate);
        work.setCompany(company);
    }

    public void display() {
        System.out.println(String.format("%s %s %s", name, sex, age));
        System.out.println(String.format("工作经历：%s %s", work.getWorkDate(), work.getCompany()));
    }

    //shallow copy
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

    /**
     * deep copy
     */
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

    /**
     * deep copy by Serializable
     */
    public Object deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        ObjectOutputStream oo = new ObjectOutputStream(bo);
        oo.writeObject(this);

        ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
        ObjectInputStream oi = new ObjectInputStream(bi);
        return (oi.readObject());
    }


}
