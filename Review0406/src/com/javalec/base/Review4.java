package com.javalec.base;

public class Review4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String과 StringBuilder의 측정 (타이머)
		
		String str1 = "a";
		
		long startTime1 = System.currentTimeMillis();
		
		for(int i=1; i<=50000; i++) {
			str1 += "a";
		}
		long endTime1 = System.currentTimeMillis();
		System.out.println("Terms1 : " + (endTime1 - startTime1));
		
		
		StringBuilder stringBuilder = new StringBuilder("a");
		
		long startTime2 = System.currentTimeMillis();
		
		for(int i=1; i<=50000; i++) {
			stringBuilder = stringBuilder.append("a");
		}
		long endTime2 = System.currentTimeMillis();
		System.out.println("Terms2 : " + (endTime2 - startTime2));
		
		
		
	}

}
