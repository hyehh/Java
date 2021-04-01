package com.javalec.base;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int number = 0;
		
		System.out.print("Input your number : ");
		number = scanner.nextInt();
		
		for(int j=1; j<=9; j++) {
			for(int i=number; i<=(number+number-1); i++) {
				System.out.print(i + " X " + j + " = " + i*j + "\t");
			}
		System.out.println("");
		}
		
		
		
	}

}
