package com.array;

import java.util.*;

public class Practice {

    // QUESTION 01 
    public static boolean valueCheck(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int check = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (check == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // QIESTION 02 
    public static int targetIndex(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    // QUESTION 03
    public static int priceWhere(int arr[]) {
        int buy = Integer.MAX_VALUE;
        int sell = Integer.MIN_VALUE;
        int maxProfit;
        for (int i = 0; i < arr.length; i++) {
            if (buy > arr[i]) {
                buy = arr[i];
            }
            if (sell < arr[i]) {
                sell = arr[i];
            }
        }
        maxProfit = sell - buy;
        return maxProfit;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // valueCheck(arr);
        int arr[] = {1, 2, 3, 6};
        System.out.println(valueCheck(arr));

        //key Trigger
        int arr01[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;
        System.out.println(targetIndex(arr01, key));

        //MAX profit
        int arr02[] = {4, 2, 1, 5, 7, 9};
        System.out.println("Max Profit :" + priceWhere(arr02));

        sc.close();
    }
}
