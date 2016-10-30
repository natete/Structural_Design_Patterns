package com.onewingsoft.adapter.definition;

/**
 * Created by natete on 30/10/16.
 */
public class Adaptee {

    private int myVar;

    public int specificMethod() {
        return this.getMyVar();
    }

    public int getMyVar() {
        return myVar;
    }

    public void setMyVar(int myVar) {
        this.myVar = myVar;
    }
}
