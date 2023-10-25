package com.java.qa.programs;

import java.util.Arrays;

public class sortAnArray {

	public static void main(String[] args) {
		
		int[] inputArray= {3,10,2,8,6,4,1,5,9,7,4};
	
		int[] output = sortArray(inputArray);
		
		for(int i = 0 ; i < output.length ; i++) {
			
			System.out.print(output[i] + ", ");
		}
		
	}

	public static int[] sortArray(int[] input) {
		
		Arrays.sort(input);
	return input;	
	}
}
