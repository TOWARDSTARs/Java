package com.towardstars.array;

import java.util.Arrays;

public class Demo06 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,9090,31231,543,21,3,23};
        System.out.println(a);//[I@4554617c
        //打印数组元素 Arrays.toString()
        System.out.println(Arrays.toString(a));
        printArray(a);

        //数组排序（升序） Arrays.sort()
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        //数组填充 Arrays.fill()
        Arrays.fill(a,2,4,0);
        System.out.println(Arrays.toString(a));
    }

    public static void printArray(int[] a){
        System.out.print("[");
        System.out.print(a[0]+",");
        for (int i = 1; i <a.length-1 ; i++) {
            System.out.print(" "+a[i]+",");
        }
        System.out.print(" "+a[a.length-1]);
        System.out.println("]");
    }
}
