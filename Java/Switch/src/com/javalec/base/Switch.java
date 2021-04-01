package com.javalec.base;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// if문과 switch
		// 선언문
		Scanner scanner = new Scanner(System.in);
		int inputNumber = 0;
		String result = "";
		
		// 처리
		System.out.print("숫자를 입력하세요!");
		inputNumber = scanner.nextInt();
		
		if(inputNumber % 2 == 0) {
			result = "짝수";
		}else {
			result = "홀수";
		}
		
		// 출력
		System.out.println("입력하신 숫자 " + inputNumber + "는 " + result + "입니다.");
		
	}

}
