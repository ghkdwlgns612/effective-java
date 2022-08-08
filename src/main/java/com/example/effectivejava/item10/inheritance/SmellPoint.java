package com.example.effectivejava.item10.inheritance;

import com.example.effectivejava.item10.Color;
import com.example.effectivejava.item10.Point;

public class SmellPoint extends Point {

    private String smell;

    public SmellPoint(int x, int y, String smell) {
        super(x, y);
        this.smell = smell;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Point))
            return false;

        //o가 일반 Point면 색상을 무시하고 비교한다.
        if (!(o instanceof ColorPoint))
            return o.equals(this);

        //o가 ColorPoint면 색상까지 비교한다.
        return super.equals(o) && ((SmellPoint) o).smell == smell;
    }

    public static void main(String[] args) {
        SmellPoint p1 = new SmellPoint(1,2,"xx");
        ColorPoint p2 = new ColorPoint(1,2, Color.RED);
        p1.equals(p2);
    }
}
