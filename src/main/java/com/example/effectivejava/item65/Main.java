package com.example.effectivejava.item65;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Class<? extends Set<String>> cl = null;
        try {
            cl = (Class<? extends Set<String>>) Class.forName(args[0]); //비검사 형변환
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        Constructor<? extends Set<String>> cons = null;
        try {
            cons = cl.getConstructor();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        Set<String> s = null;
        try {
            s = cons.newInstance();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        s.addAll(Arrays.asList(args).subList(1, args.length));
        System.out.println(s);
    }
}
