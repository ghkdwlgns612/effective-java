package com.example.effectivejava.item10;

import com.example.effectivejava.item10.inheritance.ColorPoint;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (!(o instanceof Point))
//            return false;
//        Point p = (Point) o;
//        return p.x == x && p.y == y;
//    }

    //리스코프 치환원칙 위배
    @Override
    public boolean equals(Object o) {
        if (o == null || o.getClass() != getClass())
            return false;
        Point p = (Point) o;
        return p.x == x && p.y == y;

//        list = new Point()~~
//        Point p1 = new Point(1,2);
//        Point p2 = new ColorPoint(1,2, xx);
//        System.out.println(list.contains(p1));
//        System.out.println(list.contains(p2));
    }

}
