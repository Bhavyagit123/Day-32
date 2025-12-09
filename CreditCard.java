package com.codegnan.oop.interfaces;

public class CreditCard implements Payment {
    public boolean pay(double amount, double balance) {
        return amount <= balance;
    }

}
