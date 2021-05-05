package com.javalec.function;

public class Division {

	String message = "";
	
	
	public Division() {
		// TODO Auto-generated constructor stub
	}
	
	
	public String divisionResult(int i, int j) {
		if(i==0&&j==0) {
			message = "error";
		}else if(i!=0&&j==0) {
			message = "error";			
		}else {
			double result = 0.0;
			result = (double)i/j;
			message = Double.toString(result);
		}
		
		
		
		return message;
	}
	
	
}
