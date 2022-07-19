package com.example.effectivejava.item3;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ElvisReflection {

    //리플렉션 시 생성자로 여러 인스턴스를 만들 수 있다.
    //해결하기 위한 방법은? boolean flag를 이용하여 막아준다.
    public static void main(String[] args) {
        try {
            Constructor<Elvis> constructor = Elvis.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            Elvis elvis1 = constructor.newInstance();
            Elvis elvis2 = constructor.newInstance();
            System.out.println(elvis1 == elvis2);
            System.out.println(elvis1 == Elvis.INSTANCE);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
