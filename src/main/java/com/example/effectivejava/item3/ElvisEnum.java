package com.example.effectivejava.item3;

//직렬화나 리플렉션에 대해서 매우 안전하다.
//Enum은 생성자를 가져올 수 없다.
public enum ElvisEnum {

    INSTANCE;

    private ElvisEnum() { }

    public void leaveTheBuilding() {
        System.out.println("기다려 자기야, 지금 나갈께!");
    }

    public static void main(String[] args) {
        ElvisEnum elvisEnum = INSTANCE;
        elvisEnum.leaveTheBuilding();
    }
}
