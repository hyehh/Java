package com.javalec.base;

public class Review2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 원래 String의 모양은 이런 모양!
		
		String string = new String("abcdef");
		
		// String의 문제점을 해결하기 위해 나온 문자열 선언자들
		StringBuilder stringBuilder = new StringBuilder("abcdef");
		
		// 현재의 데이터 뒤에 덧붙이기
		stringBuilder.append("ghijklmn");
		System.out.println(stringBuilder);
		
		// 3번지에 zzzz를 추가하기
		stringBuilder.insert(3, "zzzz");
		System.out.println(stringBuilder);
		
		// 3번지부터 6번지까지 삭제하기! (7번지 이전까지!)
		stringBuilder.delete(3, 7);
		System.out.println(stringBuilder);
		
		
		StringBuffer stringBuffer = new StringBuffer("abcdef");
		
		// 현재의 데이터 뒤에 덧붙이기
		stringBuffer.append("ghijklmn");
		System.out.println(stringBuffer);
		
		// 3번지에 zzzz를 추가하기
		stringBuffer.insert(3, "zzzz");
		System.out.println(stringBuffer);
		
		// 3번지부터 6번지까지 삭제하기! (7번지 이전까지!)
		stringBuffer.delete(3, 7);
		System.out.println(stringBuffer);
	}

}
