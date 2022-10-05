package com.example.effectivejava.item18;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        InstrumentHashSet<String> set = new InstrumentHashSet<>();
        set.addAll(Arrays.asList("tick","tictic","pang"));
        System.out.println(set.getAddCount());
    }
}
