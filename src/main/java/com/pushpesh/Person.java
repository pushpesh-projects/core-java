package com.pushpesh;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void getHobby(){
        System.out.println("All persons have some sort of hobby");
    }

    public void getPersonality(){
        System.out.println("All persons have unique personality");
    }
}
