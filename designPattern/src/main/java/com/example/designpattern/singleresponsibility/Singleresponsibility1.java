package com.example.designpattern.singleresponsibility;

/**
 * @describe: 描述
 * @auth: yuangq
 * @date: 2022/5/23 17:04
 */
public class Singleresponsibility1 {

    public static void main(String[] args) {
        //  v1
        RoadVehicle vehicle = new RoadVehicle();
        vehicle.run("奔驰");
        vehicle.run("自行车");

        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");


        //  v2
        Vehicle vehicle2 = new Vehicle();
        vehicle2.run("奔驰");
        vehicle2.run("自行车");

        vehicle2.runAir("飞机");
    }
}
//   1、分析：1、遵守单一原则
//        2、改动很大
//        3、改进Vehicle类

class RoadVehicle {
    public void run(String verhicle) {
        System.out.println(verhicle + "再路上运行！！");
    }
}

class AirVehicle {
    public void run(String verhicle) {
        System.out.println(verhicle + "再空中运行！！");
    }
}

class WaterVehicle {
    public void run(String verhicle) {
        System.out.println(verhicle + "再水中运行！！");
    }
}

// 2、改进
class Vehicle {
    public void run(String verhicle) {
        System.out.println(verhicle + "再路上运行！！");
    }

    public void runAir(String verhicle) {
        System.out.println(verhicle + "再空中运行！！");
    }

    public void runWater(String verhicle) {
        System.out.println(verhicle + "再水中运行！！");
    }
}