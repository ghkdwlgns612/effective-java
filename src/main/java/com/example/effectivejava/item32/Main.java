package com.example.effectivejava.item32;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<String> list1 = new ArrayList<>();
//        List<String> list2 = new ArrayList<>();
//
//        Varargs.dangerous(list1,list2);

        String[] strings = Varargs.toArray("a", "1", "c");
        Serializable[] serializables = Varargs.toArray("a", 1, "c");

    }
}
