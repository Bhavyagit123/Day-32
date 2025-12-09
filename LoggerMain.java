package com.codegnan.oop.interfaces;

import java.util.Scanner;

public class LoggerMain {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();
	        sc.nextLine(); // consume newline

	        FileLogger logger = new FileLogger();

	        for (int i = 0; i < n; i++) {
	            String msg = sc.nextLine();
	            logger.log(msg);
	        }

	        String clearFlag = sc.nextLine().toLowerCase();

	        if (clearFlag.equals("yes")) {
	            logger.clear();
	            System.out.println("Cleared");
	        } else {
	            System.out.println("Logged: " + logger.getMessages());
	        }
	    }

}
