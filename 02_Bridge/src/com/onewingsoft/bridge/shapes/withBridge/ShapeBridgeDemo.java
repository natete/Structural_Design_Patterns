package com.onewingsoft.bridge.shapes.withBridge;

/**
 * Created by natete on 01/11/16.
 */
public class ShapeBridgeDemo {
    public static void main(String[] args) {
        /**
         * We want to make Color and Shapes to be independent to each other
         *
         */
        Color blue = new Blue();

        Shape square = new Square(blue);

        Color red = new Red();

        Shape circle = new Circle(red);

        Color green = new Green();

        Shape greenCircle = new Circle(green);

        square.applyColor();
        circle.applyColor();
        greenCircle.applyColor();
    }
}
