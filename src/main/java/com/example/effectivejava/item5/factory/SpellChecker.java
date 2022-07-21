package com.example.effectivejava.item5.factory;

import com.example.effectivejava.item5.Dictionary;

import java.util.List;

public class SpellChecker {

    private Dictionary dictionary;

    //확장에 열려있고 변경에 닫혀있다.
    public SpellChecker(DictionaryFactory dictionaryFactory) {
        this.dictionary = dictionaryFactory.getDictionary();
    }

    public boolean isValid(String word) {
        //TODO 여기 SpellChecker기능 코드포함
        return dictionary.contains(word);
    }

    public List<String> suggestions(String typo) {
        //TODO 여기 SpellChecker기능 코드포함
        return dictionary.closeWordsTo(typo);
    }
}
