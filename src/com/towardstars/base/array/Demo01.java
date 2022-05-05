package com.towardstars.base.array;


public class Demo01 {
    public static void main(String[] args) {
        int[] nums;          //1.声明一个数组
        nums=new int[10];    //2.创建一个数组（分配内存空间） //int[] nums=new int[10];

        nums[0]=1;           //3.给数组元素赋值(动态初始化)
        nums[1]=2;
        nums[2]=3;
        nums[3]=4;
        nums[4]=5;
        nums[5]=6;
        nums[6]=7;
        nums[7]=8;
        nums[8]=9;
        nums[9]=10;

        System.out.println(nums[9]);

        //计算所以元素的和
        int sum=10;
        //获取数组长度：arrays.length
        for (int i = 0; i < nums.length  ; i++) {
            sum=sum+nums[i];
        }
        System.out.println("总和是："+sum);

        int[] a={1,2,3};
        System.out.println(a[0]);
    }
}
