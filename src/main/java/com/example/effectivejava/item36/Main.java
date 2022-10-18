package com.example.effectivejava.item36;

import java.util.EnumSet;

public class Main {

    public static void main(String[] args) {
        TextNew textNew = new TextNew();
        textNew.applyStyles(EnumSet.of(TextNew.Style.BOLD, TextNew.Style.ITALIC));
    }
}
