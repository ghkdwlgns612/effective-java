package com.example.effectivejava.item14;

import java.util.Comparator;
import java.util.Objects;

import static java.util.Comparator.comparingInt;

public class PhoneNumber implements Cloneable, Comparable<PhoneNumber> {
    private final short areaCode, prefix, lineNum;

    public PhoneNumber(int areaCode, int prefix, int lineNum) {
        this.areaCode = rangeCheck(areaCode, 999, "area code");
        this.prefix = rangeCheck(areaCode, 999, "area code");
        this.lineNum = rangeCheck(areaCode, 999, "area code");
    }

    private short rangeCheck(int areaCode, int i, String area_code) {
        if (areaCode < 0 || areaCode > i)
            throw new IllegalArgumentException(area_code + ": " + areaCode);
        return (short) areaCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com.example.effectivejava.item13.PhoneNumber that = (com.example.effectivejava.item13.PhoneNumber) o;
        return areaCode == this.areaCode && prefix == this.prefix && lineNum == this.lineNum;
    }

//    @Override
//    public int compareTo(PhoneNumber o) {
//        int result = Short.compare(areaCode, o.areaCode);
//        if (result == 0) {
//            result = Short.compare(prefix, o.prefix);
//            if (result == 0)
//                result = Short.compare(lineNum, o.lineNum);
//        }
//        return result;
//    }

    //이렇게 COMPARATOR를 만들어서 사용한다.
    //스태틱 메서드를 사용해서 인스턴스를 만들 수 있다.
    private static final Comparator<PhoneNumber> COMPARATOR =
            comparingInt((PhoneNumber pn) -> pn.areaCode)
                    .thenComparingInt(pn -> pn.prefix)
                    .thenComparingInt(pn -> pn.lineNum);

    @Override
    public int compareTo(PhoneNumber pn) {
        return COMPARATOR.compare(this, pn);
    }

   @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(areaCode, prefix, lineNum);
    }

}
