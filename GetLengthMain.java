package com.codegnan.exceptions;

import java.util.Scanner;

public class GetLengthMain {
	public static int getLength(String str) throws NullPointerException {
        try {
            return str.length();
        } catch (NullPointerException e) {
            throw new NullPointerException();
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
            int len = getLength(input);
            System.out.println(len);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }
    }

}
