package com.javalec.function;

public class SumEvenOdd {

	// 선언자
	
	
	// 생성자
	
	public SumEvenOdd() {
		
	}
	
	// Method 함수
	
	public int sumCalc(int num1, int num2) {
		int sum = 0;
		for(int i=num1; i<=num2; i++) {
			sum += i;
		}return sum;
		
	}
	
	public String evenOdd(int num) {
		int result = num % 2;
		String chk ="";
		if(result==0) {
			chk = "짝수";
		}else {
			chk = "홀수";
		}return chk;
	}
	
	
	
	
}
