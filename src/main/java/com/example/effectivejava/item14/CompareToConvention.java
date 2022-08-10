package com.example.effectivejava.item14;

import java.math.BigDecimal;

public class CompareToConvention {

    public static void main(String[] args) {
        BigDecimal n1 = BigDecimal.valueOf(2313414);
        BigDecimal n2 = BigDecimal.valueOf(2222414);
        BigDecimal n3 = BigDecimal.valueOf(2313431);
        BigDecimal n4 = BigDecimal.valueOf(2223414);

        //반사성
        System.out.println(n1.compareTo(n1));

        //대칭성
        System.out.println(n1.compareTo(n2));
        System.out.println(n2.compareTo(n1));

        //추이성
        System.out.println(n3.compareTo(n1) > 0);
        System.out.println(n1.compareTo(n2) > 0);
        System.out.println(n3.compareTo(n2) > 0);

        //일관성
        System.out.println(n4.compareTo(n2));
        System.out.println(n2.compareTo(n1));
        System.out.println(n4.compareTo(n1));

        //compareTo가 0이라면 equals는 true여야 한다.(아닐 수도 있고)
        BigDecimal oneZero = new BigDecimal("1.0");
        BigDecimal oneZeroZero = new BigDecimal("1.00");
        System.out.println(oneZero.compareTo(oneZeroZero));
        System.out.println(oneZero.equals(oneZeroZero)); //소수점 뒤의 스케일까지 확인
    }
}
