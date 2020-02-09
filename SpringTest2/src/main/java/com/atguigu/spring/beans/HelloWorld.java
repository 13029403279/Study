package com.atguigu.spring.beans;

public class HelloWorld {
    private String user;

    public void setUser(String user) {
        this.user = user;
    }

    public HelloWorld(String user){
        this.user = user;
    }
    public HelloWorld(){

    }
    public void hello() {
        System.out.println("hello:"+user);
    }
}
