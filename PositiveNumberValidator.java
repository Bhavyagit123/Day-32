package com.codegnan.oop.interfaces;

public class PositiveNumberValidator implements Validator {
    public boolean isValid(int n) {
        return n > 0;
    }
}



