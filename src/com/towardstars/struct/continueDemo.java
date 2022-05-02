package com.towardstars.struct;

public class continueDemo {
    public static void main(String[] args) {
        int i=0;
        while(i<100){
            i++;
            if(i%10==0){
                System.out.println();
                continue;
            }
            System.out.print(i+"\t");
        }
        //continue用于终止某次循环
    }
}
