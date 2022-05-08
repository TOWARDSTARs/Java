package com.towardstars.oop.Demo09_InnerClass;

public class test {
    public static void main(String[] args) {

        Apple apple = new Apple();
        //没有名字初始化类，不用将实例保存到变量中
        new Apple().eat();//匿名内部类

        /* UserService userService=*/ new UserService(){   //实现UserService接口的匿名内部类
            @Override
            public void hello() {

            }

        };
    }
}

class Apple{
    public void eat(){
        System.out.println("1");
    }
}

interface UserService{
    void hello();
}