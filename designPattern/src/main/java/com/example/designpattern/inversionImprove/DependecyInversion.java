package com.example.designpattern.inversionImprove;

/**
 * @describe: 描述
 * @auth: yuangq
 * @date: 2022/5/26 17:38
 */
public class DependecyInversion {
    public static void main(String[] args) {
        // 客户端不用改变
        Person person = new Person();
        person.receive(new Email());
    }
}

class Email implements IReceiver{
    @Override
    public String getMessage() {
        return "这是Email消息";
    }
}

class WeiXin implements IReceiver{

    @Override
    public String getMessage() {
        return "这是微信消息";
    }
}


interface IReceiver{
    String getMessage();
}


class Person{
    public void receive(IReceiver iReceiver){
        System.out.println(iReceiver.getMessage());
    }
}