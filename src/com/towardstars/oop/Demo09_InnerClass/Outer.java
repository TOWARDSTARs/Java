package com.towardstars.oop.Demo09_InnerClass;

public class Outer {

    private int id=13483;
    public void out(){
        System.out.println("outer");
    }

    //局部内部类
    public void method(){
        class Inner{
            public void in(){

            }
        }
    }

    public /*static(静态内部类)*/class Inner{   //成员内部类
        public void in(){
            System.out.println("inner");
        }

        //获得外部类的private属性
        public void getID(){
            System.out.println(id);
        }
    }
}

//可有多个class，只能有一个public class
class A{
    public static void main(String[] args) {

    }

}
