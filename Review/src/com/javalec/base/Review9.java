package com.javalec.base;

public class Review9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] word = new String[7];
		
		word[0] = "일요일";
		word[1] = "월요일";
		word[2] = "화요일";
		word[3] = "수요일";
		word[4] = "목요일";
		word[5] = "금요일";
		word[6] = "토요일";
		
		for(int i=0; i<word.length; i++) {
		System.out.println(word[i]);
		
		}
		
		
		
		
		
		String[] str = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
		
		for(int i=0; i<str.length; i++) {
		System.out.println(str[i]);
		
		}
		
		
		for(int i=1; i<str.length; i+=2) {
		System.out.print(str[i] + "\t");
		
		
		}
		
		
	}

}
