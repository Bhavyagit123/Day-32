package com.codegnan.oop.interfaces;

import java.util.ArrayList;
import java.util.List;

public class FileLogger implements Logger {
    List<String> messages = new ArrayList<>();

    public void log(String message) {
        messages.add(message);
    }

    public void clear() {
        messages.clear();
    }

    public List<String> getMessages() {
        return messages;
    }

}
