package com.codegnan.exceptions;

import java.util.Scanner;

public class SafeLengthMain {
	public static int safeLength(String str) {
        try {
            return str.length();
        } catch (NullPointerException e) {
            return -1;   // return -1 when string is null
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        // Convert literal "null" to actual null
        if (input.equals("null")) {
            input = null;
        }

        int result = safeLength(input);
        System.out.println(result);
    }

}
