package com.javalec.base;

import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int inputNumber = 0;
		int[] data = new int[100];
		int delete = 0;
		
		System.out.print("입력할 숫자의 갯수? :");
		inputNumber = scanner.nextInt();
		
		System.out.println(inputNumber + "개의 숫자를 입력하세요!:");
		
		for(int i=0; i<inputNumber; i++) {
			System.out.print((i+1) + "의 숫자 :");
			data[i] = scanner.nextInt();
		}
		
		System.out.print("몇번째의 숫자를 삭제 하시겠습니까? :");
		delete = scanner.nextInt();
		
		// 삭제
		for(int i=delete; i<inputNumber; i++) {
			data[i-1] = data[i];
		}
		
		
		System.out.println("------- 결과 -------");
		for(int i=0; i<inputNumber-1; i++) {
		System.out.println(data[i]);
		}
		
	}

}
