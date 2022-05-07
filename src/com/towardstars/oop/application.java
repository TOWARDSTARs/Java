package com.towardstars.oop;

import com.towardstars.oop.override.polymorphic.Person;
import com.towardstars.oop.override.polymorphic.Student;
import com.towardstars.oop.override.polymorphic.Teacher;

public class application {
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
}
