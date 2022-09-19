package com.java.day3;
	public class Frequency {  
		public static void main(String[] args) {  

			int [] array = new int [] {1, 2, 8, 3, 2,9,2,2,1,1,9,9, 2, 2, 5, 1};  
    
			int [] fr = new int [array.length];  
			int visited = -1;  
			for(int i = 0; i < array.length; i++){  
				int count = 1;  
				for(int j = i+1; j < array.length; j++){  
					if(array[i] == array[j]){  
						count++;  
               
						fr[j] = visited;  
				}  
			}  
					if(fr[i] != visited)  
						fr[i] = count;  
			}
     
			System.out.println("Element | Frequency");  
     
    		for(int i = 0; i < fr.length; i++){  
    		if(fr[i] != visited)  
            System.out.println(+ array[i] + "  =   " + fr[i]);  
    		}  
    
		}
}  