package com.codegnan.oop.interfaces;

import java.util.Scanner;

public class PaymentProcessorMain {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        PayPal paypal = new PayPal();

        for (int i = 0; i < n; i++) {
            String command = sc.next();
            double amount = sc.nextDouble();

            if (command.equals("process")) {
                paypal.process(amount);
            } else {
                paypal.refund(amount);
            }
        }

        System.out.printf("Balance: %.2f", paypal.getBalance());
    }

}
