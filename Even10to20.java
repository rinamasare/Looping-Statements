package com.LoopingStatements;

public class Even10to20 {
	
	public void print() {
		
		for(int i =10; i<=20 ; i++) {
			
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
	
	
public static void main(String [] args) {
		
		Even10to20 e1 = new Even10to20();
		e1.print();
	}

}
