package ex_11_02;

import java.util.Date;

public class Employee extends Person {

    private String office;
    private double salary;
    private Date dateHired;

    public Employee(String name, String address, String phone, String email, String office, double salary) {
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = new Date();
    }

    public String toString() {
        return super.toString() + "Office " + office + "\nSalary $" + salary + "\nDate Hired " + dateHired + "\n";
    }

}
