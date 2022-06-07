package com.example.designpattern.ocp;

/**
 * @describe: 描述
 * @auth: yuangq
 * @date: 2022/6/6 17:33
 */
public class Ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Roundness());
    }
}

class GraphicEditor{

    public void drawShape(Shape shape){
        if(shape.m_type  == 1){
            drawRectangle();
        }else if(shape.m_type == 2){
            drawRoundness();
        }
    }

    public void drawRectangle(){
        System.out.println("绘画矩形！！！");
    }

    public void drawRoundness(){
        System.out.println("绘画圆形！！！");
    }
}
//  基类
class Shape{
    int m_type;
}

class Rectangle extends Shape{
    Rectangle() {
        super.m_type = 1;
    }
}

class Roundness extends Shape{
    Roundness(){
        super.m_type = 2;
    }
}