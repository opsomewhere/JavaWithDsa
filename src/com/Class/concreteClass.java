package com.Class;

public class concreteClass {

//        CONCRETE CLASS :
//        Those class = create using New keyword
//        all the method in the class have implimentation
//        it can aslo be your child class from interface or extend abstract class

    public class Person{
        int empId;

        Person(int empId){
            this.empId = empId;
        }

        public int getEmpId(){
            return empId;
        }
    }

    // 2nd example
    public interface Shape{
        public void computeArea();
    }

    public class Rectangle implements Shape{
        @Override
        public void computeArea() {
            System.out.println("Rectangle compute area");
        }
    }

}
