package com.towardstars.oop.override.polymorphic;


import com.towardstars.oop.inherit.Teacher;
import com.towardstars.oop.override.polymorphic.Person;
import com.towardstars.oop.override.polymorphic.Student;

//一个项目应该只存在一个main方法
public class Application {
    public static void main(String[] args) {

        //一个对象的实际类型是确定的
        //new Student();
        //new Person();

        //可以指向的引用类型不确定：父类的引用指向子类

        //Student能调用的方法都是自己的或者继承父类的
        Student s1 = new Student();
        //Person 可以指向子类，不能调用子类的方法
        Person s2 = new Student();
        Object s3 = new Student();
        Person person = new Person();


        s2.run();
        s1.run();
        person.run();

        //对象能执行哪些方法，主要看对象左边的类型（即Student，Person，Object）
        s1.eat();
       // s2.eat()不行
        ((Student)s2).eat();

    }


}
