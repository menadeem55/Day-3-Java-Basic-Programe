package com.java.day3;

public class ArraySortElementsAscendingOrder {

	public static void main(String[] args) {
		
		int[]array = new int[] {9, 8, 6, 7, 1};
		int temp = 0;
				
		System.out.println("Element of Original Array:	");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		for (int i = 0; i<array.length; i++) {
			for (int j = i+1; j<array.length; j++) {
				if(array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}

			}
		}
		
				// System.out.print("\n"); (confusion here how to print in the same line.
		
		
				System.out.println("\nElement of array sorted in accending order");
				for (int i = 0; i < array.length; i++) {
					System.out.println(array[i] );
		}
		

	}

}
