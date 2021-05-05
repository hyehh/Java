package com.javalec.function;

public class FourFinal {

	public int i, j;
	String message = "";

	public FourFinal(int i, int j) {
		super();
		this.i = i;
		this.j = j;
	}
	
	// 덧셈
	public int sumResult() {
		return i + j;
	}
	
	
	// 뺄셈
	public int minusResult() {
		return i-j;
	}
	
	// 곱셈
	public int multipleResult() {
		return i*j;
	}
	
	// 나눗셈
	public String divisionResult() {
		if(i==0&&j==0) {
			message = "error";
		}else if(i!=0&&j==0) {
			message = "error";
		}else {
			message = Double.toString((double)i/j);
		}return message;
	}
	
	
	
	
}
