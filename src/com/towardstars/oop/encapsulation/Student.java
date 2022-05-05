package com.towardstars.oop.encapsulation;

/**
 1. 提高程序安全性，保护数据
 2. 隐藏代码的实现细节
 3. 统一接口
 4. 增加系统可维护性
 */

public class Student {

    //属性私有
    private String name;//姓名
    private int id; //学号
    private char sex;//性别
    private int age;//年龄

    //提供一些可以操作这个属性的方法！
    //提供一些public的get（获得数据）、set（设置值）方法

    //get
    public String getName(){
        return this.name;
    }
    //set
    public void setName(String name){
        this.name = name;
    }

    //alt+insert

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 120 || age > 0) {
            this.age = age;
        }else{
            this.age = 3;
        }
    }
}



/** public static void main(String[] args) {
 Student s1 = new Student();

 s1.setName("Kobe");

 System.out.println(s1.getName());

 s1.setAge(70);
 System.out.println(s1.getAge());

 }
*/

