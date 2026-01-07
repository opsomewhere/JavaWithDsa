package com.prep;

public class Prep01 {
    //Create a `Student` class with `name`, `age`, and fields,
    // featuring Default, Parameterized, and Copy constructors,
    // plus a `displayInfo()` method. `grade`
    public static void main(String[] args) {
        Student stu1 = new Student("Om prakash", 20,'A');
        Student stu2 = stu1;
        stu2.displayInfo();
    }
}

class Student {
    String name;
    int age;
    char grade;
    public Student(String name, int age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("--------------------");
    }
}
