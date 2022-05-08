package com.towardstars.oop.Demo05_override.polymorphic;


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

    /*
    public static void main(String[] args) {
        Object object = new Student();
        System.out.println(object instanceof Student);
        System.out.println(object instanceof Person);
        System.out.println(object instanceof Object);

        System.out.println(object instanceof Teacher);
        System.out.println(object instanceof String);

        System.out.println("==================");
        Person person=new Student();
        System.out.println(person instanceof Student);
        System.out.println(person instanceof Person);
        System.out.println(person instanceof Object);

        System.out.println(person instanceof Teacher);
        //System.out.println(person instanceof String);编译报错
        System.out.println("===================");



    }
     */


}
