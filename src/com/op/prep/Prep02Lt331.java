package com.op.prep;

public class Prep02Lt331 {
    static void main(String[] args) {
        Solution xx = new Solution();

        System.out.println(xx.judgeSquareSum(100));

    }
}

class Solution {
    public boolean judgeSquareSum(int c) {
        for (int i = 0;i<c; i++) {
            for (int j = 0; j <i; j++) {
                if((i*i+j*j) == c){
                    System.out.println(i+" "+j);
                    return true;
                }
            }
        }
        return false;

    }
}
