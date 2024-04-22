package com.Pattern;

public class Pattern5 {
	
	
	public static void main(String[] args) {
		
		
		
		int n = 5;
		
		
		for(int i = 1; i<=n; i++) {
			char a = 'A';
			for(int j = 1; j<=i; j++) {
				
				System.out.print(a);
				a++;
				
			}
			a--;
			for(int k = 1; k<=i-1; k++) {
				
				System.out.print(--a);
			}
			
			System.out.println();
		}
		
		
	}

}
