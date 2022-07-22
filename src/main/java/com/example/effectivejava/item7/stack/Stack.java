package com.example.effectivejava.item7.stack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        this.elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object o) {
        ensureCapacity();
        elements[size++] = o;
    }

//    배열안에서는 참조하지 않음. 다 쓴 참조는 해제
//    public Object pop() {
//        if (size == 0) {
//            throw new EmptyStackException();
//        }
//        Object result = elements[--size];
//        elements[size] = null;
//        return result;
//    }
//

    //여기가 문제. 계속 객체가 남아있음. 결국엔 메모리 누수발생.
    //뭔가 쌓아두는 곳에 이러한 문제발생.
    public Object pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        return elements[--size];
    }


    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }


}
