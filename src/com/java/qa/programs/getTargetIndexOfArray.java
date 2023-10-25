package com.java.qa.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class getTargetIndexOfArray {

	public static void main(String[] args) {

		int[] inputArray = {1,2,3,4,5,6};
		int target = 7;
		int output = getIndex(inputArray, target);
		
		System.out.println(output);
	}

	
	public static int getIndex(int[] inputArray,int target) {
			
		int output = 0;
		List<Integer> listedArray = new ArrayList<>();
	    
		if(inputArray.length<1){
			System.out.println("InputArray Length should be greater than 1 but its length-->" +inputArray.length);
		}
		else if(inputArray.length>1){
			for(int i = 0 ; i< inputArray.length ; i++ ) {
				listedArray.add(inputArray[i]);
			}
			if(listedArray.contains(target)) {
				 output = listedArray.indexOf(target);
			}
			else {
				output = -1;
				return output;
		}
		
		}
		return output;
	}
}
