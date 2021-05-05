package com.javalec.base;

import java.util.Scanner;

public class Hyeji {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		
		System.out.println("Enter an interger(0~9) : ");
		num = scanner.nextInt();
		
		for(int i=num; i != 0; i /= 10) {
			sum = sum + (i%10);
		}
		
		System.out.println(sum);
		
	}

}
