package com.example.effectivejava.item1;


import java.util.Optional;
import java.util.ServiceLoader;

//정적 팩토리 메서드 장점 3 : 반환 타입의 하위 타입 객체를 반환할 수 있다.
//정적 팩토리 메서드 장점 4 : 입력 매개변수에 따라 매번 다른 클래스의 객체를 반환할 수 있다.
public class HelloServiceFactory {

    public static HelloService of(String lang) {
        if (lang.equals("ko")) {
            return new KoreanHelloService();
        } else {
            return new EnglishHelloService();
        }
    }

    //정적 팩토리 메서드 장점 5 : 아래와 같이 반환 객체 클래스가 존재하지 않아서 인터페이스 기반의 코드를 작성할 수 있다.
    public static void main(String[] args) {
        ServiceLoader<HelloService> loader = ServiceLoader.load(HelloService.class); //HelloService의 구현체를 찾아서 로드한다.
//         Optional<HelloService> first = loader.findFirst(); //있을 수 있고 없을 수 있다.
//        first.ifPresent(helloService -> {
//            System.out.println(helloService.hello());
//        });
        //다른 jar파일을 import해서 아래와 같이 사용하면 되는데 왜 위와 같이 사용할까?
        //바로 의존성 때문이다. 의존이 생긴다. import.~.ChineseHelloService
//        HelloService helloService = new ChineseHelloService();
//        System.out.println(helloService.hello());
    }
}
