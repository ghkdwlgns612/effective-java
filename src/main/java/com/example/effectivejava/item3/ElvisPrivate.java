package com.example.effectivejava.item3;

public class ElvisPrivate {
    private static final ElvisPrivate INSTANCE = new ElvisPrivate();
    private ElvisPrivate() { }
    public static ElvisPrivate getInstance() { return INSTANCE; }
    // 메서드로 접근하면 동작을 바꿀 수 있다는 장점.
//    public static ElvisPrivate getInstance() { return new ElvisPrivate(); }


    public void leaveTheBuilding() {
        System.out.println("Whoa baby, I'm outta here!");
    }

    public static void main(String[] args) {
        ElvisPrivate elvisPrivate = ElvisPrivate.getInstance();
        elvisPrivate.leaveTheBuilding();

        System.out.println(ElvisPrivate.getInstance());
        System.out.println(ElvisPrivate.getInstance());
    }
}
