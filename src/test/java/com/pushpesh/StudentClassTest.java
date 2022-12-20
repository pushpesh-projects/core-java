package com.pushpesh;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class StudentClassTest {

    @Test
    public void when_working_with_class_and_objects() {

        StudentClass petter = new StudentClass("Paul");
        StudentClass magnus = new StudentClass("Magnus", "Norwegian");
        StudentClass john = new StudentClass("John", "Swedish", "CSE");
        StudentClass pushpesh = john; // refernce pushpesh and john points to same object

        System.out.println("Student name: " + petter.getName() + " Department: " + petter.getDepartment() + " Nationality: " + petter.getNationality());
        System.out.println("Student name: " + magnus.getName() + " Department: " + magnus.getDepartment() + " Nationality: " + magnus.getNationality());
        System.out.println("Student name: " + john.getName() + " Department: " + john.getDepartment() + " Nationality: " + john.getNationality());
        System.out.println("Student name: " + pushpesh.getName() + " Department: " + pushpesh.getDepartment() + " Nationality: " + pushpesh.getNationality());

        assertThat(pushpesh.getName()).isEqualTo("John");
        assertThat(pushpesh.getNationality()).isEqualTo("Swedish");
        assertThat(pushpesh.getDepartment()).isEqualTo("CSE");


    }
}
