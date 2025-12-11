package com.codegnan.exceptions;

import java.util.Scanner;

public class NestedStringArrayMain {
	public static int nestedStringArray(String str, int index) {
        try {
            try {
                int len = str.length();          // may throw NullPointerException
                int[] arr = {1};                 // array of size 1
                int x = arr[index];              // may throw ArrayIndexOutOfBoundsException
                return len;
            } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
                return -1;
            }
        } catch (Exception e) {
            return -1;  // any unexpected exception
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int index = sc.nextInt();

        // Convert literal "null" to actual null
        if (input.equals("null")) {
            input = null;
        }

        int result = nestedStringArray(input, index);
        System.out.println(result);
    }

}
