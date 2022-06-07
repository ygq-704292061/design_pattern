package com.example.designpattern.liskov;

/**
 * @describe: 里氏替换原则案例
 * @auth: yuangq
 * @date: 2022/6/6 16:09
 */
public class Liskov1 {

    public static void main(String[] args) {
        A a = new A();
        Integer integer = a.function1(10, 9);
        System.out.println("10-9="+integer);
        B b = new B();
        System.out.println("12-5="+b.function1(12, 5));
        System.out.println(b.function2(10, 9));
    }

}

class A {
    public Integer function1(int a, int b){
        return a-b;
    }
}

class B extends A {
    @Override
    public Integer function1(int a, int b){
        return a+b;
    }
    public Integer function2(int a, int b){
        return function1(a, b) + 9;
    }
}