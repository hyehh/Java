package com.javalec.base;

import java.util.Scanner;

public class Review4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int inputNumber = 0;
		int[] score = new int[100];
		int search = 0;
		String message = "는 존재하지 않습니다.";
		
		System.out.print("입력할 숫자의 갯수? :");
		inputNumber = scanner.nextInt();
		
		System.out.println(inputNumber + "개의 숫자를 입력하세요! :");
		
		for(int i=0; i<inputNumber; i++) {
			System.out.print((i+1) + "의 숫자 :");
			score[i] = scanner.nextInt();
		}
		
		System.out.print("검색할 숫자는? :");
		search = scanner.nextInt();
		
		
		message = search + message;
		
		for(int i=0; i<inputNumber; i++) {
			if(search==score[i]) {
				message = search + "의 위치는 " + (i+1) + "번째 입니다.";
			break;
			}
			
		}
		
		System.out.println(message);
		
		
		
		
//		2번째 방
//		for(int i=0; i<inputNumber; i++) {
//			if(search==score[i]) {
//				message = ("의 위치는 " + (i+1) + "번째 입니다.");
//				break;
//			}
//		}
//		
//		System.out.println(search + message);

	}

}
