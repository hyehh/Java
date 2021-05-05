package com.javalec.function;

public class AddResult {

	// Field 값으로 호출하기
	
	// Field
	public int num1, num2;

	// Constructor
	public AddResult(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	
	// Method
	public int sum() {
//		int result = num1 + num2;
		return num1 + num2;
	}
	
	public void sum2() {
		System.out.println(num1 + num2);
	}
	
	
}
