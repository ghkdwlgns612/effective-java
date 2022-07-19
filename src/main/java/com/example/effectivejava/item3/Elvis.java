package com.example.effectivejava.item3;

import java.io.Serializable;

// 장점 : 간결하고 javaDocs로 이해하기 쉽다.
// 단점 : 클라이언트 코드를 테스트하기 어려워진다.
// 무슨말이지? Concert참조
public class Elvis implements IElvis, Serializable, Singer {

    /**
     * 싱글톤 오브젝트
     */
    public static final Elvis INSTANCE = new Elvis();

    private static boolean created;

    private Elvis() {
        if (created) {
            throw new UnsupportedOperationException("can't be created by constructor");
        }
        created = true;
    }

    @Override
    public void leaveTheBuilding() {
        System.out.println("Whoa baby, I'm outta here!");
    }

    @Override
    public void sing() {
        System.out.println("I'll have a blue~ Christmas without you~");
    }

    public static void main(String[] args) {
        Elvis elvis = Elvis.INSTANCE;
        elvis.leaveTheBuilding();
    }

    //오버라이드는 아니지만 사용이된다. 기존의 인스턴스 반환
    private Object readResolve() {
        return INSTANCE;
    }
}
