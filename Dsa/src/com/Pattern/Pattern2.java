package com.Pattern;

public class Pattern2 {
	
	public static void main(String[] args) {
		
		
		int R = 10;
		int c = 5;
		
		
		for(int i=1; i<=R ;i++) {
			
			
			for(int j=1; j <= c; j++) {
				
				if(i == 1 || i == R || j == 1 || j == c) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
	}

}
