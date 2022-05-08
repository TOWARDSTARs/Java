package com.towardstars.oop.Demo07_Abstract;

public abstract class Action {

    public Action() {
    }

    //抽象方法，只有名字，没有实现
    public abstract void doSomething();

    //1.不能new抽象类，只能靠子类实现
    //2.抽象类中可以写普通的方法
    //3.抽象方法必须在抽象类中
    public void concrete(){

    }
}
