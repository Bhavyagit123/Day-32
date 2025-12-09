package com.codegnan.oop.interfaces;

import java.util.Scanner;

public class PrinterMain {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        String message = sc.nextLine();

	        ModernPrinter printer = new PrinterAdapter();
	        System.out.println(printer.printModern(message));
	    }

}
