package com.towardstars.oop.override.polymorphic;

public class Student extends Person{
    @Override
    public void run() {
        System.out.println("son");
    }

    public void eat(){

        System.out.println("eat");
    }
}

