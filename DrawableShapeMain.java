package com.codegnan.oop.interfaces;

import java.util.Scanner;

public class DrawableShapeMain {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radius = sc.nextDouble();
        sc.nextLine(); // consume newline
        String command = sc.nextLine().toLowerCase();

        Circle1 circle = new Circle1(radius);

        if (command.equals("draw")) {
            System.out.println(circle.draw());
        } else {
            System.out.printf("Area: %.2f", circle.getArea());
        }
    }

}
