package com.javalec.base;

import java.util.Scanner;

public class Minus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 선언
		Scanner scanner = new Scanner(System.in);
		int number = 0;
		int factorial = 1;
		
		// 처리
		System.out.print("Input your decimal no. : ");
		number = scanner.nextInt();
		
		for(int i=number; i>0; i--) {
			factorial *= i;
		}

		
		// 출력
		System.out.println(number + "'s factorial value = " + factorial);
	}

}
