package com.java.qa.programs;


public class sortAnArray {

	public static void main(String[] args) {
		
		int[] inputArray= {3,10,2,8,6,4,1,5,9,7,4};
	
		int[] output = sortArray(inputArray);
		
		for(int i = 0 ; i < output.length ; i++) {
			
			System.out.print(output[i] + " ");
		}
		
	}

public static int[] sortArray(int[] input) {
	
		int[] output = new int[input.length];
		for(int i = 0 ; i<input.length ; i++) {
			for(int j =i+1; j<input.length ; j++) {
				int temp = 0 ;
				if(input[i] > input[j]) {
					
					temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
				
			}
			output[i] = input[i];
		}
		return output;
		
	}

}
