package com.javalec.base;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int[] input= new int[7];
		int tot = 0;
		double avg = 0.0;
		
		
		System.out.println("계산할 숫자 7개를 넣으세요.");
		
		for(int i=0; i<input.length; i++) {
			input[i]= scanner.nextInt();
		
		}
		
		for(int i = 0; i<input.length; i++) {
			tot += input[i];
		}
		
		avg = (double) tot / input.length;
		
		
		System.out.println("귀하가 입력한 정보는 다음과 같습니다.");
		System.out.println("----------------------------");
		
		for(int i=0; i<input.length; i++) {
		System.out.print(input[i] + "\t");
		}
		
		System.out.println();
		System.out.println("입력한 정보의 총합은 " + tot + "입니다.");
		System.out.println("입력한 정보의 평균은 " + String.format("%.2f", avg) + "입니다.");

	}

}
