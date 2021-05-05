package com.javalec.base;

import java.util.Random;
import java.util.Scanner;

public class Review6 {
	public static void main(String[] args) {
		
		// 가위 바위 보
		Scanner scanner = new Scanner(System.in);
		int i=0;
		int computerResult = 0;
		int inputNumber =0;
		
		System.out.print("숫자를 입력하세요! : ");
		inputNumber = scanner.nextInt();
		
		if(inputNumber==1) {
			System.out.println("당신의 가위바위보 : 가위");
		}else if(inputNumber==2) {
			System.out.println("당신의 가위바위보 : 바위");
		}else{
			System.out.println("당신의 가위바위보 : 보");
		}
		
		
		
		Random random = new Random();
		i=random.nextInt(3);
		computerResult = i+1;
		
		if(computerResult==1) {
			System.out.println("컴퓨터의 가위바위보 : 가위");
		}else if(computerResult==2) {
			System.out.println("컴퓨터의 가위바위보 : 바위");
		}else {
			System.out.println("컴퓨터의 가위바위보 : 보");
		}
		
		if(inputNumber==computerResult) {
			System.out.println("비겼습니다.");
		}else if(inputNumber==1&&computerResult==3) {
			System.out.println("이겼습니다.");
		}else if(inputNumber>computerResult) {
			System.out.println("이겼습니다.");
		}else {
			System.out.println("졌습니다.");
		}
		
		
	}
}
