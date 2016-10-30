package com.onewingsoft.adapter.definition;

/**
 * Created by natete on 30/10/16.
 */
public class Client {

    private Target myTargetInstance;

    public Client(Adaptee adapteeInstance) {
        myTargetInstance = new Adapter(adapteeInstance);

        System.out.println(myTargetInstance.myMethod());
    }
}
