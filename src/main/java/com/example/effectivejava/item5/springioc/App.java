package com.example.effectivejava.item5.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        SpellChecker sp = applicationContext.getBean(SpellChecker.class);
        sp.isValid("test");
    }
}
