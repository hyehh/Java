package com.javalec.base;

import java.util.Scanner;

public class Practice4Answer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int count = 0, search = 0;
		int[] number = new int[100];
		String message = "는 존재하지 않습니다.";
		
		
		System.out.print("입력한 숫자의 개수? :");
		count = scanner.nextInt();
		
		System.out.println(count + "개의 숫자를 입력하세요!");
		
		for(int i=0; i<count; i++) {
			System.out.print((i+1) + "의 숫자 :");
			number[i] = scanner.nextInt();
		}
		
		
		System.out.print("검색할 숫자는? :");
		search = scanner.nextInt();
		
		message = search + message;
		
		for(int i=0; i<count; i++) {
			if(number[i] == search) {
				message = (search + "의 위치는 " + (i+1) + "번째 입니다.");
				break;
			}
		}

		System.out.println(message);
	}

}
