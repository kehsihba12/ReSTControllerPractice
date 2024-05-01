package com.array;

public class NumberOfGreatElementInGivenArray {
	
	
	public static int maxElement(int[] arr) {
		
		int max = 0;
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {	
				max = arr[i];
			}	
		}
		for(int j = 0; j<arr.length; j++) {
			
			if(max == arr[j]) {
				count++;
			}
		}
		return arr.length - count;
	}
	public static void main(String[] args) {
		int[] arr = {3,5,6,7,7,4,3};
		int maxElement = maxElement(arr);
		System.out.println(maxElement);
		
		
	}

}
