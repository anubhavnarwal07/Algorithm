package com.jda.core;

import com.jda.utility.FunUtility;

public class GuessNumber {

	public static void main(String args[]) {
		String number = args[0];
		int num = Integer.parseInt(number);
		int i = 1;
		int currentnum = num / 2;
		String str;
		System.out.println("Please think of a number between 0 and" + (num - 1));
		while (i <= num / 4) {
			System.out.println("Is your number greater than or lesser than o  equals to " + currentnum);
			str = FunUtility.getString();
			if (str.equals("greater")) {
				currentnum = currentnum + num / (4 * i);

				i = 2 * i;
			}
			if (str.equals("lesser")) {
				currentnum = currentnum - num / (4 * i);
				i = 2 * i;
			}
			if (str.equals("equals")) {
				break;
			}
		}

		System.out.println("your number is " + currentnum);
	}

}
