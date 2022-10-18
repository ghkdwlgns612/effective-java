package com.example.effectivejava.item40;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Bigram {

    private final char first;
    private final char second;

    public Bigram(char first, char second) {
        this.first = first;
        this.second = second;
    }

    public boolean equals(Bigram b) {
        return first == b.first && second == b.second;
    }

    public int hashCode() {
        return 31 * first + second;
    }

    public static void main(String[] args) {
        Set<Bigram> set = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            for (char ch = 'a'; ch <= 'z'; ch++) {
                set.add(new Bigram(ch, ch));
            }
            System.out.println(set.size());
        }
    }
}
