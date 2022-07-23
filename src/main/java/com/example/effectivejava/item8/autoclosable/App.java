package com.example.effectivejava.item8.autoclosable;

public class App {

    //AutoClosable을 사용하는 방법. try-with-resource문법 사용.
    //클리너는 언제쓰면 좋으냐? 필수적으로 해제되어야하는 객체에 안전망을 씌우고 싶을 때.
    public static void main(String[] args) {
        try(AutoCloseableIsGood good = new AutoCloseableIsGood()) {

        } catch (Exception e) {
            e.printStackTrace();
        }

        //이 방법은 추천되지 않음.
//        try {
//
//        } catch () {
//
//        } finally {
//
//        }
    }
}
