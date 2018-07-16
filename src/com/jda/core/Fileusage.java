package com.jda.core;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.jda.utility.FunUtility;
public class Fileusage {


	
		public static void main(String args[]) throws FileNotFoundException {
			File file = new File("/home/bridgelabz/java-program/functional-program/functional/input.csv");
			Scanner sc = new Scanner(file);
			String totalData ="";
			while (sc.hasNextLine())
			{
				totalData +=sc.nextLine()+',';
			}
			String[] allWords = totalData.split(",");
			System.out.println("Enter 1 for binary search, 2 for bubble sort, 3 for insertion sort:");
			int number = FunUtility.getInt();
			switch(number)
			{
			case 1:
			{
				System.out.print("Enter the word to search:");
				String key = FunUtility.getString();
				System.out.println(FunUtility.binarySearchString(allWords, key));
			}
			break;
			case 2:
			{
				allWords = FunUtility.bubbleSortString(allWords);
			}
			break;
			case 3:
			{
				allWords = FunUtility.insertionSortString(allWords);
			}
			}
			System.out.println("\n");
			for (int i=0; i<allWords.length; i++)
				{
				System.out.print(allWords[i]);
				}
				}
	}

