package com.example.effectivejava.item5.singleton;

import com.example.effectivejava.item5.DefaultDictionary;
import com.example.effectivejava.item5.Dictionary;

import java.util.List;

//staticUtils와 똑같은 문제. 유연성 및 재활용성이 떨어진다.
//Test에서 목킹이 어렵다. 할수는 있지만 객체지향적이지 않다.
public class SpellChecker {

    //자원을 직접 명시한다라는 뜻.
    private final Dictionary dictionary = new DefaultDictionary();

    private SpellChecker() {
    }

    public static final SpellChecker INSTANCE = new SpellChecker();

    public boolean isValid(String word) {
        //TODO 여기 SpellChecker기능 코드포함
        return dictionary.contains(word);
    }

    public List<String> suggestions(String typo) {
        //TODO 여기 SpellChecker기능 코드포함
        return dictionary.closeWordsTo(typo);
    }
}