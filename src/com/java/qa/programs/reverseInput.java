package com.java.qa.programs;

public class reverseInput {

	public static void main(String[] args) {
		
	String input = "Java is Programming Language";
	
		String[] output = reverseInputString(input);
		
		System.out.println("The Given input String reversed and the resultant String is -->");
		for(int i = 0 ; i < output.length ; i++) {
			System.out.print(output[i] +" ");
		}
		
	}
	
	public static String[] reverseInputString(String input) {
		
		String[] words = input.split(" ");
		String[] output = new String[words.length];
		if(words.length>1) {
		for(int i = words.length -1,j=0 ; i >= 0; i--) {
			output[j] = words[i];
			j++;
		}
	}
	return output;
	}
		
	
}
