package com.javalec.base;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 입력한 수의 factorial 구하기 (예: 4! = 4 * 3 * 2 * 1)
		
		// 선언
		Scanner scanner = new Scanner(System.in);
		int number = 0;
		int factorial = 1;
		
		// 처리
		System.out.print("Input your decimal no. : ");
		number = scanner.nextInt();
		
		for(int i=1; i<=number; i++) {
			factorial = factorial * i;
		}
		
		// 출력
		System.out.println(number + "'s factorial value = " + factorial);
		
		
		
		
		
	}

}
