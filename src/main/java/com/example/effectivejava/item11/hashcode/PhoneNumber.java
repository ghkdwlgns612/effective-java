package com.example.effectivejava.item11.hashcode;

import java.util.Objects;

public final class PhoneNumber {
    private final short areaCode, prefix, lineNum;

    public PhoneNumber(int areaCode, int prefix, int lineNum) {
        this.areaCode = rangeCheck(areaCode,999,"area code");
        this.prefix = rangeCheck(areaCode,999,"area code");
        this.lineNum = rangeCheck(areaCode,999,"area code");
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
        PhoneNumber number = (PhoneNumber) o;
        return areaCode == number.areaCode && prefix == number.prefix && lineNum == number.lineNum;
    }

    //전형적인 해쉬코드 구하는 법
//    @Override
//    public int hashCode() {
//        int result = Short.hashCode(areaCode);
//        result = 31 * result +  Short.hashCode(prefix);
//        result = 31 * result +  Short.hashCode(lineNum);
//        return result;
//    }
//
    //한 줄짜리 해쉬코드 구하는 법. 성능이 아쉽다.
    @Override
    public int hashCode() {
        return Objects.hash(areaCode, prefix, lineNum);
    }
}
