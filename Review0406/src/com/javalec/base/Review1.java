package com.javalec.base;


public class Review1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		String str1 = "abcdefg";
		String str2 = "HIJKLMN";
		String str3 = "opqrstu";
		String str4 = " abc def ghi ";
		
		// 문자열 연결 방식
		System.out.println(str1.concat(str2));
		
		// 3번자부터 시작
		System.out.println(str1.substring(3));
		
		// 3번지부터 5번지 이전까지 춣력
		System.out.println(str1.substring(3, 5));
		
		// 길이
		System.out.println(str1.length());
		
		// 대문자 표시
		System.out.println(str1.toUpperCase());
		
		// 소문자 표시
		System.out.println(str1.toLowerCase());
		
		// 3번째 값만 출력하기
		System.out.println(str1.charAt(3));
		
		// str1을 알파벳 하나씩 출력하기
		for(int i=0; i<str1.length(); i++) {
			System.out.println(str1.charAt(i));
		}
		
		// c가 몇 번지에 있는지 출력하기
		System.out.println(str1.indexOf('c'));
		
		// 같은지 물어보기
		System.out.println(str1.equals(str4));
		
		// 앞 뒤의 space 제거
		System.out.println(str4.trim());
		
		// a를 Z로 바꾸기
		System.out.println(str1.replace('a', 'Z'));
		
		// replace 해줘도 본래의 str1값은 바뀌지 않는다
		System.out.println(str1);
		
		System.out.println(str1.replaceAll("abc", "ZZZZZ"));
		
	}

}
