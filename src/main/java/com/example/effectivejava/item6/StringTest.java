package com.example.effectivejava.item6;

public class StringTest {

    public static void main(String[] args) {
        String hello = "hello";
        //잘못된 방법. 한번 만들어진건 상수풀에서 꺼내서 사용함
        String hello2 = new String("hello");
        String hello3 = "hello";


        System.out.println(hello == hello2); //false
        System.out.println(hello.equals(hello2)); //true
        System.out.println(hello == hello3); //true
    }
}
