package com.jda.core;

import java.util.List;
import java.util.ArrayList;

public class primenumbers {
	public static boolean checkprime(int num) {
		boolean status = true;
		for (int i = 2; i * i < num; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public static boolean checkpalindrome(int x) {
		String s = Integer.toString(x);
		int arr[] = new int[s.length()];
		for (int i = 0; i < s.length(); i++) {
			arr[i] = s.charAt(i);
		}
		// for(int i=0;i<s.length();i++)
		//
		//
		for (int j = 0; j + j <= s.length() + 1; j++) {
			if (arr[j] != arr[s.length() - j - 1])
				return false;
		}
		return true;
	}

	public static void main(String args[]) {
		List<Integer> arr = new ArrayList<>(100);
		for (int num = 11; num < 1000; num++) {
			if (checkprime(num))
				arr.add(num);
		}
		System.out.println(arr);

		for (int x : arr) {
			if (checkpalindrome(x))
				System.out.println("Palindromes are " + x);
		}
	}
}
