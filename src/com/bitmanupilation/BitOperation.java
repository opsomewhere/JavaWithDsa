package com.bitmanupilation;

public class BitOperation {

    public static int getIntBit(int n, int i) {
        int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setBitInt(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }

    public static int clearBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }


    public static void main(String[] args) {
        //Bit Operations 

        /*
         * 1. Get ith bit
         * 2. Set ith bit
         * 3. Clear ith bit
         */

        /* Get ith Bit
         * bit   : [ 1 0 0 0 0 1 0]
         * index : [ 6 5 4 3 2 1 0]
         */
        System.out.println(getIntBit(10, 2));

        //Set ith Bit(USing or Operator) 
        System.out.println(setBitInt(10, 2));

        //Clear the specific bit in given(using not , and operator)
        System.out.println(clearBit(10, 1));


    }

}
