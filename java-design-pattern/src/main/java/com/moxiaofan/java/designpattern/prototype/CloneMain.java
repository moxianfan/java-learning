package com.moxiaofan.java.designpattern.prototype;

import java.io.IOException;

/**
 * Created by wangxy on 2018/4/12.
 */


public class CloneMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException, CloneNotSupportedException {
        Resume a = new Resume("大鸟");
        a.setPersonalInfo("男", 29);
        a.setWorkExperience("1998-2000", "xx公司");
        //浅复制
        Resume b = (Resume) a.clone();
        b.setWorkExperience("1998-2006", "yy公司");
        b.setPersonalInfo("女", 25);

        a.display();
        b.display();

        Resume c = new Resume("大鸟");
        c.setPersonalInfo("男", 29);
        c.setWorkExperience("1998-2000", "xx公司");
        //深复制
        Resume d = (Resume) c.deepClone();
        d.setWorkExperience("1998-2006", "yy公司");
        d.setPersonalInfo("男", 25);

        c.display();
        d.display();

        /**
         *
         大鸟 男 29
         工作经历：1998-2006 yy公司
         大鸟 女 25
         工作经历：1998-2006 yy公司
         大鸟 男 29
         工作经历：1998-2000 xx公司
         大鸟 男 25
         工作经历：1998-2006 yy公司
         */
    }
}
