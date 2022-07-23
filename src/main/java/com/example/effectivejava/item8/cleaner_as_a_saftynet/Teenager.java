package com.example.effectivejava.item8.cleaner_as_a_saftynet;

public class Teenager {
    //자원해제에 안전하지 않음. Room이 해제 안될 수 있다.
    public static void main(String[] args) {
        new Room(99);
        System.out.println("Peace out");

//        System.gc();
    }
}
