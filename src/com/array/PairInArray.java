package com.array;

public class PairInArray {
    public static void Pairs(int number[]) {
        for (int i = 0; i < number.length; i++) {
            for (int j = i+1; j < number.length; j++) {
                System.out.print("("+number[i]+" , "+number[j]+") ");
            } 
            System.out.println();
        }
        int element = number.length;
        int product = element-1; 
        System.out.println("Toatal number of pair:"+element*product/2 );
        
    }

    public static void main(String[] args) {
     /*
     * Pairs in array 
     * [2,4,6,8,10]
     * 
     * // note : pairs do not repeat 
     * (2,4)(2,6)(2,8)(2,10)   - 2 
     * (4,6)(4,8)(4,10)        - 4
     * (6,8)(6,10)             - 6
     * (8,10)                  - 8
     * 
     * Hint 
     *  .Nested loop 
     * 
     * 
     * 
     */
    int number[] = {2,4,6,8,10};
    
    Pairs(number);
    
    
    
     
    }

}
