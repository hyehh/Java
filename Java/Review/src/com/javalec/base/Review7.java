package com.javalec.base;

import java.util.Scanner;

public class Review7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int inputNumber = 0;
		int value = 0;
		int sum = 0;
		
		System.out.print("Enter an integer (0~9) : ");
		inputNumber = scanner.nextInt();
		
		while(inputNumber !=0) {
//			value = inputNumber % 10;
//			sum += value;
			
			sum += inputNumber %10;
			inputNumber /= 10;
		}
		
		System.out.println("Sum of digits : " + sum);
		
		
		
		
	}

}
