package com.codegnan.oop.interfaces;

import java.util.Scanner;

public class NotifierMain {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String message = sc.nextLine();
        String type = sc.nextLine().toLowerCase();

        Notifier notifier;

        if (type.equals("email")) {
            notifier = new EmailNotifier();
        } else {
            notifier = new SMSNotifier();
        }

        System.out.println(notifier.send(message));
    }

}
