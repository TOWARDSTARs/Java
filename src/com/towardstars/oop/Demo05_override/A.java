package com.towardstars.oop.Demo05_override;

public class A extends B{
    @Override
    //重写
    //1.非static
    //2.public
    //3.是方法的重写，与属性无关
    public void test() {
        System.out.println("A>=test()");
    }
}








/*
public static void main(String[] args) {

        A a = new A();
        a.test();//A

        //父类的引用指向了子类
        B b=new A();
        b.test();//B

    }
 */
