package com.towardstars.base.processControl;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //add
        double sum=0;
        //number
        int m=0;
        while(scanner.hasNextDouble()) {
            double x = scanner.nextDouble();
            m++;
            sum = sum + x;
        }
        System.out.println(m+"个数的和为"+sum);
        System.out.println(m+"个数的平均值是"+(sum/m));

        scanner.close();
    }
}
