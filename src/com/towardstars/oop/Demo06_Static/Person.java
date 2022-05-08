package com.towardstars.oop.Demo06_Static;


public class Person {

    //3rd
    public Person() {
        System.out.println("构造方法");

    }

    //2nd
    {
        System.out.println("匿名代码块");
    }

    //1st
    static{
        System.out.println("静态代码块（类加载的时候执行）(只执行一次)");
    }
    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println("===============");
        Person person2 = new Person();
    }
}
