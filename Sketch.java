package com.codegnan.oop.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Sketch implements Drawable {
    List<String> shapes = new ArrayList<>();

    public String draw(String shape) {
        shapes.add(shape);
        return "Drawing " + shape;
    }

    public String erase(String shape) {
        shapes.remove(shape); // remove if present
        return "Erasing " + shape;
    }

}
