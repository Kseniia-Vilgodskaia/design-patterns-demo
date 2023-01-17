package org.example.patterns.adapter;

public class EmployeeObjectAdapter implements Customer{
    private Employee employee;

    public EmployeeObjectAdapter(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String getFullName() {
        return employee.getName();
    }

    @Override
    public String getOfficeLocation() {
        return employee.getAddress();
    }
}
