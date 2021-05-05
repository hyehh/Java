package com.javalec.function;

public class SumOfDigits {

	public SumOfDigits() {
		// TODO Auto-generated constructor stub
	}
	
	
	public int result(int input) {
		int tot = 0;
		for(int i=input; i!=0; i/=10) {
			tot += i%10;
		}return tot;
	}
	
	
}
