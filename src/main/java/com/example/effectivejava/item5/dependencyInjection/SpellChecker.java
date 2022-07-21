package com.example.effectivejava.item5.dependencyInjection;

import com.example.effectivejava.item5.Dictionary;

import java.util.List;
import java.util.function.Supplier;

public class SpellChecker {

    //자원을 명시하지 않았다. 모든 코드를 재사용 할 수 있다.
    //전제 : Dictionary가 인터페이스였을 때만 재사용 가능.
    //테스트 할 경우 가짜 Dictionary를 만들 수 있다.
    private final Dictionary dictionary;

    public SpellChecker(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

//    //중간에 추상화 단계추가. 매개변수 없이 가지고 오는 것은 Supplier이용
//    public SpellChecker(DictionaryFactory dictionaryFactory) {
//        this.dictionary = dictionaryFactory.getDictionary();
//    }

    //테스트 할때는 () -> DefaultDictionary던지 DefaultDictionary::new로 주입.
    //또 하나의 방법은 팩토리에 정적 메서드 활
    //테스트 할때는 () -> DictionaryFactory.get()던지 DictionaryFactory::get로 주입.
    //하위 타입도 포함하여 받을 수 있음. DefaultDictionary는 쓸수 있지만 MockDictionary를 쓸수없음.
    //그래서 Supplier<? extends Dictionary> dictionarySupplier 또는 Supplier<Dictionary> dictionarySupplier로 표기
    public SpellChecker(Supplier<? extends Dictionary> dictionarySupplier) {
        this.dictionary = dictionarySupplier.get();
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
