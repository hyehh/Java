package com.javalec.base;

import java.util.Scanner;

public class answer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int num = 0;
		int re = 0;
		
		System.out.print("Enter an integer(0~9) : ");
		num = scanner.nextInt();
		
		
		for(int i=num; i>0; i/=10) {
			sum = (i%10);
			re += sum;
		}
		System.out.println(re);
	}

}
