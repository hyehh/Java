package com.javalec.function;

public class FirstSon extends MamaBag {

	public FirstSon() {
		// TODO Auto-generated constructor stub
	}
	
	public void takeChoco() {
		MamaBag.CHOCO = MamaBag.CHOCO - 1;
		if(MamaBag.CHOCO<0) {
			System.out.println("첫째는 초코파이 먹고 싶어요");
			
		}else {
			System.out.println("첫째는 초코파이 잘 먹었어요");
			
		}
	}
	
	
	
}
