package com.javalec.base;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long result = 1;
		
		for(int i=0; i<=10; i++) {
			
			
			System.out.println(10 + "^ " + String.format("%2d", i) + " = " + String.format("%15d",(result)));
			result *= 10;
		}
		
		
		
	}

}
