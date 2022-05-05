package com.towardstars.oop.review;

//引用传递
public class Demo05 {
    public static void main(String[] args) {
        Person person = new Person();

        System.out.println(person.name);//null

        Demo05.change(person);

        System.out.println(person.name);
    }
    public static void change(Person person){
        //person是一个对象：指向---> Person person = new Person(); 这是一个具体的对象，可以改变属性
         person.name="kobe";
    }
}

//定义了一个Person类，有一个属性：name
class Person{
    String name;//null
    
}
