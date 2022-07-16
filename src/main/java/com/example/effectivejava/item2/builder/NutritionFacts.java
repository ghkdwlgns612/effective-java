package com.example.effectivejava.item2.builder;

//생성자 체인 및 자바 빈즈
//세터를 이용한 생성자는 NPE발생의 주된 원인이 될 수 있다.
//필수(생성자) 및 선택 필드(세터)를 섞어서 사용한다.
//불변 객체를 만들 수 없다. 그래서 빌더를 추천한다.
//빌더는 어떤 때 사용하는게 좋을까? 불변객체를 만들고 싶으며 필드가 필수적인 것과 선택적인 것으로 나누어져 있고 필드들이 많이 존재할 때
//빌더 어노테이션은 AllarguConstruct 레벨을 private로 해줘야 모든 원소 생성자를 감출 수 있다.
//그리고 어노테이션은 필수값을 나타내주기가 매우 어렵다.
public class NutritionFacts {
    private final int servingSize;

    private final int servings;

    private final int calories;

    private final int fat;

    private final int sodium;

    private final int carbohvdrate;

    public NutritionFacts(int servingSize, int servings) {
        this(servingSize, servings, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calories) {
        this(servingSize,servings,calories,0);
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat) {
        this(servingSize,servings,calories,fat,0);
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium) {
        this(servingSize,servings,calories,fat,sodium,0);
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium, int carbohvdrate) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohvdrate = carbohvdrate;
    }

    private NutritionFacts(Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohvdrate = builder.carbohvdrate;
    }

    public static class Builder {
        //필수 매개변수
        private final int servingSize;

        private final int servings;

        //선택 매개변수 - 기본값 초기화
        private int calories = 0;

        private int fat = 0;

        private int sodium = 0;

        private int carbohvdrate = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        //리턴값이 VOID가 아니기 때문에 플루언트 API를 사용가능하게 만든다.
        public Builder calories(int val)
        { calories = val; return this;}
        public Builder fat(int val)
        { fat = val; return this;}
        public Builder sodium(int val)
        { sodium = val; return this;}
        public Builder carbohvdrate(int val)
        { carbohvdrate = val; return this;}

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }

    public static void main(String[] args) {
        NutritionFacts cocaCola = new Builder(240,8)
                .calories(100)
                .sodium(35)
                .carbohvdrate(27)
                .build();
    }
}
