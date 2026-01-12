package com.recursion;

public class Recursion {

    // DECRESEING ORDER RECURSION  
    public static void printNext(int n){
        if (n==1) {
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printNext(n-1);
    }

    // INCREASING ORDER RECUESION
    public static void printNumInc(int n){
        if (n == 1) {
            System.out.print(n+" ");
            return;
        }
        printNumInc(n-1);
        System.out.print(n+" ");
        
    }

    // PRINTING FACTORIAL OF NUMBER N 
    public static int factorial(int n){
        if (n==0) {
            return 1;
        }
        int fnm1 =factorial(n-1);
        int fn = n*fnm1;

        return fn;
    }

    // PRINTING SUM OF NATURAL NUMBER
    public static int naturalNoSum(int n){
        if (n==1){
            return 1;
        }
        int sumof1 = naturalNoSum(n-1);
        int sum = n+sumof1;

        return sum;
    }

    // CALCULATING FEBONACCHI SERIES
    public static int fib(int n){
        if (n == 0 || n == 1) {
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1+fnm2;
        return fn;
    }
    public static void main(String[] args) {
        int n=10;
        int n2 = 5;

        //PRINT NUMBER IN DECREASING ORDER
        printNext(n);
        
        //PRINTING NUMBER IN INCREASING ORDER
        printNumInc(n2);

        // factorial(n2);
        System.out.println(factorial(n2));

        // SUM OF NATURAL NUMBER
        System.out.println(naturalNoSum(n2));

        // FEBONACCHI SERIES
        System.out.println(fib(5));

        


    }
}
  