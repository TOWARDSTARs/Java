package com.towardstars.struct;

public class NmNList_forDemo04 {
    public static void main(String[] args) {
        //1.先打印第一列，9.fori
        //2.把固定的1再用一个循环包起来，9.forj
        //3.去掉重复项，i<=j
        //4.调整样式



        for (int j =1; j <= 9; j++) {
            for (int i= 1; i <= j; i++) {
            System.out.print(j+"*"+i+"="+(j*i)+"\t");
        }
            System.out.println();
        }
    }
}
