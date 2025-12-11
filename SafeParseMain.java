package com.codegnan.exceptions;

import java.util.Scanner;

public class SafeParseMain {
	public static int safeParse(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return 0;  // return 0 when invalid
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int result = safeParse(input);
        System.out.println(result);
    }

}
