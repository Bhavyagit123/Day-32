package com.codegnan.oop.interfaces;

public class Circle1 implements DrawableShape {
    double radius;

    Circle1(double radius) {
        this.radius = radius;
    }

    public String draw() {
        return "Drawing Circle";
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

}
