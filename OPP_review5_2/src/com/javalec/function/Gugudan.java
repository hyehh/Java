package com.javalec.function;

public class Gugudan {

	int num1;

	public Gugudan(int num1) {
		super();
		this.num1 = num1;
	}
	
	public void result() {
		for(int i=1; i<=9; i++) {
			System.out.println(num1 + " X " + i + " = " + (num1*i));
		}
	}
	
	
	
	public void result2() {
		for(int i=1; i<=9; i++) {
			if(i%2==0) {
				System.out.println(num1 + " X " + "*" + " = " + (num1*i));
				
			}else {
				
				System.out.println(num1 + " X " + i + " = " + (num1*i));
			}
		}
	}
	
	
}
