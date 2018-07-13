package com.jda.core;
import java.util.Scanner;


public class BinaryConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println(binary(in.nextInt()));

	}
	public static String binary(int N){
		int[] num = new int[1000];
		int i=0;
		while(N > 0){
			num[i] = N % 2;
			N /= 2;
			i++;
		}
		String str = "";
		int n = 8-i;
		for(int j=0; j<n; j++)
			str += "0";
		for(int j=i-1; j>=0; j--)
			str += num[j];
		return str;
	}

}
