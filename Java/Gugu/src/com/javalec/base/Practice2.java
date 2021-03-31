package com.javalec.base;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 선언
		Scanner scanner = new Scanner(System.in);
		int dan = 0;
		int result = 0;
		
		// 처리
		System.out.print("원하시는 단을 입력하세요 : ");
		dan = scanner.nextInt();
		
		
		//version1
		for(int i=1; i<=9; i++) {
			if(i % 2 == 0) {
				System.out.println(dan + " X " + i + " = " + (dan*i));
			}else {
				System.out.println(dan + " X _ = " + (dan*i));
			}
		}
		
		//version2

		for(int i=1; i<=9; i++) {
			System.out.println(dan + " X " + (i % 2 == 0 ? i : "_") + " = " + (dan*i));
		}
		
		
		for(int i=1; i<=9; i++) {
			
		}
		
		
	}

}
