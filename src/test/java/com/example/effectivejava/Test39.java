package com.example.effectivejava;

import org.junit.jupiter.api.Test;

public class Test39 {

    @Test
    public static void m1() {

    }

    @Test
    public static void m2() {
        throw new RuntimeException("실패");
    }

    @Test
    public void m5() {

    }

    @Test
    public static void m7() {
        throw new RuntimeException("실패");
    }
}
