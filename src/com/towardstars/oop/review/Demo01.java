package com.towardstars.oop.review;

import java.io.IOError;
import java.io.IOException;

//Demo01 类
public class Demo01 {

    //main 方法
    public static void main(String[] args) {


    }
    /*
        修饰符  返回值类型  方法名（）{
           方法体
           return 返回值；
        }
    */
    public String sayHello(){
        return "Hello,world!";
    }

    public void hello(){
        return;
    }

    public int max(int a,int b){
        return a>b?a : b;  //三元运算符
    }

    //break：跳出switch，结束循环
    //return：方法结束


    //数组下标越界异常：Arrayindexoutofbounds

    public void readFile(String file) throws IOException{

    }
}
