package com.example.effectivejava.item5.dependencyInjection;

import com.example.effectivejava.item5.DefaultDictionary;
import com.example.effectivejava.item5.Dictionary;

public class DictionaryFactory {

    public Dictionary getDictionary() {
        return null;
    }

    public static Dictionary get() {
        return new DefaultDictionary();
    }
}
