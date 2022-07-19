package com.example.effectivejava.item3;

import java.io.*;

//역직렬화 시 여러 개의 인스턴스가 생성될 수 있다.
//역질력화 및 직렬화 시 기본 생성자가 필요함.
//그리고 클래스 내부에 readResolve()를 재정의해주면 같은 인스턴스로 읽힌다.
public class ElvisSerialization {

    public static void main(String[] args) {
        try(ObjectOutput out = new ObjectOutputStream(new FileOutputStream("elvis.obj"))) {
            out.writeObject(Elvis.INSTANCE);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(ObjectInput in = new ObjectInputStream(new FileInputStream("elvis.obj"))) {
            Elvis elvis = (Elvis) in.readObject();
            System.out.println(elvis == Elvis.INSTANCE);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
