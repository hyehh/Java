package com.javalec.base;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 입력한 수의 factorial 구하기
		
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		int fac = 1;
		
		System.out.print("Input your decimal no. : ");
		num = scanner.nextInt();		
		
		// +일 경우

		
		for(int i=1; i<=num; i++) {
			fac *= i;
		}
		
		System.out.println(num + "'s factorial value = " + fac);
		
		// -일 경우
		
		
		for(int i=num; i<=1; i--) {
			fac *= i;
		}
		
		System.out.println(num + "'s factorial value = " + fac);

		
		
		
	}

}
