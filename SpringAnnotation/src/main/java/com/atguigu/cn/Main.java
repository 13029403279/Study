package com.atguigu.cn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        ApplicationContext ctx=new
                ClassPathXmlApplicationContext("Beans.xml");
        TextEditor txt= (TextEditor) ctx.getBean("textEditor");
        txt.spellCheck();
    }
}
