package com.java.day3;

import java.util.Scanner;

public class ArrayEvenIndexElement {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter size of Array: ");
		 
		 int size = sc.nextInt();
		 
		 int[] number = new int[size];
		 
		 System.out.println("Enter "+size+" Element: ");
		 
		 for(int i=0; i<number.length; i++)
		 {
			 number[i]=sc.nextInt();
		 }
		 for(int i=0; i<number.length; i++)
		 {
			 if(i % 2 == 0)
				 System.out.println("Even Element: "+number[i]);
		 }

	}

}
