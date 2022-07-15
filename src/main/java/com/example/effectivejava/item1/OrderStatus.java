package com.example.effectivejava.item1;


//Enum의 장점 : Type-Safety하다.(문자나 숫자로 표현하면 이상한 값을 들어갈 수 있다. 그래서 Enum을 사용하면 정해진 값만 들어갈 수 있다.)
public enum OrderStatus {

    PREPARING, SHIPPED, DELIVERING, DELIVERED

    //equals보다 ==을 쓰는 것을 추천. 왜? null에 안전하다.(NPE를 피해갈 수 있다.)
    //order.orderStatus.equals(OrderStatus.DELIVERED) --> X
    //order.orderStatus == OrderStatus.DELIVERED --> O

}
