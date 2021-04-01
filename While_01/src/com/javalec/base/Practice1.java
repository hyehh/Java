package com.javalec.base;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int inputNumber = 0;
		int number = 0;
		int tot = 0;
		
		System.out.print("몇 개의 숫자를 더할까요? : ");
		inputNumber = scanner.nextInt();
		System.out.println(inputNumber + "의 숫자를 입력하세요.");
		
		while(inputNumber != 0) {
			number = scanner.nextInt();
			inputNumber -= 1;
			tot += number;
			
		}
		
		
		System.out.println(tot);
		
		
	}

}
