package com.example.effectivejava.item2.hierarchicalbuilder;

public class PizzaTest {
    public static void main(String[] args) {
        NyPizza ny = new NyPizza.Builder(NyPizza.Size.MEDIUM)
                .addTopping(Pizza.Topping.MUSHROOM)
                .addTopping(Pizza.Topping.HAM)
                .build();

        // self()가 아닌 this를 사용하면 캐스팅이 필요하다.
//        NyPizza ny = (NyPizza) new NyPizza.Builder(NyPizza.Size.MEDIUM)
//                .addTopping(Pizza.Topping.MUSHROOM)
//                .addTopping(Pizza.Topping.HAM)
//                .build();

    }
}
