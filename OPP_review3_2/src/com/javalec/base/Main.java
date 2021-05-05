package com.javalec.base;

import com.javalec.function.AddResult;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=10, j=20;
		
		AddResult addResult = new AddResult(i, j);
		int sum = addResult.result();
		System.out.println(sum);
		
		AddResult addResult2 = new AddResult(i, j);
		addResult2.resultPrint();
		}

}
