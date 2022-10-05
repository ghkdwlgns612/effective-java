package com.example.effectivejava.item13;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PhoneNumber implements Cloneable{
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
        PhoneNumber that = (PhoneNumber) o;
        return areaCode == this.areaCode && prefix == this.prefix && lineNum == this.lineNum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(areaCode, prefix, lineNum);
    }

    //Object clone을 사용한다.
    @Override
    protected PhoneNumber clone() {
        try {
            return (PhoneNumber) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        PhoneNumber pn = new PhoneNumber(707,867,5309);
        Map<PhoneNumber, String> m = new HashMap<>();
        Object clone = pn.clone();

        System.out.println(clone != pn); //true
        System.out.println(clone.getClass() == pn.getClass()); //true
        System.out.println(clone.equals(pn)); //true아닐수도
    }

//    public static void main(String[] args) {
//        Object[] values = new Object[2];
//        values[0] = new PhoneNumber();
//        values[1] = new PhoneNumber();
//
//        Stack stack = new Stack(values);
//        Stack copy = stack.clone();
//
//        while (!stack.isEmpty())
//            System.out.println(stack.pop());
//
//        while (!copy.isEmpty())
//            System.out.println(copy.pop());
//    }
}


