package com.example.effectivejava.item13.clone_use_constructor;

public class SubItem extends Item implements Cloneable{
    private String name;

    @Override
    public SubItem clone() {
        return (SubItem) super.clone();
    }

    //Item(상위)을 SubItem(하위)으로 변환을 못함.
    //clone을 재정의 안해도 예외가발생.
    //그래서 Object의 clone으로 반환하게 해줘야함.
    public static void main(String[] args) {
        SubItem item = new SubItem();
        SubItem clone = item.clone();
    }
}
