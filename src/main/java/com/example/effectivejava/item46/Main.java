package com.example.effectivejava.item46;

import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Map<String, Long> words = new Scanner(file).token()) {
            words.forEach(word -> {
                freq.merge(word.toLowerCase(), 1L, Long::sum);
            });
        }

        Map<String, Long> freq;
        try(Stream<String> words = new Scanner(file).token()) {
            freq = words.collect(groupingBy(String::toLowerCase, countin()));
        }
    }
}
