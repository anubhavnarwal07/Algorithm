package com.jda.core;
import java.util.Scanner;
import com.jda.utility.FunUtility;
import com.jda.utility.Utility;
public class InsertionSortStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = FunUtility.getString();
		long now = System.currentTimeMillis();
		int arr[] = Utility.toInt(str);
		arr = InsertionSort.insertion(arr, str.length());
		String str2 = "";
		for(int i=0; i<str.length(); i++)
			str2 += (char)((int)'A' + arr[i]);
		System.out.println(str2);
		System.out.println("The time elasped is " + (System.currentTimeMillis()-now)/1000.0);
	}

}
