package com.example.effectivejava.item3;

//지금 우리는 perform메소드를 테스트하고 싶다.
//그래서 Elvis를 Mock객체로 등록하고 싶지만 할 수 없다. 그래서 계속 Elvis를 생성해줘야한다.
//만약 연산이 오래걸리면? 정말 오래걸리고 비효율적이다.
//해결방법은? Elvis의 인터페이스를 만들자.
//MockElvis구현체를 만들어 가짜객체를 만들어 테스트를 실행한다!!
public class Concert {
    private boolean lightsOn;

    private boolean mainStateOpen;

    private IElvis elvis;

    public Concert(IElvis elvis) {
        this.elvis = elvis;
    }

    public void perform() {
        mainStateOpen = true;
        lightsOn = true;
        elvis.sing();
    }

    public boolean isLightsOn() {
        return lightsOn;
    }

    public boolean isMainStateOpen() {
        return mainStateOpen;
    }
}
