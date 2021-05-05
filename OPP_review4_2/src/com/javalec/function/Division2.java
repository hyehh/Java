package com.javalec.function;

public class Division2 {

	public Division2() {
		// TODO Auto-generated constructor stub
	}
	
	public void divisionResult2(int i, int j) {
		if(i==0&&j==0) {
			System.out.println(i + " / " + j + " = 오류입니다.");
		}else if(i!=0&&j==0) {
			System.out.println(i + " / " + j + " = 오류입니다.");			
		}else {
			System.out.println(i + " / " + j + " = " + ((double)i/j));
		}
	}
	
	
}
