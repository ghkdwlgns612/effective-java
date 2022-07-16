package com.example.effectivejava.item2.hierarchicalbuilder;

import com.example.effectivejava.item2.builder.NutritionFacts;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pizza {

    public enum Topping { HAM, MUSHROOM, ONION, PEPPER, SAUSAGE }

    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self(); //여기서 this를 리턴하면?
        }

        abstract Pizza build();

        //하위 클래스는 이 메서드를 재정의하여 "this"를 반환하도록 해야한다.
        protected abstract T self();
    }

    Pizza(Builder<?> builder) { toppings = builder.toppings.clone(); }

}
