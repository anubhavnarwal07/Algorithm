package com.jda.utility;

import java.util.Scanner;

public class FunUtility {

	static Scanner input = new Scanner(System.in);

	public static int getInt() {
		int n = input.nextInt();
		return n;
	}
	public static int[] get1DIntArray(int n) {
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}
		return array;
	}
	public static int binarySearchString(String[] array, String key) {
		array = bubbleSortString(array);
		int l = 0;
		int r = array.length - 1;
		int m;
		while (l < r) {
			m = (l + r) / 2;
			if (array[m].compareTo(key) == 0) {
				return m;
			} else if (array[m].compareTo(key) > 0) {
				r = m;
			} else if (array[m].compareTo(key) < 0) {
				l = m;
			}
		}
		return -1;
	}
	public static String[] insertionSortString(String[] array) {
		for (int i = 1; i < array.length; i++) {
			int j = i - 1;
			String key = array[i];
			while (j >= 0 && array[j].compareTo(key) > 0) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = key;
		}
		return array;
	}
	public static String[] bubbleSortString(String[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j].compareTo(array[j + 1]) > 0) {
					String temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}
	public static float getFloat() {
	float n = input.nextFloat();
		return n;
	}
	public static String getString() {
		String string = input.next();
		return string;
	}

	public static float getTemp(float a, char f) {
		if (f == 'F' || f == 'C')
			return (a - 32) * 5 / 9;

		else
			return (a * 9) / 5 + 32;
	}
}
