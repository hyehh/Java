package com.javalec.base;

import javax.swing.JOptionPane;

public class Calculation {

	//Field
	int num1, num2 = 0;
	
	//Constructor
	public Calculation() {
		// TODO Auto-generated constructor stub
	}

	public Calculation(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	//Method
	public String add() {
		String add = num1 + " + " + num2 + " = " + (num1+num2);
		return add;
	}
	
	public String minus() {
		String minus = num1 + " - " + num2 + " = " + (num1-num2);
		return minus;
	}
	
	public String multiple() {
		String multiple = num1 + " X " + num2 + " = " + (num1*num2);
		return multiple;
	}
	
	public String division() {
		String division = "";
		if(num1==0&&num2==0) {
			JOptionPane.showMessageDialog(null, "Not available. Please Choose another numer.");
		}else if(num1!=0&&num2==0) {
			JOptionPane.showMessageDialog(null, "Not available. Please Choose another numer.");
		}else {
			division = num1 + " / " + num2 + " = " + String.format("%.2f", (double)num1/num2);
		}
		return division;
	}
}
