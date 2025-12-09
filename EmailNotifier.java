package com.codegnan.oop.interfaces;

public class EmailNotifier implements Notifier{
	public String send(String message) {
        return "Email: " + message;
    }

}
