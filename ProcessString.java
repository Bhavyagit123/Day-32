package com.codegnan.exceptions;

import java.util.Scanner;

public class ProcessString {
	static boolean resourceReleased = false;

    public static int processString(String str) {
        try {
            return str.length();
        } finally {
            resourceReleased = true;  // finally block always runs
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        // Convert literal "null" to actual null
        if (input.equals("null")) {
            input = null;
        }

        try {
            int result = processString(input);
            System.out.println(result);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }

        System.out.println(resourceReleased);
    }

}
