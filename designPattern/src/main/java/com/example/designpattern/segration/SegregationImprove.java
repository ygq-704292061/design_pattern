package com.example.designpattern.segration;

/**
 * @describe: 描述
 * @auth: yuangq
 * @date: 2022/5/26 15:52
 */
public class SegregationImprove {
    public static void main(String[] args) {
        CC cc = new CC();
        cc.depend1(new DD());
        cc.depend4(new DD());
        cc.depend5(new DD());
    }
}
interface InterfaceOne {
    void operation1();
}

interface InterfaceTwo {
    void operation2();
    void operation3();

}

interface InterfaceThree {
    void operation4();
    void operation5();
}

class BB implements InterfaceOne,InterfaceTwo{

    @Override
    public void operation1() {
        System.out.println("B 实现operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B 实现operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B 实现operation3");
    }

}

class DD implements InterfaceOne, InterfaceThree{

    @Override
    public void operation1() {
        System.out.println("D 实现operation1");
    }

    @Override
    public void operation4() {
        System.out.println("D 实现operation4");
    }

    @Override
    public void operation5() {
        System.out.println("D 实现operation5");
    }
}

class AA { //  A类接口通过Interface1 依赖（使用）B类  单只会用到1、2、3方法
    public void depend1(InterfaceOne i){
        i.operation1();
    }
    public void depend2(InterfaceTwo i){
        i.operation2();
    }
    public void depend3(InterfaceTwo i){
        i.operation3();
    }
}

class CC { //  C类接口通过Interface1 依赖（使用）B类  单只会用到1、4、5方法
    public void depend1(InterfaceOne i) {
        i.operation1();
    }

    public void depend4(InterfaceThree i) {
        i.operation4();
    }

    public void depend5(InterfaceThree i) {
        i.operation5();
    }
}