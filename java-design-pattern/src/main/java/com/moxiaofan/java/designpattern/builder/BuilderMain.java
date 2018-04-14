package com.moxiaofan.java.designpattern.builder;

/**
 * Created by wangxy on 2018/4/10.
 */

/**
 * 与抽象工厂的区别：在建造者模式里，有个指导者，由指导者来管理建造者，用户是与指导者联系的，指导者联系建造者最后得到产品。
 * 即建造模式可以强制实行一种分步骤进行的建造过程。
 *
 * 建造模式是将复杂的内部创建封装在内部，对于外部调用的人来说，只需要传入建造者和建造工具，对于内部是如何建造成成品的，调用者无需关心。
 *
 * Product: 表示被构造的复杂对象,其中包含需要构建的部件属性。
 * Builder: 创建一个产品对象的各个部件指定抽象接口。
 * ConcreteBuilder： 实现Builder的接口以构造和装配该产品的各个部件，定义并明确它所创建的表示。
 * Director： 调用具体建造者角色以创建产品对象。
 */

public class BuilderMain {
    public static void main(String[] args){
        ComputerBuilder computerBuilder = new HPConcreteBuilder();
        //ComputerBuilder computerBuilder = new DellConcreteBuilder();
        Director director = new Director(computerBuilder);
        Computer hpComputer = director.comstructComputer();
        System.out.printf(hpComputer.getAudio());
    }
}
