package com.javalec.base;

import com.javalec.function.AddResult;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=10, j=20;
		
		AddResult addResult = new AddResult(i,j);
		addResult.num1 = i;
		addResult.num2 = j;
		int sum = addResult.sum();
		System.out.println(sum);
		
		AddResult addResult2 = new AddResult(i, j);
		addResult2.num1 = i;
		addResult2.num2 = j;
		addResult2.sum2();
		
	}

}
