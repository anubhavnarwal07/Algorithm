package com.jda.core;
import com.jda.utility.FunUtility;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int N = FunUtility.getInt();
		int arr[] = new int[N];
		for(int i=0; i<N; i++)
			arr[i] = FunUtility.getInt();
		long now = System.currentTimeMillis();
		arr = insertion(arr, N);
		for(int i=0; i<N; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		System.out.println("The time elasped is " + (System.currentTimeMillis()-now)/1000.0);

	}
	public static int[] insertion(int [] arr, int N){
		for(int i=0; i<N-1; i++){
			for(int j=i+1; j<N; j++){
				if(arr[i] > arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
}
