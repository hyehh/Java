package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.Gugudan;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int inputNumber = 0;
		
		System.out.print("구구단에 출력할 숫자를 입력하세요 : ");
		inputNumber = scanner.nextInt();
		
		Gugudan gugudan = new Gugudan(inputNumber);
		gugudan.result();
		gugudan.result2();
		
	}

}
