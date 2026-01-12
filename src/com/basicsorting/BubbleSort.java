package com.basicsorting;

public class BubbleSort {
    
    public static void bubbleSort(int number[]) {
        
        for (int i = 0; i < number.length-1; i++) {
            for (int j = 0; j < number.length-1-i; j++) {
                if(number[j] > number[j+1]){
                    //Swap
                    int temp = number[j];
                    number[j] = number[j+1];
                    number[j+1] = temp;

                }
            }
        }

    }

    public static void printArr(int number[]){
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int number[] = {5,4,3,2,1};
	    bubbleSort(number);
        printArr(number);

    }
}
