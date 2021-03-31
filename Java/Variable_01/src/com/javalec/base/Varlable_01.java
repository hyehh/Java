package com.javalec.base;

public class Varlable_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수(Variable)
		// 문자열 변수 선언
		String str = "Hello, World!"; // 변수 선언
		
		
		System.out.println(str);
		System.out.println(str);

		str = "abc";
		System.out.println(str);
		
		
		// 정수 변수 선언
		int num1 = 10;
		int num2 = 20;
		int plusResult;
		
		plusResult = num1 + num2;

		
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println((double)num1 / num2);
		System.out.println((double)(num1 / num2));  // 변환 의미 없음
		// 괄호 먼저 계산하기에 이미 0으로 나온 수를 실수로 바꾸는 건 의미 없음
		
		System.out.println(plusResult);
		// 선언 부분(int같은 경우)은 위에 있는 게 좋음
		
		num1 = 100;
		// num1 = "abc"; 는 불가능! 정수 변수는 정수만 가능!
		
		// ---- Exercise
		int startNum = 40, endNum = 60;
		
		/*
		 30과 40의 덧셈 결과는 70 입니다.
		 30과 40의 뺄셈 결과는 -10 입니다.
		 30과 40의 곱셈 결과는 1200 입니다.
		 30과 40의 나눗셈 중 몫은 0 입니다.
		 30과 40의 나눗셈 중 결과 ___ 입니다.
		 30과 40의 덧셈결과와 뺄셈 결과의 곱은 ___ 입니다.
		 */
		
		System.out.println(startNum + "과 " + endNum + "의 덧셈 결과는 " + (startNum + endNum) + " 입니다.");
		System.out.println(startNum + "과 " + endNum + "의 뺄셈 결과는 " + (startNum - endNum) + " 입니다.");
		System.out.println(startNum + "과 " + endNum + "의 곱셈 결과는 " + (startNum * endNum) + " 입니다.");
		System.out.println(startNum + "과 " + endNum + "의 나눗셈 중 몫은 " + (startNum / endNum) + " 입니다.");
		System.out.println(startNum + "과 " + endNum + "의 나눗셈 중 결과는 " + ((double)startNum / endNum) + " 입니다.");
		System.out.println(startNum + "과 " + endNum + "의 덧셈결과와 뺄셈 결과의 곱은 " + ((startNum + endNum) * (startNum - endNum))+ " 입니다.");
		
		
		

		
		
		
		


	}

}
