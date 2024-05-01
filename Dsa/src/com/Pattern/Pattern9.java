package com.Pattern;

import java.util.Iterator;

public class Pattern9 {
	
	public static void main(String[] args) {
		
		//    1
		//  2 3 2
		//3 4 5 4 3
		//  2 3 2
		//    1
		
		int n = 3;
		int str = 1;
		int space = n/2;
		int val = 1;
		
		
		for(int i = 1; i<=n ; i++) {
			
		for(int j = 1; j<= space; j++) {
			System.out.print(" ");
		}
		
		for(int k = 1; k<=str; k++) {
			System.out.print(val);
			if(k<str/2+1) {
				val++;
			}else {
				val--;
			}
		}
		
		if(i<=n/2) {
			space--;
			str=str+2;
			val++;
		}else {
			space++;
			str=str-2;
			val--;
		}
		System.out.println();
		
		}
		
	}

}
