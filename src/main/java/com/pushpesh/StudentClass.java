package com.pushpesh;

public class StudentClass {

    private final String name;
    private final String nationality;
    private final String department;

    public StudentClass(String name) {
        this.name = name;
        nationality = "British"; // Need to initialize as this class attribute/member variable/ instance variable is private
        department = "English"; // even null initialization could have been fine
    }

    public StudentClass(String name, String nationality) {
        this.name = name;
        this.nationality = nationality;
        department = "Skiing";
    }

    public StudentClass(String name, String nationality, String department) {
        this.name = name;
        this.nationality = nationality;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public String getDepartment() {
        return department;
    }
}

/*
A class is like a blue print and we can create as many objects using that class.
A class is also referred as type and an object is also referred as instance.
We have to use the new keyword for creating an object of non-primitive data type or user defined data type.
Student raja = new Student();
Here raja is the reference which points to the Student object created using the new keyword.
Using a class, we can create many objects. For accessing any object we need a reference. Multiple references can point to the same object.
The reference can be changed to point to a new object.
A reference can be nulled (or assigned to null), so that it does not point to any object.
A class comprises various variables (or attributes). For e.g., the Student class is comprised of variables name, marks and section, the Car class is comprised of variables owner, registrationNumber, engineCC etc., These class variables are also called as instance variables or member variables or class attributes.
this is one of the java keywords and it helps in referring to the current object. When we use the dot(.) operator on this keyword, then we can access the member variables of the current object. this keyword can also be used to call one constructor from another constructors of the same class.

 */