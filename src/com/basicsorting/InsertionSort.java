package com.basicsorting;

public class InsertionSort {

    public static void insertionSort(int arr[]){
        // Select the smallest and put it first
        for (int i = 0; i < arr.length; i++) {
           int curr = arr[i];
           int prev = i-1;
           while (prev >= 0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
           }

           // INSERTION
           arr[prev+1] = curr;
        }

    }

    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int number[] = {5,4,3,2,1};
	    insertionSort(number);
        printArr(number);
    }
}
