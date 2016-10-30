package com.onewingsoft.adapter.definition;

/**
 * Created by natete on 30/10/16.
 */
public class Adapter implements Target {

    private Adaptee instance;

    public Adapter(Adaptee instance) {
        this.instance = instance;
    }

    @Override
    public String myMethod() {
        return Integer.toString(instance.specificMethod());
    }
}
