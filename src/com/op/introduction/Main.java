package com.op.introduction;

public class Main{
    public static void main(String[] args) {
        //store 5 roll umber
        int[] number = new int[5];

        // store 5 names
        String[] names = new String[5];

        //Data of 5  students :{name , roll, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] mark = new float[5];
        // these are 3 different propeties which is storing data

        // here cames the consept of oops that class is named grouped of properties & funct
        // combine of funct & properties into on entities is class ,

        // We create an instance/ object of student class
        Student op = new Student(115,"Om Prakash" , 6.89f);
        // op.rno = 115;
        // op.name =" Om Prakash";
        // op.mark = 6.89f;
        System.out.println(op.name);

        // We create an another  instance/ object of student class
        Student pk = new Student(116,"Pankaj Kumar",7.9f);
        // pk.rno = 116;
        // pk.name ="Pankaj Kumar";
        // pk.mark = 7.89f;
        System.out.println(pk.name);


        //CONSTRUCTOR : jab object ban rahe hai tabhi usme
        // basically define what happen when object is being  created
        // student op = new Student(13, " omprakash " , 6.89)

        pk.changename("Paltu chacha");
        System.out.println(pk.name);
        System.out.println(op.name);


        // COPY COnstuctor
        Student random = new Student(pk);
        System.out.println(random.name+" "+ random.rno);
    }


}

// Creating a class
class Student{
    int rno ;
    String name ;
    float mark;

    // we need way tp add the value of thhe above peoperties obj by obj
    // we need one word to acess every obj
    Student(int roll, String name, float mark){
        this.rno=roll;
        this.name=name;
        this.mark=mark;
    }

    // Copy constructor
    Student (Student other){
        this.rno = other.rno;
        this.name=other.name;
        this.mark=other.mark;
    }

    void changename(String name){
        this.name = name;
    }
}

