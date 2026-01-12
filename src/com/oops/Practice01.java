package com.oops;

import java.util.*;


public class Practice01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Question : Sum/Diff of complex number");
        // System.out.println("Complex number : a+ib + c+id");
        int operation = 0;
        complex number = new complex();
        while (operation != 3) {
            System.out.println("\nPlease enter the values of two complex number:");
            System.out.println("(a+ib)+(c+id): enter values only & for exit type = 3");
            System.out.print("a :");
            number.aReal = sc.nextInt();
            System.out.print("b :");
            number.bImg = sc.nextInt();
            System.out.print("c :");
            number.cReal = sc.nextInt();
            System.out.print("d :");
            number.dImg = sc.nextInt();
            System.out.println("(" + number.aReal + "+" + number.bImg + "i)+ (" + number.cReal + "+" + number.dImg + "i)");

            System.out.println("\nPlease enter Operation : \n 1) Addition \n 2) Substraction \n 3) exit");
            operation = sc.nextInt();
            switch (operation) {
                case 1:
                    number.sum();
                    break;

                case 2:
                    number.difference();
                    break;

            }


        }

        sc.close();
    }
}

class complex {
    int aReal;
    int bImg;
    int cReal;
    int dImg;

    void sum() {
        int tReal = aReal + cReal;
        int tImg = bImg + dImg;
        System.out.println("Real part is : " + tReal + "\nimaginary part is : " + tImg + "i");
    }

    void difference() {
        int tReal = aReal - cReal;
        int tImg = bImg - dImg;
        System.out.println("Real part is : " + tReal + "\nimaginary part is : " + tImg + "i");
    }
}