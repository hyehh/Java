package com.javalec.base;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Exercise
		// 원하시는 단을 입력하세요 : 7
		// 7 X 2 = 14
		// 7 X 4 = 28
		// 7 X 6 = 32
		// 7 x 8 = 56
		
		Scanner scanner = new Scanner(System.in);
		int dan = 0;
		
		System.out.print("원하시는 단을 입력하세요 : ");
		dan = scanner.nextInt();
		
		for(int i=2; i<=9; i += 2) {
			System.out.println(dan + " X " + i + " = " + (dan*i));
		}
		
		
		
	}

}
