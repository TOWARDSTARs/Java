package com.towardstars.method;

import java.util.Scanner;
//注意，当前版本需要按回车
public class Demo08_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int former= scanner.nextInt();
        String symbol= scanner.next();
        int later=scanner.nextInt();
        int output=0;
        switch (symbol) {

            case "+":
                output =add(former,later);
                break;
            case "-":
                output =minus(former,later);
                break;
            case "*":
                output=multiply(former,later);
                break;
            case "/":
                output=divide(former,later);
                break;
            default:
                System.out.println("error");
                output=0;
        }
        scanner.close();
        System.out.println(output);
    }


    public static int add(int a,int b){
        int result;
        result = a+b;
        return result;
    } public static int minus(int a,int b){
        int result;
        result = a-b;
        return result;
    } public static int multiply(int a,int b){
        int result;
        result = a*b;
        return result;
    } public static int divide(int a,int b){
        int result;
        result = a/b;
        return result;
    }
}
