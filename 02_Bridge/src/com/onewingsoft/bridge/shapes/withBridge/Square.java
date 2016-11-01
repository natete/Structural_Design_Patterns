package com.onewingsoft.bridge.shapes.withBridge;

/**
 * Created by natete on 01/11/16.
 */
public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    @Override public void applyColor() {
        color.applyColor();
    }
}
