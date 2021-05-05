package com.javalec.base;

import java.util.Scanner;

public class Review2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int number = 0;
		int result = 0;
		
		System.out.print("몇 단계의 피라미드로 구성할까 ? : ");
		number = scanner.nextInt();
		
		for(int i=1; i<=number; i++) {
			for(int j=1; j<=i; j++) {
				result++;
				System.out.print(String.format("%3d", result) + "\t");
			}System.out.println();
		}
		
		
	}

}
