package com.javalec.base;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int number = 0;
		
		
		System.out.print("몇 단계의 피라미드로 구성할까 ? : ");
		number = scanner.nextInt();
		
		int res = 0;
		
		for(int i=1; i<=number; i++) {
			for(int j=1; j<=i; j++) {
			res++;
			System.out.print("#");
			
			}
			System.out.println();
		}
		
		
	
		
	}

}
