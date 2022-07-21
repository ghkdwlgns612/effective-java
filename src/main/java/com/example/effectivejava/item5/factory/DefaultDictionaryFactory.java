package com.example.effectivejava.item5.factory;

import com.example.effectivejava.item5.DefaultDictionary;
import com.example.effectivejava.item5.Dictionary;

public class DefaultDictionaryFactory implements DictionaryFactory{
    @Override
    public Dictionary getDictionary() {
        return new DefaultDictionary();
    }
}
