package com.towardstars.base.struct;

public class DowhileDemo02 {
    public static void main(String[] args) {
        int a=0;
        while(a<0){
            a++;
            System.out.println(a);
        }
        System.out.println("----------");
        do{
            a++;
            System.out.println(a);
        }while(a<0);
    }
}
