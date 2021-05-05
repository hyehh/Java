package com.javalec.function;

public class Gugudan {

	public Gugudan() {
		// TODO Auto-generated constructor stub
	}
	
	public void result(int i) {
		for(int j=1; j<=9; j++) {
			System.out.println(i + " X " + j + " = " + (i*j));
		}
	}
	
	public void result2(int i) {
		for(int j=1; j<=9; j++) {
			if(j%2==0) {
				System.out.println(i + " X " + "*" + " = " + (i*j));
			}else {
				System.out.println(i + " X " + j + " = " + (i*j));
				
			}

		}
	}
	
}
