package com.onewingsoft.adapter;

/**
 * Created by natete on 27/10/16.
 */
public class EmployeeAdapterLdap implements Employee {

    private EmployeeLdap instance;

    public EmployeeAdapterLdap(EmployeeLdap instance) {
        this.instance = instance;
    }

    @Override
    public String getId() {
        return this.instance.getCn();
    }

    @Override
    public String getFirstName() {
        return this.instance.getGivenName();
    }

    @Override
    public String getLastName() {
        return this.instance.getSurname();
    }

    @Override
    public String getEmail() {
        return this.instance.getMail();
    }

    @Override
    public String toString() {
        return this.instance.toString();
    }
}
