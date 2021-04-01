package com.javalec.base;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 선언
		Scanner scanner = new Scanner(System.in);
		int start = 0;
		int end = 0;
		int store = 0;
		int value = 0;
		
		//처리
		System.out.print("시작 단을 입력해주세요 : ");
		start = scanner.nextInt();
		System.out.print("끝 단을 입력해주세요 : ");
		end = scanner.nextInt();
		
		if(start > end) {
			store = start;
			start = end;
			end = store;
			
		}
		
		for(int dan = start; dan <= end; dan++) {
			System.out.println("<--- " + dan + "단 --->");
			value = (dan % 2 == 0?2:1);
			for(int i=value; i<=9; i+=2) {
				System.out.println(dan + " X " + i + " = " + (dan*i));

			}
			
			
		
		
		}

		
		
		
	}

}
