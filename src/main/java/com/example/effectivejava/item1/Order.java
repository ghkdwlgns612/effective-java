package com.example.effectivejava.item1;


//정적 팩토리 메서드 장점 1 : 이름을 명시적으로 만들어 줄 수 있다.
public class Order {

    private boolean prime;

    private boolean urgent;

    private Product product;

    private OrderStatus orderStatus;

//    public Order() {
//    } //생성자가 없을 경우는 기본 생성자가 자동으로 생성된다.

//    public Order(boolean prime, Product product) {
//        this.prime = prime;
//        this.product = product;
//    }

//    public Order(boolean urgent, Product product) {
//        this.urgent = urgent;
//        this.product = product;
//    } //왜 안되냐? 같은 시그니처가 같은 위치에 오는 경우는 자바가 인식을 못함. 순서를 바꿔주면 인식가능

    public static Order primeOrder(Product product) {
        Order order = new Order();
        order.prime = true;
        order.product = product;
        return order;
    }

    public static Order urgentOrder(Product product) {
        Order order = new Order();
        order.urgent = true;
        order.product = product;
        return order;
    }

    public static void main(String[] args) {
    }
}
