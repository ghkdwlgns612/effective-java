package com.example.effectivejava.item15;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Example {
    private static final String[] PRIVATE_VALUES = {"jihu","hihu","kihu"};
    public static final List<String> VALUES = Collections.unmodifiableList(Arrays.asList(PRIVATE_VALUES));
    public static final String[] VALUES_DEFENSE = PRIVATE_VALUES.clone();
}
