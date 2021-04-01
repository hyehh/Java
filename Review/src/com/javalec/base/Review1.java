package com.javalec.base;

import java.util.Scanner;

public class Review1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 입력한 한 자릿수 정수 합 구하기 (for 사용)
		
		Scanner scanner = new Scanner(System.in);
		int inputNumber = 0;
		int number = 0;
		int sum = 0;
		
		System.out.print("Enter an integer(0~9) : ");
		inputNumber = scanner.nextInt();
		
		for(int i=inputNumber; i!=0; i/=10) {
			number = i % 10;
			sum += number;
			
		}
		System.out.print("Sum of digits : " + sum);
		
		
		
	}

}
