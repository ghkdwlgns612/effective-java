package com.example.effectivejava.item5.springioc;

import com.example.effectivejava.item5.Dictionary;

import java.util.List;

public class SpringDictionary implements Dictionary {
    @Override
    public boolean contains(String word) {
        System.out.println("contains " + word);
        return false;
    }

    @Override
    public List<String> closeWordsTo(String typo) {
        return null;
    }
}
