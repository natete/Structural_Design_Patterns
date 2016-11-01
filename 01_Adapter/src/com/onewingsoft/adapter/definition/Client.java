package com.onewingsoft.adapter.definition;

/**
 * Created by natete on 30/10/16.
 */
public class Client {

    private Target myTargetInstance;

    public Client() {
        myTargetInstance = new Adapter("789");

        System.out.println(myTargetInstance.myMethod());
    }
}
