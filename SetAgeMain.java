package com.codegnan.exceptions;

import java.util.Scanner;

public class SetAgeMain {
	public static String setAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException();
        }
        return "Age set";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        try {
            String result = setAge(age);
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException");
        }
    }

}
