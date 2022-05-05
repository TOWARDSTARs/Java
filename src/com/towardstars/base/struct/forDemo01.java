package com.towardstars.base.struct;

public class forDemo01 {
    //for(初始化；布尔表达式；更新) {//代码}
    public static void main(String[] args) {

        //while循环
        int a=1;
        while (a<=100){//条件判断
            a+=2;//迭代
            System.out.println(a);//循环体
        }
        System.out.println("while循环结束！");

        //for循环
        //初始化//条件判断//迭代
        for (int i=1;i<=100;i++){
            System.out.println(i);
        }
        System.out.println("for循环结束");
    }

}
