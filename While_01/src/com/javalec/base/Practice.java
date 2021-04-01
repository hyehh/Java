package com.javalec.base;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int number = 0;
		int num = 0;
		int tot = 0;
		
		System.out.print("몇 개의 숫자를 더할까요? : ");
		number = scanner.nextInt();
		System.out.println(number + "개의 숫자를 입력하세요.");
		
		for(int i=1; i<=number; i++) {
			num = scanner.nextInt();
			tot += num;
			}
		System.out.println(tot);
		
		
		
	}

}
