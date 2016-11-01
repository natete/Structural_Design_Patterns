package com.onewingsoft.bridge.shapes.without;

/**
 * Created by natete on 01/11/16.
 */
public class Shape1BridgeDemo {
    public static void main(String[] args) {
        /**
         * First implementation without bridge.
         * Creating a class for every combination of color and shape
         * we'd end up with a huge number of classes.
         */
        Circle circle = new BlueCircle();

        Square square = new RedSquare();

        circle.applyColor();
        square.applyColor();
        /**
         * Instead we use composition over inheritance.
         */
    }
}
