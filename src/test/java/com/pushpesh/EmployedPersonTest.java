package com.pushpesh;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class EmployedPersonTest {

    @Test
    // Subclass object can access sub-lass and parent class attributes and methods
    public void object_of_sub_class(){
        EmployedPerson employedPerson = new EmployedPerson("Petter",25,"739AB","BANK");
        System.out.println("Name: "+employedPerson.getName());
        System.out.println("Age: "+employedPerson.getAge());
        System.out.println("Emp No: "+employedPerson.getEmpNo());
        System.out.println("Department: "+employedPerson.getDepartment());

        assertThat(employedPerson.getName()).isEqualTo("Petter");
        assertThat(employedPerson.getAge()).isEqualTo(25);
        assertThat(employedPerson.getEmpNo()).isEqualTo("739AB");
        assertThat(employedPerson.getDepartment()).isEqualTo("BANK");

        employedPerson.getHobby(); // calling subclass version of this method

        // calling parent class method. It is allowed as subclass objects has access to parent class methods
        employedPerson.getPersonality();

        employedPerson.getSalary(); // calling method only present in subclass
    }

    @Test
    public void object_of_parent_class(){
        Person person = new Person("John", 35);
        System.out.println("Name "+person.getName());
        System.out.println("Age "+person.getAge());
        person.getHobby(); // calling parent class version of this method
        person.getPersonality(); // calling method only present in super class
    }

    @Test
    public void reference_of_parent_class_object_of_sub_class(){
        Person person = new EmployedPerson("Erik", 40, "7689ED", "Cards");
        System.out.println(person.getName());
        System.out.println(person.getAge());
        person.getHobby(); // Calls the method from subclass
        person.getPersonality(); // Calls the method from parent class
    }



/*
Inheritance helps to separate out common data and behavior (or member variables and methods) from multiple related classes.
 */
}
