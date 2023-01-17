package org.example.patterns.adapter;

public class AdapterDemoApp {
    public static void main(String[] args) {
        //create a class adapter
        Customer customer1 =  new EmployeeClassAdapter("Peter", "Green Street, 50");
        //test state
        System.out.println(customer1.getFullName());
        System.out.println(customer1.getOfficeLocation());


        //create an adaptee employee
        Employee employee = new Employee("Peter", "Green Street, 50");
        //create an object adapter
        Customer customer2 = new EmployeeObjectAdapter(employee);
        //test state
        System.out.println(customer2.getFullName());
        System.out.println(customer2.getOfficeLocation());
    }
}
