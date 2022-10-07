package com.example.effectivejava.item33;

import java.util.HashMap;
import java.util.Map;

public class Favorites {

    //모든 키는 매개변수화 될 수 있다. Object로 지정한 이유는 키와 값은 별도이다.
    private Map<Class<?>, Object> map = new HashMap<>();

    public <T> void putFavorite(Class<T> type, T instance) {
        map.put(type,instance);
    }

    public <T> T getFavorite(Class<T> type) {
        //형변환 연산자의 동적버전.
        return type.cast(map.get(type));
    }
}
