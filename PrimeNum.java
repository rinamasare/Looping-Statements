package com.LoopingStatements;

public class PrimeNum {
	
	public static void print(int num) {
		
		int cnt =0;
		for(int i=1; i<=num; i++) {
			
			if(num%i ==0) {
				
				cnt++;
			}
		}
			
			if(cnt == 2 ) {
				
				System.out.println("Prime NUmber");
				
			}else {
				
				System.out.println("Composite number");
			}
			
			
		}
		
	}


