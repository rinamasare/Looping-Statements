package com.LoopingStatements;

public class WPalindrome {
	
	public static void pali(int num) {
		
		int temp =num;
		int rev = 0;
		
		while(num != 0) {
			
			int res = num%10;
			 
			rev = (rev*10) + res;
			
			num = num/10;
			
		}
	if(rev == temp) {
		
		System.out.println("It is Palindrome");
		
	}else {
		
		System.out.println("It is not Palindrome");
	}
	
	
	}
	
	

}
