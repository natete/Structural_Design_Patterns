package com.onewingsoft.adapter;

import java.util.List;

/**
 * Created by natete on 27/10/16.
 */
public class AdapterDemo {

    public static void main(String[] args) {
        EmployeeClient client = new EmployeeClient();

        List<Employee> employees = client.getEmployeeList();

        System.out.println(employees);
    }
}
