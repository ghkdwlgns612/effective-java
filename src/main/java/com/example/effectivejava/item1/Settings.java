package com.example.effectivejava.item1;


//정적 팩토리 메서드 장점 2 : 생성자를 제한하여 인스턴스의 갯수를 하나로 제한할 수 있다.
public class Settings {

    private boolean useAutoSteering;

    private boolean useABS;

    private Difficulty difficulty;

//    //정적 팩토리 메서드 단점 1 : 상속을 허용할 수 없다.(정적 팩토리 메서드만 사용할 경우)
//    private Settings() {}

    //정적 팩토리 메서드 단점 2 : 정적 팩토리 메서드는 찾기 어렵다. of(매개변수 받아서 생성시), getInstance(새로운 인스턴스를 받을때)
    //그래서 javaDocs를 활용해서 프로그래머들이 조금 쉽게 찾을 수 있도록 해야한다.
    public Settings(boolean useAutoSteering, boolean useABS, Difficulty difficulty) {
        this.useAutoSteering = useAutoSteering;
        this.useABS = useABS;
        this.difficulty = difficulty;
    }

    public Settings() {
    }

    private static final Settings SETTINGS = new Settings();

    public static Settings newInstance() {
        return SETTINGS;
    }
}
