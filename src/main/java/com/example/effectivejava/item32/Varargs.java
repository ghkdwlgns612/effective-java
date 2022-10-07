package com.example.effectivejava.item32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Varargs<T> {
    static void dangerous(List<String>... strList) {
        List<Integer> intList = Arrays.asList(42);
        Object[] objects = strList;
        objects[0] = intList;
        String s = strList[0].get(0);
    }

    static <T> T[] toArray(T... args) {
        return args;
    }
}
