package com.jda.core;

import java.util.Scanner;

public class SquareRoot {
	public static double epsilon = Math.pow(10, -15);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println(sqrt(in.nextDouble()));
	}
	public static double sqrt(double c){
		double t = c;
		while(Math.abs(t- c/t) > epsilon*t){
			t = (c/t + t)/2;
		}
		return t;
	}

}
