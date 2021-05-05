package com.javalec.base;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int inputNumber = 0;
		int[] number = new int[inputNumber];
		int searchNumber = 0;
		int index = 0;
		
		System.out.print("입력할 숫자의 갯수? :");
		inputNumber = scanner.nextInt();
		
		System.out.println(inputNumber + "개의 숫자를 입력하세요!");
		
		for(int i=1; i<=inputNumber; i++) {
			System.out.print(i + "의 숫자 :");
			number[i] = scanner.nextInt();
		}
		
		System.out.print("검색할 숫자는? :");
		searchNumber = scanner.nextInt();
		
		for(int i=1; i<=inputNumber; i++) {
			if(searchNumber==number[i]) {
				index++;
			}
		 
		}
		
		if(index!=0) {
			System.out.println(searchNumber + "의 위치는 " + index + "번째 입니다.");
		}else {
			System.out.println(searchNumber + "는 존재하지 않습니다.");
		}
//		for(int i=1; i<=inputNumber; i++) {
//			if(searchNumber==number[i]) {
//				result = i;
//			}
//			
//		}
//		System.out.println(searchNumber + "의 위치는 " + result + "번째 입니다.");
//		
		
	}

}
