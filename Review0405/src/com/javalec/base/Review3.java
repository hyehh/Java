package com.javalec.base;

import java.util.Scanner;

public class Review3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner = new Scanner(System.in);
		int inputNumber = 0;
		int[] number = new int[100];
		int search = 0;
		int data = 0;

		System.out.print("입력할 숫자의 개수? :");
		inputNumber = scanner.nextInt();
		
		System.out.println(inputNumber + "개의 숫자를 입력하세요! :");
		
		for(int i=0; i<inputNumber; i++) {
			System.out.print((i+1) + "의 숫자 :");
			number[i] = scanner.nextInt();
		}
		
		System.out.print("검색할 숫자는? :");
		search = scanner.nextInt();
		
		
		for(data=0; data<inputNumber; data++) {
			if(search == number[data]) {
			System.out.println(search + "의 위치는 " + (data+1) + "번째 입니다.");
			break;
		}
		}
		
		if(data==inputNumber) {
			System.out.println(search + "는 존재하지 않습니다.");
		}
		
		
	}
	
}
