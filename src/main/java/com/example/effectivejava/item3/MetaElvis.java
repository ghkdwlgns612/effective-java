package com.example.effectivejava.item3;

public class MetaElvis<T> {

    private static final MetaElvis<Object> INSTANCE = new MetaElvis<>();

    private MetaElvis() { }

    //여기 T가 한 번더 들어간이유는? 스코프가 다르기 때문. 앞의 T를 클래스가 사용한다. 뒤의 T는 인스턴스 스코프이다.
    @SuppressWarnings("unchecked")
    public static <T> MetaElvis<T> getInstance() { return (MetaElvis<T>) INSTANCE; }

    public void say(T t) {
        System.out.println(t);
    }

    public void leaveTheBuilding() {
        System.out.println("Whoa baby, I'm outta here!");
    }

    //우리가 원하는 형으로 변환 할 수 있다.(제네릭 팩토리메서드방법)
    // ==은 할 수 없고 equals는 된다.
    public static void main(String[] args) {
        MetaElvis<String> elvis1 = MetaElvis.getInstance();
        MetaElvis<Integer> elvis2 = MetaElvis.getInstance();

        elvis1.say("hello");
        elvis2.say(100);
    }
}
