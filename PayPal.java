package com.codegnan.oop.interfaces;

public class PayPal implements PaymentProcessor {
    private double balance = 0.0;

    public void process(double amount) {
        balance += amount;
    }

    public void refund(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

}
