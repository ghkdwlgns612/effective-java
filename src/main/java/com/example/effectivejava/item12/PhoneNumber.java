package com.example.effectivejava.item12;

import java.util.Objects;

public class PhoneNumber {
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
        PhoneNumber that = (PhoneNumber) o;
        return areaCode == that.areaCode && prefix == that.prefix && lineNum == that.lineNum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(areaCode, prefix, lineNum);
    }

//    @Override
//    public String toString() {
//        return "PhoneNumber{" +
//                "areaCode=" + areaCode +
//                ", prefix=" + prefix +
//                ", lineNum=" + lineNum +
//                '}';
//    }

//    /*
//    * 이 전화번호의 문자열표현을 반환한다.
//    * 이 문자열은 "XXX-YYY-ZZZZ"형태의 12글자로 구성된다.
//    * XXX는 지역코드, YYY는 프리픽스, ZZZZ는 가입자 번호다.
//    * 각각의 대문자는 10진수 숫자 하나를 나타낸다.
//    * */
//    @Override
//    public String toString() {
//        return String.format("%03d-%03d-%04d",
//                areaCode, prefix, lineNum);
//    }

    public static PhoneNumber of(String phoneNUmberString) {
        String[] split = phoneNUmberString.split("-");
        PhoneNumber phoneNumber = new PhoneNumber(Integer.parseInt(split[0]),
                Integer.parseInt(split[1]),
                Integer.parseInt(split[2]));
        return phoneNumber;
    }

}
