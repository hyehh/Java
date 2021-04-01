package com.javalec.base;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 선언
		
		Scanner scanner = new Scanner(System.in);
		int grade = 0;
		String result = "";
		
		
		// 처리
		System.out.println("성적을 입력하세요!");
		grade = scanner.nextInt();
		
		if(grade>100 || grade < 0) {
			result = "error";
		}else {
			switch(grade / 10) {
				case 10:
				case 9:
					result = "A";
					break;
				case 8:
					result = "B";
					break;
				case 7:
					result = "C";
					break;
				case 6:
					result = "D";
					break;
				default:
					result = "F";
					break;
					
			}
			
		}
		
		
		
		System.out.println("당신의 학점은 " + result + "입니다.");

		
	}

}
