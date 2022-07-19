package com.example.effectivejava.item3;

public class ConcertTest {

    public void realElvis() {
        Concert concert = new Concert(Elvis.INSTANCE);
        concert.perform();
    }

    public void mockElvis() {
        Concert concert = new Concert(new MockElvis());
        concert.perform();
    }
}
