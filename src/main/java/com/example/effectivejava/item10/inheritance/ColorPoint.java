package com.example.effectivejava.item10.inheritance;

import com.example.effectivejava.item10.Color;
import com.example.effectivejava.item10.Point;

import java.util.ArrayList;


//상속 시 필드가 추가되었다? 그러면 equals를 만족시킬 수 없다. 그래서 Composition을 권장한다.
//상속을 하지말고 하나의 필드를 추가한다.
public class ColorPoint extends Point {

    private final Color color;
    private final Point point;

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ColorPoint))
            return false;
        ColorPoint cp = (ColorPoint) o;
        return cp.point.equals(point) && cp.color.equals(color);
    }

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    public static void main(String[] args) {
//        Point point = new Point(1,2);
//        List<Point> points = new ArrayList<>();
//        points.add(point);
//        System.out.println(point);
//    }

    //대칭성 위배
//    @Override
//    public boolean equals(Object o) {
//        if (!(o instanceof ColorPoint))
//            return false;
//        return super.equals(o) && ((ColorPoint) o).color == color;
//
////        Point p = new Point(1,2);
////        ColorPoint cp = new ColorPoint(1,2,Color.RED);
////        System.out.println(p.equals(cp) +  " " + cp.equals(p)); true false
//    }

//    //추이성 위배(타입까지 고려한 equals)
//    @Override
//    public boolean equals(Object o) {
//        if (!(o instanceof Point))
//            return false;
//
//        //o가 일반 Point면 색상을 무시하고 비교한다.
//        if (!(o instanceof ColorPoint))
//            return o.equals(this);
//
//        //o가 ColorPoint면 색상까지 비교한다.
//        return super.equals(o) && ((ColorPoint) o).color == color;
//
////        ColorPoint p1 = new ColorPoint(1,2,Color.RED);
////        Point p2 = new Point(1,2);
////        ColorPoint p3 = new ColorPoint(1,2,Color.BLUE);
////        System.out.printf("%s %s %s%n", p1.equals(p2), p2.equals(p3), p1.equals(p3)); true true false
//    }



}
