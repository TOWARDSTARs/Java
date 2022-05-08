package com.towardstars.oop;


import com.towardstars.oop.Demo09_InnerClass.Outer;

public class application {

    public static void main(String[] args) {

        Outer outer = new Outer();
        //通过外部类来实例化内部类
        Outer.Inner inner = outer.new Inner();
        inner.in();
        inner.getID();

    }
}
