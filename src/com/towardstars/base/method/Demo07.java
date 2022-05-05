package com.towardstars.method;


public class Demo07 {
    public static void main(String[] args) {
        System.out.println(f(25));
    }  //n<=25
    public static long f(int n){

        if(n==1){
            return 1;            //边界条件
        }else{
            return n*f(n-1);  //前阶段 //返回阶段
        }
        //n==1 ? return 1 : return n*f(n-1);
    }
}
