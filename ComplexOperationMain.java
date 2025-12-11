package com.codegnan.exceptions;

import java.util.Scanner;

public class ComplexOperationMain {
	public static int complexOperation(String str, int index) throws Exception {
        int[] arr = {1}; // dummy array

        try {
            int num = Integer.parseInt(str); // may throw NumberFormatException
            if (index < 0 || index >= arr.length) {
                throw new ArrayIndexOutOfBoundsException(); // explicitly throw
            }
            int x = arr[index]; // access array
            return num;
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            return -1; // multi-catch handles both exceptions
        } finally {
            // finally block could be used for logging if needed
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int index = sc.nextInt();

        try {
            int result = complexOperation(str, index);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(-1); // fallback, though multi-catch handles expected exceptions
        }
    }

}
