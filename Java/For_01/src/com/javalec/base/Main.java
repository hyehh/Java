package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		
		
		System.out.print("단을 입력하세요 : ");
		int dan = scanner.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.println(dan + " X " + i + " = " + String.format("%02d",(dan * i))); // %2d는 2자리의 10진수를 쓸꺼야! 라는 의미. 만약 %5d 라면 5자리로 나옴! 0을 쓰면 빈 자릿수는 0으로 채운다는 의미!
			
		}
		
		
		
	}

}
