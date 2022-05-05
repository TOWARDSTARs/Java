package com.towardstars.base.array;

public class Demo04 {
    public static void main(String[] args) {
        int[] arrays = {1, 2, 3, 4, 5};

        for (int array : arrays) {
            System.out.println(array);
        }
        System.out.println();
        printArray(arrays);
        System.out.println();
        printArray(reverse(arrays));
    }
    //打印数组元素
    public static  void printArray(int[] arrays){
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]+"\t");

        }
    }

    //反转数组
    public static int[] reverse(int[] arrays){
        int [] result=new int[arrays.length];

        //反转的操作
        for (int i=0,j=result.length-1;i< arrays.length;i++,j--){
            result[j]=arrays[i];

        }
        return result;
    }


}


