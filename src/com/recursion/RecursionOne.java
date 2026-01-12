package com.recursion;

public class RecursionOne {
    public static void main(String[] args) {
    for (int i = 0; i <= 10; i++) {
            System.out.println();
            for (int j = 0; j < 10; j++) {
                // System.out.println(+i + "" + j);
                int num = i*10+j;
                if (num<=100) {
                    System.out.println(num);
                }
            }
        }


    }   //a
}

