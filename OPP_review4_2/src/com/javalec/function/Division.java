package com.javalec.function;

public class Division {

	String message = "";
	
	public Division() {
		// TODO Auto-generated constructor stub
	}
	
	public void divisionResult(int i, int j) {
		if(i==0&&j==0) {
			message = "error";
		}else if(i!=0&&j==0) {
			message = "error";
		}else {
			message = Double.toString((double)i/j);
		}
		
		System.out.println(i + " / " + j + " = " + message);

	}
	
	
	
}
