package com.codegnan.oop.interfaces;

import java.util.Scanner;

public class ShapeMain {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(); // Dummy input, ignored

        Shape shape = new Circle();
        System.out.println(shape.getName());
    	}
  	}


