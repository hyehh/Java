package com.javalec.function;

public class FourFinal {
	
	String message = "";
	
	public FourFinal() {
		// TODO Auto-generated constructor stub
	}
	
	
	// 덧셈
	public int sumResult(int i, int j) {
		return i+j;
	}
	
	// 뺄셈
	public int minusResult(int i, int j) {
		return i-j;
	}
	
	// 곱셈
	public int multipleResult(int i, int j) {
		return i*j;
	}
	
	// 나눗셈
	public String divisionResult(int i, int j) {
		if(i==0&&j==0) {
			message = "error";
		}else if(i!=0&&j==0) {
			message = "error";
		}else {
			message = Double.toString((double)i/j);
		}return message;
	}
	
}
