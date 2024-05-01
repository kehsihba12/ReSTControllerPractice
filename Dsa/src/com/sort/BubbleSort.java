package com.sort;

public class BubbleSort {
	
	
	public static void bubbleSort(int[] arr) {
		
		
		int n = arr.length-1;
		
		for(int i = 0; i< n ; i++) {
			
			for(int j = 1; j<n; j++) {
				
				if(arr[j] < arr[j-1]) {
					
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,4,3,2,5};
		
		bubbleSort(arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
