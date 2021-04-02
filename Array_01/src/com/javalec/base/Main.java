package com.javalec.base;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	초기 값이 없는 배열 선언 및 데이터 추가하기 (사용자가 데이터 값을 직접 입력할 때)
		
		String[] str = new String[7];
		
		str[0] = "일요일";
		str[1] = "월요일";
		str[2] = "화요일";
		str[3] = "수요일";
		str[4] = "목요일";
		str[5] = "금요일";
		str[6] = "토요일";
		
		System.out.println(str);
		System.out.println(str[1]);
		System.out.println(str[1] + "," + str[3] + "," + str[5]);
		
		for(int i=0; i<str.length; i++) {
			//i<=str.length-1 써도 됨
			System.out.println(str[i]);
		}
		
		// 	초기 값이 있는 경우
		
		String[] sta = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
		
		System.out.println(sta);
		System.out.println(sta[1]);
		System.out.println(sta[1] + "," + sta[3] + "," + sta[5]);
		
		for(int i=0; i<sta.length; i++) {
			//i<=str.length-1 써도 됨
			System.out.println(sta[i]);
		}
		
	}

}
