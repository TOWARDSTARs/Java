package com.towardstars.method;

public class Demo02 {
    public static void main(String[] args) {
         int max=max(10, 20);
        System.out.println(max);
    }

    //比大小
    public static int max(int num1,int num2){
        int result;

        if(num1==num2){
            System.out.println("num1==num2");
            return 0; //End
        }
        if(num1>num2) {
            result=num1;
        }else{
            result=num2;
        }

        return result;
    }
    //比大小
    public static double max(double num1,double num2){
        double result;

        if(num1==num2){
            System.out.println("num1==num2");
            return 0; //End
        }
        if(num1>num2) {
            result=num1;
        }else{
            result=num2;
        }

        return result;
    }//比大小
    public static int max(float num1,float num2){
        int result;

        if(num1==num2){
            System.out.println("num1==num2");
            return 0; //End
        }
        if(num1>num2) {
            result=(int) num1;
        }else{
            result=(int) num2;
        }

        return result;
    }
}
