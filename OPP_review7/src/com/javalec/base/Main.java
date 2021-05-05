package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.FourFinal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		Scanner scanner = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		
		System.out.print("첫 번째 숫자를 입력하세요 : ");
		num1 = scanner.nextInt();
		System.out.print("첫 번째 숫자를 입력하세요 : ");
		num2 = scanner.nextInt();
		
		System.out.println(">>>>>>> 결과 <<<<<<<");
		
		FourFinal fourFinal = new FourFinal();
		
		int result1 = fourFinal.sumResult(num1, num2);
		int result2 = fourFinal.minusResult(num1, num2);
		int result3 = fourFinal.multipleResult(num1, num2);
		String result4 = fourFinal.divisionResult(num1, num2);
		
		System.out.println("덧셈 : " + result1);
		System.out.println("뺄셈 : " + result2);
		System.out.println("곱셈 : " + result3);
		System.out.println("나눗셈 : " + result4);
		
		
	}

}
