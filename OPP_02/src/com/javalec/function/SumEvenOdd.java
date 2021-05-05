package com.javalec.function;

public class SumEvenOdd {

	
	int num = 0;
	
	
	public SumEvenOdd() {
		
	}
	
	public void sumCalc(int num1, int num2) {
		int sum = 0;
		for(int i=num1; i<=num2; i++) {
			sum += i;
		}
		num = sum;
		System.out.println(num1 + " ~ " + num2 + "의 합은 " + sum + "입니다.");
	}
	
	public void evenOdd() {
		int remainder = num % 2;
		String chk = "";
		if(remainder==0) {
			chk = "짝수";
		}else {
			chk = "홀수";
		}System.out.println(chk + "입니다.");
		
	}
	
}
