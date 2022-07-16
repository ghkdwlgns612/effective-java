package com.example.effectivejava.item2;

import java.time.LocalDate;

public class Order {

    //언체크드 예외도 표기할 수 있지만 너무 많으면 체크드 예외만 적어준다.
    //왜 체크드 예외가 불편한데 체크드 예외를 사용할까? 예외 발샘 시 클라이언트가 후속조치를 해줘야하는 경우 사용해야함.
    public void updateDeliveryUpdate(LocalDate deliveryDate) {
        if (deliveryDate == null) {
            throw new NullPointerException("deliveryDate can't be null");
        }

        if (deliveryDate.isBefore(LocalDate.now())) {
            //인수로 최소한 어떤 인자가 잘못된건지 알려줘야함.
            throw new IllegalArgumentException("deliveryDate can't be earlier than " + LocalDate.now());
        }
    }
}
