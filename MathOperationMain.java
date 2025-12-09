package com.codegnan.oop.interfaces;

import java.util.*;

public class MathOperationMain {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        MathOperation op = new Square();
        System.out.println(op.operate(n));
    }

}
