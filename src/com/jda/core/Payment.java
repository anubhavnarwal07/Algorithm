package com.jda.core;

import com.jda.utility.FunUtility;

public class Payment {

	public static void main(String[] args) {
		float P = FunUtility.getFloat();
		float Y = FunUtility.getFloat();
		float R = FunUtility.getFloat();
		System.out.println("the monthly pament to be made is " + payment(P, Y, R));

	}

	public static float payment(float P, float Y, float R) {
		float n = 12 * Y;
		float r = R / (12 * 100);
		float payment = P * r / (1 + (float) Math.pow(1 + r, -1 * n));
		return payment;
	}

}
