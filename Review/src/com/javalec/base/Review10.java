package com.javalec.base;

import java.util.Scanner;

public class Review10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);
		int[] input = new int[5];
		int tot = 0;
		double avg = 0.0;
	
		System.out.println("계산할 숫자 5개를 넣으세요.");
		
		for(int i=0; i<5; i++) {
		input[i] = scanner.nextInt();
		
		}
		
		System.out.println("귀하가 입력한 정보는 다음과 같습니다.");
		System.out.println("----------------------------");
		
		// 정보 출력하기
		for(int i=0; i<5; i++) {
			
			System.out.print(input[i] + "\t");
			}
		System.out.println();
		// 총합 구하기
		
		for(int i=0; i<5; i++) {
			tot += input[i];
		}
	

		System.out.println("입력한 정보의 총합은 " + tot + "입니다.");
		
		//평균 구하기
		
		avg = (double) tot / 5;
		
		System.out.println("입력한 정보의 평균은 " + String.format("%.2f", avg) + "입니다.");
		
	}

}
