package com.towardstars.method;
//最大值算法
public class Demo05_PrintMax {
    public static void main(String[] args) {
printMax(34,3,3,2,100);
printMax(new double[]{1,2,3,4,5});

    }


    public static void printMax(double... num ){
        if(num.length==0){
            System.out.println("No argument passed");
            return;
        }

        double result=num[0];

        //排序
        for (int i = 1; i <num.length ; i++) {
            if(num[i]>result){
                result=num[i];
            }
        }
        System.out.println("The max value is "+result);

    }
}
