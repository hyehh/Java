package com.javalec.function;

public abstract class Origin {
	
	// Field
	public int rice;
	public int bulgogi;
	public int banana;
	public int milk;
	public int almond;
	
	
	// Constructor
	public Origin() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Origin(int rice, int bulgogi, int banana, int milk, int almond) {
		super();
		this.rice = rice;
		this.bulgogi = bulgogi;
		this.banana = banana;
		this.milk = milk;
		this.almond = almond;
	}




	// Method
	public abstract int calc();
	
	
	
}
