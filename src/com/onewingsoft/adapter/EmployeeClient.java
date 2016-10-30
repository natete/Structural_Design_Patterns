package com.onewingsoft.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by natete on 27/10/16.
 */
public class EmployeeClient {

    private List<Employee> employees;

    public EmployeeClient() {
        this.employees = new ArrayList<>();
        Employee employeeFromDB = new EmployeeDB("1234", "John", "Wick", "john@wick.com");
        EmployeeLdap employeeFromLdap = new EmployeeLdap("1234", "John", "Wick", "john@wick.com");
        EmployeeCSV employeFromCSV = new EmployeeCSV("1234,John,Wick,john@wick.com");

        this.employees.add(employeeFromDB);
        this.employees.add(new EmployeeAdapterLdap(employeeFromLdap));
        this.employees.add(new EmployeeAdapterCSV(employeFromCSV));
    }

    public List<Employee> getEmployeeList() {
        return this.employees;
    }
}
