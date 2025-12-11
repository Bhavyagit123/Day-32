package com.codegnan.exceptions;

import java.util.Scanner;

public class NestedAccessMain {
	static boolean processed = false;

    public static int nestedAccess(String str, int index) {
        try {
            try {
                int len = str.length();        // may throw NullPointerException
                int[] arr = {1};               // array of size 1
                int x = arr[index];            // may throw ArrayIndexOutOfBoundsException
                return len;
            } catch (Exception e) {
                return -1;
            } finally {
                processed = true;              // finally always runs
            }
        } catch (Exception e) {
            return -1;
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

        int result = nestedAccess(input, index);

        System.out.println(processed);
        System.out.println(result);
    }

}
