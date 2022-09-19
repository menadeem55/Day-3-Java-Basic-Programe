package com.java.day3;

import java.util.Scanner;

public class ArrayLargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int max = arr[0];
		System.out.println("Enter "+size+" Element: ");
		for(int i=0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i=0; i < arr.length; i++) 
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
			
		}
		System.out.println("Largest: "+max);
	}
	
}	

