package com.example.effectivejava.item5.staticutils;

import com.example.effectivejava.item5.DefaultDictionary;
import com.example.effectivejava.item5.Dictionary;

import java.util.List;

//문제는 Dictionary에 따라 SpellChecker가 하는 동작이 변할 수 있다.
//그래서 SpellChecker의 테스트를 할 때 마다 Dictionary가 내부적으로 계속 생성된다.
public class SpellChecker {

    //자원을 직접 명시한다라는 뜻.
    private final static Dictionary dictionary = new DefaultDictionary();

    private SpellChecker() {
    }

    public static boolean isValid(String word) {
        //TODO 여기 SpellChecker기능 코드포함
        return dictionary.contains(word);
    }

    public static List<String> suggestions(String typo) {
        //TODO 여기 SpellChecker기능 코드포함
        return dictionary.closeWordsTo(typo);
    }
}
