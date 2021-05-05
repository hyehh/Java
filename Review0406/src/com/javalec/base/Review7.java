package com.javalec.base;

public class Review7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 123;
		String str1 = "123";
		String str2 = "abc";
		
		// 정수를 문자열로 바꾸겠다!
		String str3 = Integer.toString(num1);
		
		System.out.println(str1 + str3);
		
		//문자열을 정수로 바꾸겠다!
		int num2 = Integer.parseInt(str1);
		System.out.println(num1+num2);
		
		//실수 값을 문자열로 바꾸겠다!
		Double.toString(num2);
		
	}

}
