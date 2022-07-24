package com.example.effectivejava.item9.suppress;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TopLine {
    static String firstLineOfFile(String path) throws IOException {
        BufferedReader br = new BadBufferReader(new FileReader(path));
        try {
            return br.readLine();
        } finally {
            //try-finally의 가장 큰 문제는 가장 나중에 발생한 예외만 보인다!!
            //만약 try-with-resource를 사용하면 가장 처음 발생한 예외가 보이고 후속 예외도 보인다!! 이게 아주 좋은 장점이다.
            br.close();
        }
    }

    public static void main(String[] args) throws IOException {
        String path = args[0];
        System.out.println(firstLineOfFile(path));
    }
}
