package com.jda.core;

import java.util.Arrays;

import com.jda.utility.FunUtility;

public class Anagram {
	public static void main(String args[]) {
		String string1 = FunUtility.getString();
		String string2 = FunUtility.getString();
		char[] arr1 = string1.toLowerCase().toCharArray();
		char[] arr2 = string2.toLowerCase().toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if (Arrays.equals((arr1), arr2)) {
			System.out.println("Hurrah , we caught a wild Anagram");
		} else {
			System.out.println("Oops , it was not an angram . ");
		}
	}
}