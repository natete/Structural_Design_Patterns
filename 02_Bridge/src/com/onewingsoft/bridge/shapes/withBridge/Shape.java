package com.onewingsoft.bridge.shapes.withBridge;

/**
 * Created by natete on 01/11/16.
 */
public abstract class Shape {

    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract public void applyColor();
}
