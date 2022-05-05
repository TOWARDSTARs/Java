package com.towardstars.base.array;

public class Demo05_multiArray {
    public static void main(String[] args) {
        int[][] array={{1,2},{2,3},{3,4},{4,5}};
        printArray(array[0]);
        System.out.println();
        System.out.println("==========");
        System.out.println(array[0][0]);
        System.out.println(array[0][1]);
        System.out.println("==========");
        System.out.println(array.length);
        System.out.println(array[0].length);
        System.out.println("==========");
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                System.out.println(array[i][j]);
            }
        }
    }
    //打印数组元素
    public static void printArray(int[] arrays){
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i]+" ");

        }
    }
}
