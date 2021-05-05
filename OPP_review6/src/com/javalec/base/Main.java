package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.SumOfDigits;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int inputNumber = 0;
		
		System.out.print("Enter an integer(0~9) : ");
		inputNumber = scanner.nextInt();
		
		SumOfDigits digits =  new SumOfDigits();
		int result = digits.result(inputNumber);
		System.out.println("Sum of digits : " + result);
		
		
	}

}
