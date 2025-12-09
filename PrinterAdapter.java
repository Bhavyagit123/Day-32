package com.codegnan.oop.interfaces;

public class PrinterAdapter implements ModernPrinter {
    private LegacyPrinter legacyPrinter = new LegacyPrinter();

    public String printModern(String message) {
        return legacyPrinter.printLegacy(message);
    }

}
