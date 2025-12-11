package com.codegnan.exceptions;

import java.util.Scanner;

public class NestedProcessMain {
	public static int nestedProcess(String str, int index) {
        try {
            try {
                int num = Integer.parseInt(str);   // may throw NumberFormatException
                int[] arr = {1};                  // dummy array of size 1
                int x = arr[index];               // may throw ArrayIndexOutOfBoundsException
                return num;
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                return -1;
            }
        } catch (Exception e) {
            return -1;   // any other unexpected exception
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int index = sc.nextInt();

        int result = nestedProcess(str, index);
        System.out.println(result);
    }

}
