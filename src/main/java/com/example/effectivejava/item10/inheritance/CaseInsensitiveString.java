package com.example.effectivejava.item10.inheritance;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class CaseInsensitiveString {

    private final String s;

    public CaseInsensitiveString(String s) {
        this.s = Objects.requireNonNull(s);
    }

    //대칭성 위배
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof CaseInsensitiveString)
            return s.equalsIgnoreCase(((CaseInsensitiveString) obj).s);
        if (obj instanceof String) //다른 타입을 지원하지 말아야한다.(대칭성)
            return s.equalsIgnoreCase((String) obj);
        return false;
    }

    public static void main(String[] args) {
        CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
        String polish = "polish";
        System.out.println(cis.equals(polish));

        List<CaseInsensitiveString> list = new ArrayList<>();
        list.add(cis);

        System.out.println(list.contains(polish));
    }
}
