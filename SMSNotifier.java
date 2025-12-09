package com.codegnan.oop.interfaces;

public class SMSNotifier implements Notifier {
    public String send(String message) {
        return "SMS: " + message;
    }

}
