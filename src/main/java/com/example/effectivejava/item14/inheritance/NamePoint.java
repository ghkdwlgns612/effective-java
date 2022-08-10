package com.example.effectivejava.item14.inheritance;


import java.util.Comparator;
import java.util.TreeSet;

//상속은 하위 클래스에서 Comparable을 할 수 없다.
public class NamePoint extends Point{

    final private String name;

    public NamePoint(int x, int y, String name) {
        super(x, y);
        this.name = name;
    }

    //상속하는 경우에는 이렇게 정의해주면 된다.
    //그러나 좋지않은 방법. 컴포지션을 이용하자.(상속을 사용하지 말고)
    public static void main(String[] args) {
        NamePoint p1 = new NamePoint(1,0,"jihun");
        NamePoint p2 = new NamePoint(1,0,"jihun111");

        TreeSet<NamePoint> set = new TreeSet<>(new Comparator<NamePoint>() {
            @Override
            public int compare(NamePoint o1, NamePoint o2) {
                return 0;
            }
        });
    }
}
