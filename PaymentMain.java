package com.codegnan.oop.interfaces;

import java.util.Scanner;

public class PaymentMain {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double amount = sc.nextDouble();
        double balance = sc.nextDouble();

        Payment payment = new CreditCard();

        if (payment.pay(amount, balance)) {
            System.out.println("Payment Successful");
        } else {
            System.out.println("Insufficient Balance");
        }
    }

}
