package com.javalec.base;

import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int inputNumber = 0;
		int[] data = new int[100];
		int where = 0;
		int number = 0;
		
		
		System.out.print("입력할 숫자의 갯수? :");
		inputNumber = scanner.nextInt();
		
		System.out.println(inputNumber + "개의 숫자를 입력하세요! :");
		
		for(int i=0; i<inputNumber; i++) {
			System.out.print((i+1) + "의 숫자 :");
			data[i] = scanner.nextInt();
		}
		
		System.out.print("숫자를 삽입하고자 하는 위치는 ? :");
		where = scanner.nextInt();
		
		System.out.print("삽입하고자 하는 숫자는? :");
		number = scanner.nextInt();
		
		for(int i=inputNumber-1; i>=where-1; i--) {
			data[i+1] = data[i];
			
		}
		
		data[where-1] = number;
		
		System.out.println("------- 결과 -------");
		for(int i=0; i<=inputNumber; i++) {
			System.out.println(data[i]);
		}
		

		
	}
	
		

}
