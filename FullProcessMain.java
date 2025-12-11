package com.codegnan.exceptions;

import java.util.Scanner;

public class FullProcessMain {
	 public static int fullProcess(String str, int divisor) {
	        try {
	            int num = Integer.parseInt(str);   // may throw NumberFormatException
	            return num / divisor;              // may throw ArithmeticException
	        } catch (Exception e) {
	            return 0;                          // return 0 for any exception
	        } finally {
	            System.out.println("Logged");      // always printed
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        String str = sc.nextLine();
	        int divisor = sc.nextInt();

	        int result = fullProcess(str, divisor);
	        System.out.println(result);
	    }

}
