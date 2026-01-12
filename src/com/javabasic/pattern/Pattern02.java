package com.javabasic.pattern;

import java.util.*;

public class Pattern02 {

    public static void newPattern01(int row1, int col1) {
        // SOLID RECTANGULAR SHAPE
        for (int i = 1; i <= row1; i++) {
            for (int j = 1; j <= col1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void newPattern02(int row2, int col2) {
        // HOLLOW RECTANGLE
        for (int i = 1; i <= row2; i++) {
            // inner loop
            for (int j = 1; j <= col2; j++) {
                if (i == 1 || j == 1 || i == row2 || j == col2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }

    public static void newPattern03(int row3) {
        // INCREASING PYRAMID 
        for (int i = 1; i <= row3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void newPattern04(int row4) {
        // DECREASING PYRAMID 
        for (int i = 1; i <= row4; i++) {
            for (int j = i; j <= row4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void newPattern05(int row5) {
        // INVERSE OF RIGHT ANGLE TRIANGLE
        for (int i = 1; i <= row5; i++) {
            // inner loop -- space
            for (int j = 1; j <= row5 - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        //int col = sc.nextInt();
        //newPattern01(row, col);
        //newPattern02(row, col);
        //newPattern03(row);
        //newPattern04(row);
        newPattern05(row);
        sc.close();
    }
}