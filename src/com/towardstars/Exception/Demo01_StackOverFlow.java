package com.towardstars.Exception;

public class Demo01_StackOverFlow {
    public static void main(String[] args) {
        new Demo01_StackOverFlow().a();

    }
    public void a(){
        b();

    }
    public void b(){
        a();
    }
}
