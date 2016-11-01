package com.onewingsoft.adapter;

import java.util.IntSummaryStatistics;

/**
 * Created by natete on 27/10/16.
 */
public class EmployeeAdapterCSV implements Employee {

    private final EmployeeCSV instance;

    public EmployeeAdapterCSV(EmployeeCSV instance) {
        this.instance = instance;
    }

    @Override public String getId() {
        return Integer.toString(this.instance.getId());
    }

    @Override public String getFirstName() {
        return this.instance.getFirstname();
    }

    @Override public String getLastName() {
        return this.instance.getLastname();
    }

    @Override public String getEmail() {
        return this.instance.getEmailAddress();
    }

    @Override public String toString() {
        return "EmployeeDB{" + "id='" + getId() + '\'' + ", firstName='" + getFirstName() + '\'' + ", lastName='"
                + getLastName() + '\'' + ", email='" + getEmail() + '\'' + '}';
    }
}
