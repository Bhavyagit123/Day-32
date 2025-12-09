package com.codegnan.oop.interfaces;

import java.util.Scanner;

public class WarriorCommandMain {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            String command = sc.nextLine().toLowerCase();

            if (command.equals("attack")) {
                System.out.println("Warrior attacks");
            } else if (command.equals("defend")) {
                System.out.println("Warrior defends");
            }
        }
    }

}
