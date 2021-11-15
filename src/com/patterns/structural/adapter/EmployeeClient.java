package com.patterns.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

    public List<Employee> getEmployeeList() {

        List<Employee> employees = new ArrayList<>();

        Employee employeeFromDb = new EmployeeDB("1234", "John", "Wich", "johnwick@gmail.com");

        employees.add(employeeFromDb);

        EmployeeLdap employeeFromLdap = new EmployeeLdap("123", "Ion", "Morari", "imorari@gmail.com");

        employees.add(new EmployeeAdapterLdap(employeeFromLdap));

        return employees;
    }
}
