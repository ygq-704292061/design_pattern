package com.example.designpattern.segration;

/**
 * @describe:     classA依赖接口   interface1   使用 1,2,3方法
 *                classB实现接口   interface1   operation1-5的方法
 *                classC依赖接口   interface1   使用1，4，5方法
 *                classD实现接口   interface1   operation1-5方法
 * @auth: yuangq
 * @date: 2022/5/26 15:13
 */
public class Segregation1 {

    public static void main(String[] args) {
        A a = new A();
        a.depend2(new B()); //  A类通过接口依赖B类
    }
}

interface Interface1{
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}
class B implements Interface1{

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

    @Override
    public void operation4() {
        System.out.println("B 实现operation4");
    }

    @Override
    public void operation5() {
        System.out.println("B 实现operation5");
    }
}

class D implements Interface1{

    @Override
    public void operation1() {
        System.out.println("D 实现operation1");
    }

    @Override
    public void operation2() {
        System.out.println("D 实现operation2");
    }

    @Override
    public void operation3() {
        System.out.println("D 实现operation3");
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

class A { //  A类接口通过Interface1 依赖（使用）B类  单只会用到1、2、3方法
    public void depend1(Interface1 i){
        i.operation1();
    }
    public void depend2(Interface1 i){
        i.operation2();
    }
    public void depend3(Interface1 i){
        i.operation3();
    }
}

class C { //  C类接口通过Interface1 依赖（使用）B类  单只会用到1、4、5方法
    public void depend1(Interface1 i){
        i.operation1();
    }
    public void depend4(Interface1 i){
        i.operation4();
    }
    public void depend5(Interface1 i){
        i.operation5();
    }
}