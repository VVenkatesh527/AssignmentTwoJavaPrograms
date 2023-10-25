package com.java.qa.programs;

public class getNewArray {

	public static void main(String[] args) {

		int[] inputArray = { 1, 2, 3 };
		int[] arraylist = getNewArraybyMultiplyPreAndNextIPArray(inputArray);
				
		for (int i = 0; i < inputArray.length; i++) {
			
			System.out.println(arraylist[i]);
			}
			
	}

	public static int[] getNewArraybyMultiplyPreAndNextIPArray(int[] inputArray) {

		int num;
		int[] arraylist = new int[inputArray.length];
		
		for (int i = 0; i < inputArray.length; i++) {
			num = inputArray[i];
			int output = 0;
			if (num + 1 <= 3) {
				output = num * ((num + 1) + (num - 1));
				arraylist[i] = output;
			} 
			else if (num + 1 > 3){
				num = -1;
				output =inputArray[i]*((num + 1) - (num - 1));
			//	output = inputArray[i] * (num + 1) + (inputArray[i] - 1) * inputArray[i];
				arraylist[i] = output;
			}
		}
				
		return arraylist;
	}

}
