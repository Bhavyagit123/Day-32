package com.codegnan.exceptions;

import java.util.Scanner;

public class DivideMain {
	public static int divide(int a, int b) throws ArithmeticException {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        try {
            int result = divide(a, b);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }
    }

}
