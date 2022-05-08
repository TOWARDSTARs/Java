package com.towardstars.oop.Demo04_inherit;

//public
//private
//default
//protected

//ctrl+h
//所有的类，都继承object

public class Person {
    protected String name="tostars";
    private int money=10_0000_0000;

    public void say(){
        System.out.println("说话");
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    public void print(){
        System.out.println("Person");


    }

    public Person() {
        System.out.println("Person无参执行");
    }
}
