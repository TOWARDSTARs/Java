package com.towardstars.oop.Demo04_inherit;

public class Student extends Person{

    public Student() {
        //隐藏代码：调用了父类的无参构造
       super();//调用父类构造器（必须在子类构造器第一行）
        //this();//调用本构造器（必须在第一行）（会递归）
        //super（）默认执行
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




/*
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

*/