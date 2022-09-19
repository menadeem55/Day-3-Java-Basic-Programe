package com.java.day3;

import java.util.Scanner;

public class ReverseArrayElement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		int[] number = new int[size];
		System.out.println("Enter Array Elements: ");
		for(int i=0; i<size; i++)
		{
			number[i] = sc.nextInt();
		}
		System.out.println("Reversed Array Element: ");
		for(int i=size-1; i>=0; i--)
		{
			System.out.println(number[i]+" ");
		}
	
	}

}
