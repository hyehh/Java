package com.javalec.function;

public class SumOfDigits {

	public int num1;

	public SumOfDigits(int num1) {
		super();
		this.num1 = num1;
	}
	
	public int result() {
		int tot = 0;
		for(int i=num1; i!=0; i/=10) {
			tot += i%10;
		}return tot;
	}
	
	
	
}
