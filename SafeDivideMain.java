package com.codegnan.exceptions;

import java.util.Scanner;

public class SafeDivideMain {
	public static int safeDivide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            return 0;   // return 0 if division by zero happens
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = safeDivide(a, b);
        System.out.println(result);
    }

}
