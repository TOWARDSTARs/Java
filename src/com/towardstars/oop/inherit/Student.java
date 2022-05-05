package com.towardstars.oop.inherit;

public class Student extends Person{

    public Student() {
        //隐藏代码：调用了父类的无参构造
        System.out.println("Student无参执行");
    }

    private String name="Kobe";
    public void print(){
        System.out.println("Student");
    }
    public void test1(){
        print();
        this.print();
        super.print();
    }
    public void test(String name){
        System.out.println(name);//sxz
        System.out.println(this.name);//Kobe
        System.out.println(super.name);//tostars
    }

}
