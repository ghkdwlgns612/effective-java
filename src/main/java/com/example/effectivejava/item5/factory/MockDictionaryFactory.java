package com.example.effectivejava.item5.factory;

import com.example.effectivejava.item5.Dictionary;
import com.example.effectivejava.item5.MockDictionary;

public class MockDictionaryFactory implements DictionaryFactory{
    @Override
    public Dictionary getDictionary() {
        return new MockDictionary();
    }
}
