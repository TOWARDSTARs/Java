package com.towardstars.base.array;

public class Demo02 {
    public static void main(String[] args) {

            //静态初始化：创建+赋值
            int[] a={1,2,3,4,5,6,7,8};
            System.out.println(a[0]);


        for (int i = 0; i <  a.length-1;i++) {
            System.out.println(a[i]);
        }
            //动态初始化
            int[] b=new int[10];
            b[0]=10;
            System.out.println(b[0]);

            //默认初始化
            int[] c=new int[10];
            c[0]=10;

            System.out.println(c[0]);
            System.out.println(c[1]);
            System.out.println(c[2]);
            System.out.println(c[3]);

    }
}
