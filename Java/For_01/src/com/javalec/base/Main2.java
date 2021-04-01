package com.javalec.base;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);
		int startdan = 0;
		int enddan = 0;
		
		System.out.print("구구단 시작 범위를 입력해주세요 : ");
		startdan = scanner.nextInt();
		System.out.print("구구단 끝 범위를 입력해주세요 : ");
		enddan = scanner.nextInt();
		
		/*
		 * 		
		 * 
		 * 
		 * 
		Scanner scanner = new Scanner(System.in);

		System.out.print("구구단 시작 범위를 입력해주세요 : ");
		int startdan = scanner.nextInt();
		System.out.print("구구단 끝 범위를 입력해주세요 : ");
		int enddan = scanner.nextInt();
		
		
		 * 
		 * 
		 */
		
	
		// 시작과 끝을 자동으로 변환
		
		
		
		
		// 사용자의 입력 정보 Check
		
		if (startdan > enddan) {
			System.out.println("입력 정보를 확인하세요!");
		}else {
		for(int dan = startdan; dan <= enddan; dan++) {

			
			System.out.println("<---- " + dan + "단 ---->");

		
			for(int i =1; i<=9; i++) {
//				네스티드 포문 이중 포문
				
				
				System.out.println(dan + "X" + i + " = " + String.format("%2d", (dan * i)));
				

			}
		
			System.out.println("---------------------");
		
		}
		}
		
		
		
		
		
	}

}
