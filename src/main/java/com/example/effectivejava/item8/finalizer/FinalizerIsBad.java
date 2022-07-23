package com.example.effectivejava.item8.finalizer;

public class FinalizerIsBad {

    //finalizer사용. Object에 포함되어있는 메서드. 자바 9부터는 Deprecated되있음.
    //AutoCloseable을 사용하는 것이 좋음.
    @Override
    protected void finalize() throws Throwable {
        System.out.println("");
    }
}
