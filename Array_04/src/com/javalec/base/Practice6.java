package com.javalec.base;

import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);
		int inputNumber = 0;
		int maxNumber = 0;
		int maxIndex = 0;
		
		System.out.print("입력할 숫자의 갯수 ? (100개 미만) : ");
		
		inputNumber = scanner.nextInt();
		
		while(inputNumber>=100) {
			System.out.print("숫자가 올바르지 않습니다. 다시 입력해주세요.");
			inputNumber = scanner.nextInt();
		}
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
		}
		
		
		
	

}
