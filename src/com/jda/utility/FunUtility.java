package com.jda.utility;

import java.util.Scanner;

public class FunUtility {

	static Scanner input = new Scanner(System.in);

	public static int getInt() {
		int n = input.nextInt();
		return n;
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
