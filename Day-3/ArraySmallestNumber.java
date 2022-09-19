package com.java.day3;

public class ArraySmallestNumber {

	public static void main(String[] args) {
		int[] arr = new int[]{25,32,-15,-99,55,489,-999};
		int min = arr[0];
		System.out.println("Array Elements are: ");
		for(int i=0; i<arr.length; i++);
		{
			// System.out.println("[i]");
		}
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] < min)
				min=arr[i];
		}
		System.out.println("\nSmallest Element: "+min);
		}
	
		
	}


