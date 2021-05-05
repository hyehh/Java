package com.javalec.base;

import com.javalec.function.AddResult;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=10, j=20;
		
		// 가장 기본의 Main
		AddResult addResult1 = new AddResult();
		int sum1 = addResult1.add1(i, j);
		System.out.println(sum1);
		
		// 출력까지 처리
		AddResult addResult2 = new AddResult();
		addResult2.add2(i, j);
		
	}

}
