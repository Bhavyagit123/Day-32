package com.codegnan.oop.interfaces;

import java.util.Scanner;

public class ValidatorMain {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Validator validator = new PositiveNumberValidator();

        if (validator.isValid(n)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }

}
