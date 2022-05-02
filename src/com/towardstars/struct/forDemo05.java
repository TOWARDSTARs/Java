package com.towardstars.struct;

public class forDemo05 {
    public static void main(String[] args) {
        int[] numbers={10,20,30,40,50};//array

        //遍历数组元素
        for (int i = 0; i < 5; i++) {          //1
            System.out.println(numbers[i]);
        }
        System.out.println("==============");
        for (int x:numbers){                   //2
            System.out.println(x);
        }
    }
}
