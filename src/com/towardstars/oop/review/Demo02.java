package com.towardstars.oop.review;

public class Demo02 {

    //静态方法 static
    //非静态方法


    public static void main(String[] args) {
        Student.say();                      //调用静态方法
        Student student = new Student();    //调用非静态方法
        student.say1();
    }

    public void a(){           //在类Demo02实例化之后才存在
        b();
    }
    public static void b(){    //和类Demo02一起加载

    }



}
