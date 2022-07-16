package com.example.effectivejava.item2.hierarchicalbuilder;

import java.util.Objects;

public class NyPizza extends Pizza{

    public enum Size { SMALL, MEDIUM, LARGE }

    private final Size size;

    //NyPizza의 빌더를 리턴함. 그래서 하위클래스에서도 상위 클래스가 아닌 자기 자신을 리턴함.
    public static class Builder extends Pizza.Builder<NyPizza.Builder> {
        private final Size size;

        public Builder(Size size) { this.size = Objects.requireNonNull(size); }

        @Override
        public NyPizza build() {
            return new NyPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private NyPizza(Builder builder) {
        super(builder);
        size = builder.size;
    }

    @Override
    public String toString() {
        return toppings + "로 토핑한 피자";
    }
}
