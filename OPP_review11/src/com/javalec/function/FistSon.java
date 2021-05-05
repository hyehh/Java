package com.javalec.function;

public class FistSon extends MamaBag {

	// Field
	
	// Constructor
	public FistSon() {
		// TODO Auto-generated constructor stub
	}
	
	// Method
	public void takeChoco() {
		MamaBag mamaBag = new MamaBag();
		mamaBag.choco = mamaBag.choco -1;
		if(mamaBag.choco<0) {
			System.out.println("첫째는 초코파이 먹고 싶어요");
		}else {
			System.out.println("둘째는 초코파이 잘 먹었어요");
		}
	}
	
	
	
	
}
