package com.javalec.function;

public class Division {

	public int num1, num2;
	String message = "";

	public Division(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public String divisionResult() {
		if(num1==0&&num2==0) {
			message = "error";
		}else if(num1!=0&&num2==0) {
			message = "error";
		}else {
			message = Double.toString((double)num1/num2);
		}return message;
	}
	
	
	
	
}
