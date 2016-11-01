package com.onewingsoft.adapter.definition;

/**
 * Created by natete on 30/10/16.
 */
public class Adapter implements Target {

    private Adaptee instance;

    public Adapter(String param) {
        int adaptedParam;

        try {
            adaptedParam = Integer.parseInt(param);
        } catch (NumberFormatException e) {
            adaptedParam = 0;
        }

        this.instance = new Adaptee(adaptedParam);
    }

    @Override public String myMethod() {
        return Integer.toString(instance.specificMethod());
    }
}
