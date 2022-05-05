package com.towardstars.base.struct;

public class breakDemo {
    public static void main(String[] args) {
        int i=0;
        while (i<100) {
            i++;
            System.out.println(i);
            if (i == 30) break;
        }
        //break强行退出循环
    }
}