package com.codegnan.oop.interfaces;

import java.util.Scanner;

public class CalculatorMain {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        Calculator calc = new BasicCalculator();
        System.out.println(calc.add(a, b));
    }

}
