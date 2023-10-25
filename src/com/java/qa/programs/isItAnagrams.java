package com.java.qa.programs;

public class isItAnagrams {

	
	public static void main(String[] args) {
		
		String input1 = "Silent";
		String input2 = "Listen";
		boolean flag = givenInputIsAnagramOrNot(input1, input2);
		if (flag==true) {
			System.out.println("The given Input String "+ input1 +" is Anagram of "+ input2 +" ");
		}
		else {
		System.out.println("The given Input String "+ input1 +" is not Anagram of "+ input2 +" ");
		}
	}
	
	public static boolean givenInputIsAnagramOrNot(String input1,String input2) {
		
		boolean flag = false;
		
		input1= input1.toLowerCase();
		input2 = input2.toLowerCase();
		
		if(input1.length()==input2.length()) {
		
		for(int i = 0 ; i < input1.length() ; i++) 
			for(int j = 0 ; j < input2.length() ; j++) 
				if(input1.charAt(i) ==input2.charAt(j)) {
					flag = true;
				}
	}
	else {
		System.out.println("The given input Strings are not Anagrams");
	return flag;
	}
		return flag;
	}
}	
			
