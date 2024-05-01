package com.sorting;

public class SelectionSort {
	
	
	public static void sort(int[] arr) {
		
		int min_indx = 0;
		
		int n = arr.length;
		
		for(int i = 0; i< n ; i++) {
			
			for(int j = i+1; j<n; j++) {
				
				if(arr[j] < arr[i]) {
					min_indx = j;
				}
				
				int temp = arr[min_indx];
				arr[min_indx] = arr[i];
				arr[i] = temp;
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,3,2,5,4};
		
		sort(arr);
		
		for(int i =0 ; i<arr.length; i++) {
			
			System.out.println(arr[i] + " " );
		}
		
	}

}
