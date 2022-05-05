package com.towardstars.base.struct;

public class switchDemo01 {
    public static void main(String[] args) {
        char grade='C';
        //case穿透
        switch(grade){
            case'A':
                System.out.println("Excellent");
                break;//可选
            case'B':
                System.out.println("Great");
                break;//可选
            case'C':
                System.out.println("Good");
                break;//可选
            case'D':
                System.out.println("Pass");
                break;//可选
            case'E':
                System.out.println("Failed");
                break;//可选
            default://可选
                System.out.println("Unknown");
        }
    }
}
