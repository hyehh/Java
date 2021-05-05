package com.javalec.base;

import java.util.Random;

public class Review5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Random
		
		// 구 방법
		for(int i=1; i<=6; i++) {
			double d = Math.random();
			int a = (int)(d*3) + 1;
			System.out.println(a);
		}
		
		
		// 요즘 방법
		Random random = new Random();
		int i = random.nextInt(3);
		System.out.println(i+1);
		
		
		
		
	}

}
