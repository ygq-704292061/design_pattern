package com.example.designpattern.inversion;

/**
 * @describe: 描述
 * @auth: yuangq
 * @date: 2022/5/26 17:38
 */
public class DependecyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

class Email{
    public String getInfo(){
        return "电子邮件信息";
    }
}

// 完成Person接受消息的功能
// 方式1完成
// 分析：1、简单
//      2、如果我们要获取对象是微信、短信等等。 同事Person也要增加相应的方法
// 解决思路：引入抽象的接口IReceiver,表示接收者，这样Person类与接口发生依赖
//  因为Eamil、微信等等都属于接受的范畴，他们给自实现IReceiver接口就ok，这样就符合依赖倒转原则
class Person{
    public void receive(Email email){
        System.out.println(email.getInfo());
    }
}