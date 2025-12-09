package com.codegnan.oop.interfaces;

import java.util.Scanner;

public class DrawableMain {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();
	        Sketch sketch = new Sketch();

	        for (int i = 0; i < n; i++) {
	            String command = sc.next();
	            String shape = sc.next();

	            if (command.equals("draw")) {
	                System.out.println(sketch.draw(shape));
	            } else {
	                System.out.println(sketch.erase(shape));
	            }
	        }
	    }

}
