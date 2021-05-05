package com.javalec.function;

public class SecondSon extends MamaBag {

	public SecondSon() {
		// TODO Auto-generated constructor stub
	}
	
	public void takeChoco() {
		MamaBag mamaBag = new MamaBag();
		mamaBag.choco = mamaBag.choco - 1;
		if(mamaBag.choco<0) {
			System.out.println("둘째는 초코파이 먹고 싶어요");
		}else {
			System.out.println("둘째는 초코파이 잘 먹었어요");
		}
	}
	
	
	
}
