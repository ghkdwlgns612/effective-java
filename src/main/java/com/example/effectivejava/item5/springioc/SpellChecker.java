package com.example.effectivejava.item5.springioc;

import com.example.effectivejava.item5.Dictionary;

import java.util.List;

public class SpellChecker {
    private Dictionary dictionary;

    public SpellChecker(Dictionary dictionary) {
        this.dictionary = dictionary;
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
