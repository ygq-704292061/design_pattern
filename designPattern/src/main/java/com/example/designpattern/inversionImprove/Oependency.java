package com.example.designpattern.inversionImprove;

/**
 * @describe: 描述
 * @auth: yuangq
 * @date: 2022/6/6 8:59
 */
public class Oependency {
    public static void main(String[] args) {
        //  1、接口传递依赖
//        OpenAndClose openAndClose = new OpenAndClose();
//        ChangHong changHong = new ChangHong();
//        openAndClose.open(changHong);
        //  2、构造方法依赖传递
//        OpenAndClose openAndClose = new OpenAndClose(new HaiEr());
//        openAndClose.open();
        //  3、使用setter方法进行依赖传递
        OpenAndClose openAndClose = new OpenAndClose();
        HaiKang kai = new HaiKang();
        openAndClose.setITV(kai);
        openAndClose.open();
    }
}

//  1、接口传递依赖
//interface IOpenAndClose{
//    void open(ITV itv);
//}
//
//interface ITV {
//    void play();
//}
//
//class ChangHong implements ITV {
//    @Override
//    public void play() {
//        System.out.println("长虹电视机打开了");
//    }
//}
//
////  实现接口
// class OpenAndClose implements  IOpenAndClose{
//    @Override
//    public void open(ITV itv) {
//        itv.play();
//    }
//}


// 2、通过构造方法进行依赖传递
//interface IOpenAndClose {
//    void open();
//}
//interface ITV{
//    void play();
//}
//class HaiEr implements ITV{
//    @Override
//    public void play() {
//        System.out.println("海尔电视机冒烟了！！");
//    }
//}
//class OpenAndClose implements IOpenAndClose{
//    public ITV itv;
//    public OpenAndClose(ITV itv) {
//        this.itv = itv;
//    }
//    @Override
//    public void open() {
//        this.itv.play();
//    }
//}


//  3、通过setter方法进行依赖传递
interface IOpenAndClose{
    void open();

    void setITV(ITV tv);
}
interface ITV{
    void test2();
}
class HaiKang implements  ITV{
    @Override
    public void test2() {
        System.out.println("海康电视炸了！！！");
    }
}
class OpenAndClose implements IOpenAndClose{
    public ITV tv;
    @Override
    public void open() {
        this.tv.test2();
    }
    @Override
    public void setITV(ITV tv) {
        this.tv = tv;
    }
}