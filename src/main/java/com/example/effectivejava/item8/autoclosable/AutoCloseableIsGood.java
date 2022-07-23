package com.example.effectivejava.item8.autoclosable;

import java.io.BufferedInputStream;
import java.io.IOException;

//추천되는 방법.
public class AutoCloseableIsGood implements AutoCloseable{

    private BufferedInputStream inputStream;

    @Override
    public void close() {
        try {
            inputStream.close();
        } catch (IOException e) {
            throw new RuntimeException("failed to close " + inputStream);
        }
    }
}
