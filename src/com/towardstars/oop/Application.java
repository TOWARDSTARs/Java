package com.towardstars.oop;

import com.towardstars.oop.inherit.Person;
import com.towardstars.oop.inherit.Student;

//一个项目应该只存在一个main方法
public class Application {
    public static void main(String[] args) {

        Student student = new Student();
        student.test("sxz");
        student.say();
        student.test1();
        Person person = new Person();
        person.getClass();
    }



}
