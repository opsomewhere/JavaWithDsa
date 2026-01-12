package com.array;

public class ReverseArray {

    // REVERSE OF AN ARRAY
    public static void reverse(int number[]) {

        //Using for loop
        int last = number.length-1;
        for (int first=0; first< last; first++){
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;
            last--;
        }
        
        //using while loop 
        // while (first<last) {
        //     int temp = number[last];
        //     number[last] = number[first];
        //     number[first] = temp;
        //     first++;
        //     last--;
        // }

    }

    public static void main(String[] args) {
       int arr[] = {2,3,4,5,6};
       reverse(arr);

       for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
       }
       System.out.println();
    }
}