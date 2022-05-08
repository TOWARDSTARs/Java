package com.towardstars.Exception;

public class Test3 {
    public static void main(String[] args) {
        try {
            new Test3().test(1,0);
        } catch (ArithmeticException e) {
           e.printStackTrace();
        }

    }

    public void test(int a,int b)throws ArithmeticException{//方法构造时抛出异常
        if(b==0){
            throw new ArithmeticException();//方法体主动抛出异常
        }
    }
}
