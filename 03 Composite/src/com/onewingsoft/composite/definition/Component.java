package com.onewingsoft.composite.definition;

/**
 * Created by natete on 17/11/16.
 */
public abstract class Component {

    public void operation() {
        throw new UnsupportedOperationException();
    }

    public void add(Component component) {
        throw new UnsupportedOperationException();
    }

    public void remove(Component component) {
        throw new UnsupportedOperationException();
    }

    public Component getChild(int i) {
        throw new UnsupportedOperationException();
    }
}
