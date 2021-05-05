package com.javalec.base;

import java.util.Scanner;

public class Review8 {

	
	public static void main(String[] args) {
		
		// 선언
		Scanner scanner = new Scanner(System.in);
		int inputNumber = 0;
		
		// 처리
		System.out.print("Input your number : ");
		inputNumber = scanner.nextInt();
		
		for(int j=1; j <= 9; j++) {
		for(int i=inputNumber; i <= inputNumber+3; i++) {
			System.out.print(i + " X " + j + " = " + (i*j) + "\t");
		}
		System.out.println();
		}
		
		
	}
	
	
}
