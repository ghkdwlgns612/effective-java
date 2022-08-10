package com.example.effectivejava.item14.inheritance;

public class Point implements Comparable<Point>{

    final int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        return 0;
    }
}
