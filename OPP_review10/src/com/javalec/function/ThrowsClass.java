package com.javalec.function;

public class ThrowsClass {

	public ThrowsClass() {
		// TODO Auto-generated constructor stub
		
		doC();
	}
	
	private void doA() {
		System.out.println("doA");
		int[] number = {10, 20, 30, 40};
		System.out.println(number[4]);
		System.out.println("endA");
	}
	
	
	private void doB() {
		System.out.println("doB");
		try{
			doA();
		}catch(Exception e) {
			System.out.println("Exception은 여기");
			System.out.println(e.getMessage());
		}
//			final{
//			System.out.println("endB");
//		}
		System.out.println("endB");
		
	}
	
	
	private void doC() {
		System.out.println("doC");
		doB();
		System.out.println("endC");
	}
	
	
	
	
	
}
