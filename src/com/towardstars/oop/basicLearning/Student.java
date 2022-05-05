package com.towardstars.oop.basicLearning;


//学生类
public class Student {

    //属性settings
    String name;//null
    int age;    //0


    //方法methods
    public void study(){
        System.out.println(this.name+"is learning.");
    }
}
/**
 *     public static void main(String[] args) {
 *
 *         //类：实例化
 *         //类实例化会返回一个自己的对象
 *         //student对象就是一个Student类的一个具体实例
 *
 *         Student John = new Student();
 *         Student Jack = new Student();
 *
 *         John.name="John";
 *         John.age=18;
 *
 *         System.out.println(John.name);
 *         System.out.println(John.age);
 *
 *         System.out.println(Jack.name);
 *         System.out.println(Jack.age);
 *
 *     }
 */