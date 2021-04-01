package com.javalec.base;


public class Review6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		int i = 1;
		
		
		while(i<=100) {
 			sum +=i;
 			i++;
		}

		System.out.println(sum);
		
		
		while(true) {
			sum +=i;
			i++;
			if(i>100) {
				break;
			}

		}
		System.out.println(sum);
		
		
		
	}

}
