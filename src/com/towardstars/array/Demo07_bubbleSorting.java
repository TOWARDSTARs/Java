package com.towardstars.array;

import java.util.Arrays;

public class Demo07_bubbleSorting {
    public static void main(String[] args) {
        int[] a={1,4,5,6,72,2,2,2,25,6,7};
        int[] sort=sort(a);
        System.out.println(Arrays.toString(a));


    }

    //冒泡排序
    //1.比较数组中，两个相邻的元素，如果第一个数比第二个大，我们就交换他们的位置
    //2.每一次比较，都会产出一个更大或者更小的数字
    //3.下一轮则可以少相应次数的排序
    //4.依次循环，直至结束

    public static int[] sort(int[] array){
        //临时变量
        int temp=0;

        //外层循环，判断走多少次
        for (int i = 0; i < array.length-1; i++) {

            boolean flag=false;//通过flag标识位减少没有意义的比较

            //内层循环，比较两个数，并判断是否交换位置
            for (int j = 0; j <array.length-1-i ; j++) {
                if(array[j+1]>array[j]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    flag=true;
                }

            }
            if (flag==false){
                break;
            }
        }
        return array;
    }
}
