package com.jda.core;

import com.jda.utility.FunUtility;

public class Vending {
	private static int checknote(int num, int arr[], int count) {
		int current = 0;
		for (int i = 0; i < 7; i++) {
			if (num > arr[i] && num < arr[i + 1] || arr[i] == num) {
				current = arr[i];
				System.out.println(current + " ");
			}

			if (i == 6 && arr[7] <= num) { 
				current = arr[i + 1];
				System.out.println(current + "  ");
			}
		}

		num = num - current;
		count = count + 1; //keeps count of how many notes we need
		if (num == 0)
			return count;
		return checknote(num, arr, count);
	}

	public static void main(String args[]) {
		int array[] = new int[] { 1, 2, 5, 10, 50, 100, 500, 1000 };
		int num = FunUtility.getInt();
		int times = checknote(num, array, 0); // calls the function which tells us about the no. of notes we need
		System.out.println("no. of notes needed = " + times);
	}
}
