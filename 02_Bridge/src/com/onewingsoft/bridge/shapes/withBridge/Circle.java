package com.onewingsoft.bridge.shapes.withBridge;

/**
 * Created by natete on 01/11/16.
 */
public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override public void applyColor() {
        color.applyColor();
    }
}
