package org.example.patterns.adapter;

public class EmployeeClassAdapter extends Employee implements Customer{

    public EmployeeClassAdapter(String name, String address) {
        super(name, address);
    }

    @Override
    public String getFullName() {
        return getName();
    }

    @Override
    public String getOfficeLocation() {
        return getAddress();
    }
}
