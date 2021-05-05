package com.javalec.function;

public class AddResult {
	
	// Costructor로 호출하기
	
	// Field
	int num1, num2;

	// Constructor
	public AddResult(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	
	
	// Method
	public int result(){
		int sum = num1 + num2;
		return sum;
		// return num1 + num2 라고 적어도 됨! 
	}
	
	
	public void resultPrint() {
		int sum = num1 + num2;
		System.out.println(sum);
	}

}
