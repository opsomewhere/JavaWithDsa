package com.op.introduction;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // store 5 roll numbers
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];

        // data of 5 students: {roll no, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];

        // just declaring
//        Student kunal;
//        kunal = new Student();

        Student op = new Student(15, "op somewhere", 85.4f);
        Student rahul = new Student(18, "Rahul Rana", 90.3f);



//      kunal.changeName("Shoe lover");
        op.greeting();

//
        System.out.println(op.rno);
        System.out.println(op.name);
        System.out.println(op.marks);

//      CREATING THE COPY OF THE OBJ
        Student random = new Student(op);
        System.out.println(random.name);

        Student random2 = new Student();
        System.out.println(random2.name);

        Student one = new Student();
        Student two = one;

        one.name = "Something something";

        System.out.println(two.name);
        System.out.println(one.name);

    }
}

// create a class
// for every single student
class Student {
    int rno;
    String name;
    float marks = 90;

    // we need a way to add the values of the above
    void changeName(String name) {
        this.name = name;
    }

    Student  (Student other) {
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }

    Student () {
        // this is how you call a constructor from another constructor
        // internally: new Student (13, "default person", 100.0f);
        this (13, "default person", 100.0f);
    }


    // Student arpit = new Student(17, "Arpit", 89.7f);
    // here, this will be replaced with arpit
    Student (int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    // we need one word to access every object
    void greeting() {
        System.out.println("Hello! My name is " + this.name);
    }

}

