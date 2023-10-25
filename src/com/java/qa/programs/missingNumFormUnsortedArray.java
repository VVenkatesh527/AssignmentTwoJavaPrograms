package com.java.qa.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class missingNumFormUnsortedArray {

	public static void main(String[] args) {

		int[] inputArray = { 3, 10, 2, 8, 4, 1, 5, 9, 7, 4 };

		int missingnum = missingNumberArray(inputArray);

		System.out.println(missingnum);
	}

	public static int missingNumberArray(int[] input) {

		int missingnum = 0;
		int sumofnum = sumofNumber(1, 10);

		int[] outputArray = sortArray(input);

		HashSet<Integer> set = new HashSet<Integer>();

		if (outputArray.length > 1) {
			for (int i = 0; i < outputArray.length; i++) {

				set.add(outputArray[i]);
				
			}
		}
		
		ArrayList<Integer> list = new ArrayList<>(set);

		int[] outputArr = new int[list.size()];
		int sumOFinput = 0;
	
			for (int j = 0; j < outputArr.length; j++) {
				outputArr[j] = list.get(j);
				
				sumOFinput += list.get(j);
			}
		missingnum = sumofnum - sumOFinput;

		return missingnum;
	}

	public static int[] sortArray(int[] input) {

		Arrays.sort(input);
		return input;
	}

	public static int sumofNumber(int i, int num) {
		int out = 0;
			for (int j = i; j <= num; j++) {
				out += j;
			}
		return out;
	}
}
