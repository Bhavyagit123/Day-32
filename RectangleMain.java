package com.codegnan.oop.interfaces;

import java.util.Scanner;

public class RectangleMain {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double length = sc.nextDouble();
        double width = sc.nextDouble();

        Shape1 rect = new Rectangle(length, width);

        System.out.printf("Area: %.2f\n", rect.area());
        System.out.printf("Perimeter: %.2f\n", rect.perimeter());
    }

}
