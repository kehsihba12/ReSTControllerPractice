package com.Pattern;

public class Pattern8 {
	
	public static void main(String[] args) {
		
		int n = 7;
		int str = n/2+1;
		
		int space = 1;
		
		
		
		for(int i = 1; i<=n; i++) {
			
			for(int j= 1; j<=str;j++) {
				
				System.out.print("*");
			}
			
			for(int k = 1; k<= space; k++) {
				System.out.print(" ");
			}
			
			for(int l = 1; l<=str; l++) {
				
				System.out.print("*");
			}
			
			if(i <= n/2) {
				str = str - 1;
				space = space + 2;
			}else {
				str = str + 1;
				space = space -2;
			}
			System.out.println();
		}
		
	}

}
