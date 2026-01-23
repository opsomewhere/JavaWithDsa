package com.op.prep;

public class Perp01 {


//        Problem 1: The "Student" Class (Constructor Overloading)
//        Ek Student class banayein jisme ye properties hon: name (String), age (int), aur grade (char).
//        Task:
//        Ek Default Constructor banayein jo default values set kare (e.g., Name: "Unknown", Age: 0, Grade: 'N').
//        Ek Parameterized Constructor banayein jo name aur age le.
//        Ek aur Constructor banayein jo dusre Student object ko as a parameter le aur uski values copy kare (Copy Constructor).
//        displayInfo() method banayein jo details print kare.
    static void main(String[] args) {
        Student stu1 = new Student("Om Prakash", 20, 'A');
        Student stu2 = stu1;
        stu2.displayInfo();
    }
}

class Student{
    String name;
    int age;
    char grade;
    Student(String name, int age, char grade){
        this.name = name;
        this.age = age;
        this.grade= grade;
    }

    public void displayInfo(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Grade : " + grade);
    }
}
