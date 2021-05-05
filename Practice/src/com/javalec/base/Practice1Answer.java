package com.javalec.base;

import java.util.Scanner;

public class Practice1Answer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 선언
		Scanner scanner = new Scanner(System.in);
		int[] score = new int[10];
		int[] histo = new int[10];
		
//		// histo에 대한 초기 작업
//		for(int i=0; i<histo.length; i++) {
//			histo[i] = 0;
//		}
//		
		
		
		System.out.println("Input score :");
		
		for(int i=0; i<score.length; i++) {
			System.out.print((i+1) + "의 score :");
			score[i] = scanner.nextInt();
			histo[score[i] / 10]++;
//			histo[score[i] / 10] += 1;
		}
		
		scanner.close();
		
//		확인하기
//		for(int i=0; i<score.length; i++) {
//			System.out.println(score[i]);
//		}
//		

		
//		점수를 입력 받으면서 배열의 갯수 정한 것 확인하기
//		for(int i=0; i<histo.length; i++) {
//			System.out.println(histo[i]);
//		}
		
		
		// 출력하기
		System.out.println("----- Histogram -----");
		
		for(int i=(score.length-1); i>=0; i--) {
			System.out.print(String.format("%3d : ", i*10));
			
			for(int j=1; j<=histo[i]; j++) {
				System.out.print("#");
			}
			
			System.out.println();
		}
		
	}

}
