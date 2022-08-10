package com.example.effectivejava.item13.clone_use_constructor;

//만약 super.clone이 아니고 생성자라면?
public class Item implements Cloneable{

    private String name;

    @Override
    public Item clone() {
        Item item = new Item();
        item.name = this.name;
        return item;
    }
}
