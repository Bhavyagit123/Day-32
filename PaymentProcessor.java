package com.codegnan.oop.interfaces;

public interface PaymentProcessor {
	void process(double amount);
    void refund(double amount);
    double getBalance();

}
