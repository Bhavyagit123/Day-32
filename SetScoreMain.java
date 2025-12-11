package com.codegnan.exceptions;

import java.util.Scanner;

public class SetScoreMain {
	public static String setScore(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException();
        }
        return "Score set";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        try {
            String result = setScore(score);
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException");
        }
    }

}
