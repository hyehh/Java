package com.javalec.base;

import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner = new Scanner(System.in);
		int number = 0;
		
		System.out.print("단을 입력하세요 : ");
		number = scanner.nextInt();
		
		
		for(int i = 1; i <= 9; i+=3) {
			
			System.out.print(number + " X " + i + " = " + (number*i) + "\t");
			System.out.print(number + " X " + (i+1) + " = " + (number*(i+1)) + "\t");
			System.out.print(number + " X " + (i+2) + " = " + (number*(i+2)) + "\n");
			
		}
		
	}

}
