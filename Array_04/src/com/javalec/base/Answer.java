package com.javalec.base;

import java.util.Scanner;

public class Answer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] name = {"James", "Cathy", "Kenny", "Martin", "Crystal"};
		int[] height = new int[name.length];
		int heightSum = 0;
		double heightAvg = 0.0;
		int heightMax = 0;
		int heightMaxIndex = 0;
		int heightMin = 1000;
		int heightMinIndex = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		// 사용자가 입력하는 신장 값 저장하기
		
		for(int i = 0; i < name.length; i++) {
			System.out.print(name[i] + "의 신장을 입력하세요!");
			height[i] = scanner.nextInt();
			// total 구하기
			heightSum += height[i];
			// 가장 큰 신장 구하기
			if(height[i] > heightMax) {
				heightMax = height[i];
				heightMaxIndex = i;
			}
			// 가장 작은 신장 구하기
			if(height[i] < heightMin) {
				heightMin = height[i];
				heightMinIndex = i;
			}
		
		}
		
		// 평균 구하기
		
		heightAvg = (double) heightSum / name.length;
	
		// 출력하기
		System.out.println("평균 신장 : " + String.format("%.2f", heightAvg));
		System.out.println("가장 큰 학생은 " + name[heightMaxIndex] + " 이고 그 학생의 키는 " + height[heightMaxIndex] + "입니다.");
		System.out.println("가장 작은 학생은 " + name[heightMinIndex] + " 이고 그 학생의 키는 " + height[heightMinIndex] + "입니다.");
	}

}
