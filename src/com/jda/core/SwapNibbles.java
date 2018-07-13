package com.jda.core;
import java.util.Scanner;

public class SwapNibbles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println(value(BinaryConversion.binary(in.nextInt())));

	}
	public static int value(String str){

	str = (str.substring(4,8).concat(str.substring(0, 4)));
	System.out.println(str);

		int j=0, count=0;
		for(int i=7; i>=0; i--){
			if(str.charAt(i) == '1')
			    j += Math.pow(2,count);
			count++;
		}
		return j;
	}

}
