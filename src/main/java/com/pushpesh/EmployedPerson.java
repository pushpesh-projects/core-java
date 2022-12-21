package com.pushpesh;

public class EmployedPerson extends Person{

    String empNo;
    String department;

    public EmployedPerson(String name, int age, String empNo, String department) {
        super(name, age);
        this.empNo = empNo;
        this.department = department;
    }

    public String getEmpNo() {
        return empNo;
    }

    public String getDepartment() {
        return department;
    }

    // Below method is over ridden
    @Override
    public void getHobby(){
        System.out.println("Employees have special hobby");
        super.getHobby(); // Using super keyword we can use the parent class version of method
    }

    public void getSalary(){
        System.out.println("All employees get salary");
    }
}
