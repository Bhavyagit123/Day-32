package com.codegnan.exceptions;

import java.util.Scanner;

public class CheckPositiveMain {
	public static String checkPositive(int num) {
        if (num < 0) {
            throw new IllegalArgumentException();
        }
        return "Valid";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        try {
            String result = checkPositive(num);
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException");
        }
    }

}
