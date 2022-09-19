package com.java.day3;

import java.util.Scanner;

public class PrintArrayElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter array Element: ");
		for(int i=0; i<arr.length; i++)
		{
				arr[i] =sc.nextInt();
		}
		for(int i=0; i<size; i++)
		{
			System.out.println("array Elements: "+arr[i]+"");
		}

	}

}
