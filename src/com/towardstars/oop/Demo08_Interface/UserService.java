package com.towardstars.oop.Demo08_Interface;

public interface UserService {
    //接口中的所以定义都是 public abstract

    void add(String name);
    void delete(String name);
    void update(String name);
    void query(String name);

}
