package com.array;

public class MaxSubarraySumPrefix {

	public static void maxSubArrayPrefix(int number[]) {
		int currSum = 0;
		int maxSum = Integer.MIN_VALUE;
		int prefix[] = new int[number.length];

		
		//Calculate prefix array
		prefix[0] = number[0];
		for (int i = 1; i < prefix.length; i++) {
			prefix[i] = prefix[i-1]+number[i];
		}


		for (int i=0; i<number.length; i++ ) {
			int start = i;
			for (int j=i; j<number.length; j++ ) {
				int end = j;
				currSum = start == 0 ? prefix[end]: prefix[end]-prefix[start-1];
				System.out.println(currSum + " ..["+number[i] + ","+ number[j] +"]");
				if (maxSum < currSum) {
					maxSum=currSum ;
				}
			}

		}

		System.out.println(" max sum = " + maxSum);

	}

	public static void main(String[] args) {
		System.out.println("Hello World");

		int number[] = {2,4,6,8,10};
		maxSubArrayPrefix(number);
	}
    
}
