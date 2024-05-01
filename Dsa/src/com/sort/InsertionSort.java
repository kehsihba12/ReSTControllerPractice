package com.sort;

public class InsertionSort {
	
	
	public static void insertionSort(int[] arr) {
		
		int n = arr.length-1;
		
		for(int i = 1; i <=n ; i++) {
			
			for(int j = i-1; j < n; j++) {
				
				if(arr[j] > arr[i]) {
					
				
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		int[] arr = {3,1,4,2,5};
		
		insertionSort(arr);
		for(int i = 0; i <arr.length ; i++) {
				System.out.print(arr[i] + " ");
		}
		
	}

}
