package com.javalec.base;

import java.util.Scanner;

public class Review2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int startDan = 0;
		int endDan = 0;
		int storeDan = 0;
		int value = 0;
		
		
		System.out.print("시작 단을 입력해주세요 : ");
		startDan = scanner.nextInt();
		System.out.print("끝 단을 입력해주세요 : ");
		endDan = scanner.nextInt();
		
		if(startDan > endDan) {
			storeDan = startDan;
			startDan = endDan;
			endDan = storeDan;
		}

		
//		1번째 방법
//		for(int i=startDan; i<=endDan; i++) {
//			System.out.println("< " + i + "단 >");
//			
//				if(i % 2 == 0) {
//					
//					for(int j=2; j<=9; j+=2) {
//					System.out.println(i + " X " + j + " = " + String.format("%2d",(i*j)));
//					}
//				}else {
//					
//					for(int j=1; j<=9; j+=2) {
//					System.out.println(i + " X " + j + " = " + String.format("%2d",(i*j)));
//					}
//					
//			
//				}
//			System.out.println("---------------");
//		
//		
//	}
		
//		
//		2번째 방법
//		for(int i=startDan; i<=endDan; i++) {
//			System.out.println("< " + i + "단 >");
//
//			for(int j=1; j<=9; j++) {
//				if((i+j) % 2 == 0) {
//				System.out.println(i + " X " + j + " = " + String.format("%2d",(i*j)));
//				}
//			}
//			System.out.println("---------------");
//
//		}
//		
//		
		// 3번째 방
		for(int i=startDan; i<=endDan; i++) {
			System.out.println("< " + i + "단 >");

			value = (i % 2 == 0 ? 2 : 1);
			for(int j=value; j<=9; j+=2) {
				System.out.println(i + " X " + j + " = " + String.format("%2d",(i*j)));

			}
			System.out.println("---------------");

			
		}
		
		
		
		
	}
}
