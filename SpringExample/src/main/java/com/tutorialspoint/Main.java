package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("TutorialBeans.xml");
        TextEditor editor= (TextEditor) ctx.getBean("textEditor");
        editor.spellCheck();
    }
}
