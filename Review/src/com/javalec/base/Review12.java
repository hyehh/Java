package com.javalec.base;

import java.util.Scanner;

public class Review12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] name = {"James", "Cathy", "Kenny", "Martin", "Crystal"};
		int[] height = new int[name.length];
		int tot = 0;
		double avg = 0.0;
		int maxHeight = 0;
		int maxName = 0;
		int minHeight = 500;
		int minName = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<name.length; i++) {
		System.out.print(name[i] + "의 신장을 입력하세요!");
		height[i] = scanner.nextInt();
		}
		
		// 합계 신장 구하기
		
		for(int i=0; i<name.length; i++) {
			tot += height[i];
		}
		
		// 평균 신장 구하기
		avg = (double) tot / name.length;
		
		// 최대 구하기
		for(int i=0; i<name.length; i++) {
		if(maxHeight < height[i]) {
			maxHeight = height[i];
			maxName = i;
		}
		}
		
		// 최소 구하기
		
		for(int i=0; i<name.length; i++) {
		if(minHeight > height[i]) {
			minHeight = height[i];
			minName = i;
		}
		}
		
		// 출력하기 
		System.out.println("평균신장은 : " + String.format("%,2f", avg));
		System.out.println("가장 큰 학생은 " + name[maxName] + "이고 그 학생의 키는 " + maxHeight);
		System.out.println("가장 작 학생은 " + name[minName] + "이고 그 학생의 키는 " + minHeight);
	}

}
