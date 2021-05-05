package com.javalec.function;

public class Child1 extends Origin {
	
	
	public Child1() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Child1(int rice, int bulgogi, int banana, int milk, int almond) {
		super(rice, bulgogi, banana, milk, almond);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calc() {
		// TODO Auto-generated method stub
		return rice+bulgogi+banana;
	}

}
