package com.array;

public class TwoSum {
	
	
	public static void main(String[] args) {
		
		int[] arr = {3,5,2,7,5};
		int k = 12;
		int[] arr1= twoSum(arr, k);
		for(int i= 0; i<arr1.length; i++)
		{	
			System.out.print(arr[i] + "  ");
		}
	}
	public static int[] twoSum(int[] arr, int k){
		int[] arr1 = {-1,-1};
		for(int i = 0; i<arr.length-1; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i] + arr[j] == k) {
					arr[0] = i;
					arr[1] = j;
					return arr1;	
				}
			}
		}
		return arr1;
	}
}
