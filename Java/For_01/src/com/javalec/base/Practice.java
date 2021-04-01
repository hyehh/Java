package com.javalec.base;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner scanner = new Scanner(System.in);
		int startdan = 0;
		int enddan = 0;
		int temp = 0;
		
		System.out.print("구구단 시작 범위를 입력해주세요 : ");
		startdan = scanner.nextInt();
		System.out.print("구구단 끝 범위를 입력해주세요 : ");
		enddan = scanner.nextInt();

				
		// 사용자의 입력 정보 Check
		
		if (startdan > enddan) {
			// 시작과 끝을 자동으로 변환		
			temp = startdan;
			startdan = enddan;
			enddan = temp;
			
		}
		
		for(int dan = startdan; dan <= enddan; dan++) {

			
			System.out.println("<---- " + dan + "단 ---->");

		
			if(dan % 2 == 0) {
			
			for(int i =2; i<=9; i += 2) {				

				
				System.out.println(dan + "X" + i + " = " + String.format("%2d", (dan * i)));
				

			}}else{
				
			for(int i =1; i<=9; i += 2) {				

					
				System.out.println(dan + "X" + i + " = " + String.format("%2d", (dan * i)));
					

				
			}
		
			System.out.println("---------------------");
		
	
		}
		
		
	}
		
		
		
	}

}
