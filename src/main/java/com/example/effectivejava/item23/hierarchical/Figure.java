package com.example.effectivejava.item23.hierarchical;

abstract public class Figure {
    abstract double area();
}

class Circle extends Figure {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.sqrt(radius) * Math.PI;
    }
}

class Rectangle extends Figure {

    private final double length;

    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}
