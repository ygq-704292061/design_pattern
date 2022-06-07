package com.example.designpattern.liskov.improve;

/**
 * @describe: 里氏替换原则案例
 * @auth: yuangq
 * @date: 2022/6/6 16:09
 */
public class Liskov2 {

    public static void main(String[] args) {
        A a = new A();
        Integer integer = a.function1(10, 9);
        System.out.println("10-9="+integer);
        B b = new B();
        //  因为B类不在去继承A类，因此调用者，不会再用function1求减法
        System.out.println("12-5="+b.function1(12, 5));
        System.out.println(b.function2(10, 9));

        //  使用组合仍然可以使用到A类相关方法
        System.out.println(b.function3(15, 10));
    }

}

class Base{


}

class A extends Base{
    public Integer function1(int a, int b){
        return a-b;
    }
}

class B extends Base {
    // 如果B想要用A的方法，使用组合的关系　
    private A a = new A();
    public Integer function1(int a, int b){
        return a+b;
    }

    public Integer function2(int a, int b){
        return function1(a, b)+9;
    }

    public Integer function3(int num1, int num2){
        return a.function1(num1, num2);
    }

}