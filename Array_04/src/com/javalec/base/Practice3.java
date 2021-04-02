package com.javalec.base;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner scanner = new Scanner(System.in);
		int inputNumber = 0;
		int maxNumber = 0;
		int maxIndex = 0;
		
		System.out.print("입력할 숫자의 갯수 ? (100개 미만) : ");
		inputNumber = scanner.nextInt();
		
		if(inputNumber < 100) {
		int[] num = new int[inputNumber];
		
		
		System.out.println(inputNumber + "개의 숫자를 입력하세요!");
		
		for(int i=0; i<inputNumber; i++) {
			num[i] = scanner.nextInt();
			
		}
		
		// 최대값 구하기
		for(int i=0; i<inputNumber; i++) {
			if(maxNumber < num[i]) {
				maxNumber = num[i];
				maxIndex = i+1;
			}
		}
		System.out.println("입력한 숫자 중 최대값은 " + maxNumber + "이고 " + maxIndex + "번째 값 입니다.");
		}else {
			System.out.println("입력 값이 잘못되었습니다.");
		}
		
		
		// n번째 값 구하기

		
		
		
		
		
	}

}
