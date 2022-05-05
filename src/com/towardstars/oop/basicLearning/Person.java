package com.towardstars.oop.basicLearning;

public class Person {
    String name;
    int age;

    public Person(){                      //显示定义的无参构造器-->用来初始化值

    }
    public Person(String name,int age){   //有参构造:一旦定义了有参构造，无参构建就必须显示定义
        this.name="jack";
    }
    //alt+insert快捷键
}


/**
 *  public static void main(String[] args) {
 *
 *         //new 实例化一个对象-->实例化初始值:1.使用new关键字，本质是调用构造器
 *         Person person = new Person(" ",1);
 *         System.out.println(person.name);
 *
 *     }
 *
 *     构造器：1.和类名相同 2.没有返回值
 *
 */