package com.jda.core;
import com.jda.utility.FunUtility;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class InsertionStrings {
	public static String[] insertionSort(String[] strs, int N){
		for(int i=0; i<N-1; i++){
			for(int j=i; j<N; j++){
				if(strs[i].compareTo(strs[j]) > 0){
					String str = strs[i];
					strs[i] = strs[j];
					strs[j] = str;
				}
			}
		}
		return strs;
	}
public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
int i=0;
		int N = FunUtility.getInt();
		String strs[] = new String[N];
		File f = new File("/home/bridgelabz/Desktop/introduction.txt");
		Scanner sc = new Scanner(f);
		while(sc.hasNextLine())
		{strs[i] =sc.nextLine();
		i++;
		}
 strs = insertionSort(strs, N);
		for( i=0; i<N; i++)
			System.out.print(strs[i] + " ");
		System.out.println();
}
}
