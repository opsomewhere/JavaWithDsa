package com.array;

public class SubArray {
     
    public static void printSubArray(int number[]){
        for (int i = 0; i < number.length; i++) {
            for (int j = i; j < number.length; j++) {
                int sum = 0;
                int max = Integer.MAX_VALUE;
                int min = Integer.MIN_VALUE;
                for (int k = i; k <= j; k++) {
                    if (number[k] > min){
                        min = number[k];
                    }
                    if(number[k]<max){
                        max = number[k];
                    }
                    sum = number[k] + sum;
                    System.out.print(number[k] + " ");
                }
                System.out.println( "(" + "sum -> "+sum +", Max:Min ->"+ max+":"+min   +")");
                System.out.println();
            }
            System.out.println();
        }
        
    }

	public static void main(String[] args) {
		// System.out.println("Hello World");
		
        //  Print sub array -  [2,4,6,8,10]
        //  - sub array - a continuous part of array
        //  - [2] - [2,4] - [2,4,6] - [2,4,6,8] - [2,4,6,8,10]
        //  - [4] - [4,6] - [4,6,8] - [4,6,8,10]
        //  - [6] - [6,8] - [6,8,10]
        //  - [8] - [8,10]
        //  - [10]
        
        // * 3 nested loop require
        // 1 loop - finding start
        // 2 loop - finding end
        // 1 loop - printing number between start and end
        
        int number[] = {2, 4, 6, 8, 10};
        // System.out.println(number[4]);
        printSubArray(number);
        
        
	}
}
