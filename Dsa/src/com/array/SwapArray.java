package com.array;

public class SwapArray {
	
	
	public static void swap(int[] arr,int s ,int e) {
		while(s<e) {
			int temp = arr[s];
			arr[s] = arr[e];
			arr[e] = temp;
			s++;
			e--;
		}	
	}
	public static void main(String[] args) {
		int[] arr = {3,-2,1,4,6,9,8};
		int s = 0;
		int e = arr.length-1;
		int k = 3;
		k = k % arr.length;
		swap(arr,s,e);
		swap(arr,0,k-1);
		swap(arr,k,arr.length-1);
		for(int i = 0 ; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
