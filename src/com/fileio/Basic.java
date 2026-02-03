package com.fileio;
import java.io.*;
import java.lang.Math;




class Basic {
    static void main(String[] args) {
        int arr[] = {1,2,0,3,0,4,5,0};

        int Czero =0;
        int Idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[arr.length - Czero-1] = arr[i];
                Czero++;
            } else if (arr[i] != 0){
            arr[Idx] = arr[i];
            Idx++;
            }




        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}