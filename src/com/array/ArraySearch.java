package com.array;
import java.util.*;

public class ArraySearch {

    // LINEAR SEARCH 
    public static int linerSearch(int number[] , int key){
        for (int i = 0; i < number.length; i++) {
            if(number[i] == key)
            return i;
        }
        return -1;
    }

    // BINARY SEARCH 
    public static int binarySearch(int num[] , int key){
        int start = 0; // Corrected to index, not value
        int stop = num.length - 1;
        while (start <= stop) {
            int mid = (start+stop)/2;
            if (num[mid]==key ) {   
                return mid;        
            }
            if (num[mid] < key) {
                start = mid+1;
            }
            else{
                stop = mid-1;
            }
            
        }

        return -1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // LIEAR SEARCH
        int number[] = {2,4,6,8,10,19,14,16};
        int key = 10;
        int index = linerSearch(number, key);
        if (index == -1){
            System.out.println("Not found");
        } else{
            System.out.println("The key is at :"+index);
        }


        //BINARY SEARCH 
        int findBinSearch[] ={2,4,6,8,10,12,14};
        int key1 = 8;
        int ansBinary = binarySearch(findBinSearch, key1);
        System.out.println(findBinSearch[ansBinary]+ " at "+ ansBinary);

        sc.close();
    }
}

