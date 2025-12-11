package com.codegnan.exceptions;

import java.util.Scanner;

public class CheckNonEmptyMain {
	 public static String checkNonEmpty(String str) {
	        if (str == null || str.isEmpty()) {
	            throw new IllegalArgumentException();
	        }
	        return "Non-empty";
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String input = sc.nextLine();

	        // Convert literal "null" to actual null
	        if (input.equals("null")) {
	            input = null;
	        }

	        try {
	            String result = checkNonEmpty(input);
	            System.out.println(result);
	        } catch (IllegalArgumentException e) {
	            System.out.println("IllegalArgumentException");
	        }
	    }

}
