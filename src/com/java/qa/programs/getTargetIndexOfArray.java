package com.java.qa.programs;

import java.util.ArrayList;
import java.util.List;

public class getTargetIndexOfArray {

	public static void main(String[] args) {

		int[] inputArray = {1,2,3,4,5,6};
		int[] input = sortArray(inputArray);
		int target = 2;
		int[] output = getIndex(input, target);
		for(int i = 0 ;i < output.length ; i++) {
		System.out.println(output[i] );
		}
	}

	
	public static int[] getIndex(int[] inputArray,int target) {
			
		int[] output = new int[2];
		int firstElement = 0;
		int lastElement = 0;
		List<Integer> listedArray = new ArrayList<>();
	    
		if(inputArray.length<1){
			System.out.println("InputArray Length should be greater than 1 but its length-->" +inputArray.length);
		}
		else if(inputArray.length>1){
			for(int i = 0 ; i< inputArray.length ; i++ ) {
				listedArray.add(inputArray[i]);
			}
			if(listedArray.contains(target)) {
				
				firstElement = listedArray.indexOf(target);
				lastElement = listedArray.indexOf(target);
			}
			else {
				firstElement = -1;
				lastElement = -1;
				}
		}
		output[0] = firstElement;
		output[1] =lastElement;
		return output;
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
