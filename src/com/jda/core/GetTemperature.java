package com.jda.core;

import com.jda.utility.FunUtility;

public class GetTemperature {
	public static void main(String args[]) {
		float a = FunUtility.getInt();
		System.out.println("Please enter units : c for celsius and f for fahrenheit");
		String str = FunUtility.getString();
		System.out.println(FunUtility.getTemp(a, str.charAt(0)));
	}
}
