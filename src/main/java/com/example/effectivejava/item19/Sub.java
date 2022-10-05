package com.example.effectivejava.item19;

import java.time.Instant;

public class Sub extends FaultSuper{

    private final Instant instant;

    public Sub() {
        instant = Instant.now();
    }

    @Override
    public void overrideMe() {
        System.out.println(instant);
    }

    public static void main(String[] args) {
        Sub sub = new Sub();
        System.out.println("==============");
        sub.overrideMe();
    }
}
