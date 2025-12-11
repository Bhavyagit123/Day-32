package com.codegnan.exceptions;

import java.util.Scanner;

public class DivideNumbersMain {
	public static int divideNumbers(int a, int b) {
        try {
            return a / b;
        } finally {
            System.out.println("Log: Division attempted");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        try {
            int result = divideNumbers(a, b);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }
    }

}
