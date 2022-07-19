package com.example.effectivejava.item3;

import java.util.function.Supplier;

public class ConcertSupply {

    //입력은 없고 어떠한 타입을 리턴하는 것
    public void start(Supplier<Singer> singerSupplier) {
        Singer singer = singerSupplier.get();
        singer.sing();
    }

    //static한 메서드를 공급하여 사용할 수 있다.
    public static void main(String[] args) {
        ConcertSupply concert = new ConcertSupply();
//        concert.start(Elvis::getInstance);
    }

}
