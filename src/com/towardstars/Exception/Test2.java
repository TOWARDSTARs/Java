package com.towardstars.Exception;

public class Test2 {
    public static void main(String[] args) {
        int a=1;
        int b=0;


        //Ctrl+Alt+T
        try {
            if(b==0){//主动抛出异常 throw throws
                throw new ArithmeticException();
            }
            System.out.println(a/b);
        } catch (Exception e) {
            System.exit(0);
            e.printStackTrace();
        } finally {
        }
    }
}
